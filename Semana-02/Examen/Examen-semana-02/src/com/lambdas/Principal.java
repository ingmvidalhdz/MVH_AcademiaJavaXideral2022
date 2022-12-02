package com.lambdas;

import java.util.*;
import java.util.function.*;

public class Principal {

	public static void main(String[] args) {

		List<Vehiculo> listaVehiculos = new ArrayList<>();
		listaVehiculos.add(new Vehiculo("Dodge", "Charger 400", "Negro", -2));
		listaVehiculos.add(new Vehiculo("Volskwagen", "Gol", "Rojo", 2));
		listaVehiculos.add(new Vehiculo("Scannia", "K360C B4x2NB", "Azul", 3));
		listaVehiculos.add(new Vehiculo("Ford", "Fiesta 2012", "Verde", 2));
		listaVehiculos.add(new Vehiculo("Yamaha", "R6", "Azul c Gris", 1));
		listaVehiculos.add(new Vehiculo("Chevrolet", "Silverado", "Blanco", 2));
		listaVehiculos.add(new Vehiculo("Kenworth", "T680", "Amarrillo", 4));
		listaVehiculos.add(new Vehiculo("Man", "MAN TGS 33.540", "Negro", 0));
		listaVehiculos.add(new Vehiculo("Kawasaki", "Ninja 400", "Verde", 1));
		listaVehiculos.add(new Vehiculo("Ford", "Lobo 2021", "Negra", 2));

		System.out.println("\n/ / / VEHICULOS PESADOS / / /");
		PredicadoVehiculo pv = v -> v.getEjes() > 2;
		mostrarVehiculo(listaVehiculos, pv);

		System.out.println("\n/ / / VEHICULOS LIGEROS / / /");
		mostrarVehiculo(listaVehiculos, pvh -> pvh.getEjes() > 0 && pvh.getEjes() <= 2);

		System.out.println("\n/ / / VEHICULOS CON ERRORES AL ESCANEAR / / /");
		PredicadoVehiculo pv0 = v -> v.getEjes() <= 0;
		mostrarVehiculo(listaVehiculos, pv0);

		System.out.println("\n/ / / VEHICULOS DE COLOR NEGRO / / /");
		mostrarVehiculo(listaVehiculos, v1 -> v1.getColor().equals("Negro") || v1.getColor().equals("Negra"));

		System.out.println("\n---- LAMBDAS CON GENERICS ----");

		Vehiculo vehiculo1 = new Vehiculo("Ford", "Mustang", "Naranja", 2);

		Function<Vehiculo, String> f1 = vhf -> vhf.getColor();
		System.out.println("Vehiculo 1 es de color: " + f1.apply(vehiculo1));

		BiConsumer<String, Integer> concatStringInt = (a, b) -> System.out.println(a + " " + b);
		concatStringInt.accept("No. Ejes: ", vehiculo1.getEjes());

		BiPredicate<Vehiculo, Vehiculo> vehiculoPesado = (vhc1, vhc2) -> vhc1.getEjes() > vhc2.getEjes();
		System.out.println("Más pesado que un camion: "
				+ vehiculoPesado.test(vehiculo1, new Vehiculo("Kenworth", "T680", "Amarrillo", 4)));

		UnaryOperator<String> obtenerMarcaModelo = v -> v.concat(vehiculo1.getModelo());
		System.out.println("Del modelo y marca: " + obtenerMarcaModelo.apply(vehiculo1.getMarca()+" "));
	}

	public static void mostrarVehiculo(List<Vehiculo> lvh, PredicadoVehiculo pvh) {
		for (Vehiculo vh : lvh) {
			if (pvh.ejecutar(vh))
				System.out.println(vh.toString());
		}
	}

}
