package Caseta.v2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CasetaPeaje {

	static Scanner entrada = new Scanner(System.in);

	// Variables que nos ayudan a crear los objetos
	static int tipoAuto, ejes;
	static String color, marca, linea, categoria;

	public static void main(String[] args) {

		// Creación de una lista de objeto de tipo vehiculo
		List<Vehiculo> listaVehiculos = new ArrayList<>();

		// Llenado de la lista de manera dinamica
		System.out.println(" / / / CASETA / / /");
		System.out.println("Cuantos autos pasaran por la caseta de peaje: ");
		int tamanio = entrada.nextInt();

		for (int i = 0; i < tamanio; i++) {
			showMenu();
			tipoAuto = entrada.nextInt();
			switch (tipoAuto) {
			case 1:
				System.out.println("\n- - - Motocicleta - - -");
				System.out.print("Ingrese la marca de la motocicleta: ");
				marca = entrada.next();
				System.out.print("Ingrese el color de la motocicleta: ");
				color = entrada.next();
				listaVehiculos.add(new Motocicleta(color, marca));
				break;
			case 2:
				System.out.println("\n- - - Automóvil - - -");
				System.out.print("Ingrese la marca del automóvil: ");
				marca = entrada.next();
				System.out.print("Ingrese el color de la automóvil: ");
				color = entrada.next();
				listaVehiculos.add(new Automovil(color, marca));
				break;
			case 3:
				System.out.println("\n- - - Autobus - - -");
				System.out.print("Ingrese la marca del autobus: ");
				marca = entrada.next();
				System.out.print("Ingrese el color de la autobus: ");
				color = entrada.next();
				System.out.print("Ingrese la linea del autobus: ");
				linea = entrada.next();
				System.out.print("Ingrese el numero de ejes del autobus (2 o 3): ");
				ejes = entrada.nextInt();
				listaVehiculos.add(new Autobus(color, marca, ejes, linea));
				break;
			case 4:
				System.out.println("\n- - - Camion / Trailer - - -");
				System.out.print("Ingrese la marca del camion: ");
				marca = entrada.next();
				System.out.print("Ingrese el color del camion: ");
				color = entrada.next();
				System.out.print("Ingrese lo que transporta el camion: ");
				categoria = entrada.next();
				System.out.print("Ingrese el numero de ejes del camion (4,5,6,7,8.9): ");
				ejes = entrada.nextInt();
				listaVehiculos.add(new Camion(color, marca, ejes, categoria));
				break;
			default:
				System.out.println(" X X No se admite esta petición  X X");
				listaVehiculos.add(new Automovil(null, "vacio"));
				break;
			}
		}

		// Recorrido de lista y muestra de información de vehiculos con su respectiva
		// tarifa de peaje
		showContentList(listaVehiculos);
	}

	public static void showContentList(List<Vehiculo> listaVehiculos) {
		int cont = 0;
		for (Vehiculo vh : listaVehiculos) {
			System.out.println("\n* * * * * PEAJE " + (++cont));
			System.out.println(vh.toString());
			if (vh.getPayment() == 0) {
				System.out.println("No se llenaron correctamente los datos");
			} else {
				System.out.println("El peaje a pagar es de: " + vh.getPayment());
			}
		}
	}

	public static void showMenu() {
		System.out.println("\n/ / / M E N U / / /");
		System.out.println("1. Motocicleta");
		System.out.println("2. Automovil");
		System.out.println("3. Autobus / Camion");
		System.out.println("4. Camion (Trailer)");
		System.out.print("Ingrese el tipo de auto por agregar: ");
	}

}
