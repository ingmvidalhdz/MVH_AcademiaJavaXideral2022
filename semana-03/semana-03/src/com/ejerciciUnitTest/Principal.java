package com.ejerciciUnitTest;

import java.util.ArrayList;
import java.util.List;

public class Principal {
	public static void main(String[] args) {
		Vehiculo v1 = new Vehiculo("Ford", "Lobo", "Azul", 2);
		Caseta ca = new Caseta();
		
		String cad = ca.cobrarPeaje(v1.getEjes());
		System.out.println(cad);
		
		List<Vehiculo> listaVehiculos = new ArrayList<>();
		listaVehiculos.add(new Vehiculo("Dodge", "Charger 400", "Negro", -2));
		listaVehiculos.add(new Vehiculo("Volskwagen", "Gol", "Rojo", 2));
		listaVehiculos.add(new Vehiculo("Scannia", "K360C B4x2NB", "Azul", 3));
		listaVehiculos.add(new Vehiculo("Ford", "Fiesta 2012", "Verde", 2));
		listaVehiculos.add(new Vehiculo("Yamaha", "R6", "Azul c Gris", 1));
		listaVehiculos.add(new Vehiculo("Chevrolet", "Silverado", "Blanco", 2));
		listaVehiculos.add(new Vehiculo("Kenworth", "T680", "Amarrillo", 4));
		listaVehiculos.add(new Vehiculo("Man", "MAN TGS 33.540", "Negro", 3));
		listaVehiculos.add(new Vehiculo("Kawasaki", "Ninja 400", "Verde", 1));
		listaVehiculos.add(new Vehiculo("Ford", "Lobo 2021", "Negra", 2));
		
		boolean erroneso = ca.compruebaVehiculosErroneos(listaVehiculos);
		System.out.println(erroneso);
	}
}
