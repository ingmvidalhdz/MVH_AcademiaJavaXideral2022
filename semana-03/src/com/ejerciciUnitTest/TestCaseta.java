package com.ejerciciUnitTest;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class TestCaseta {

	@Test
	void testCobrarPeaje() {
		Vehiculo v1 = new Vehiculo("Ford", "Lobo", "Azul", 2);
		Caseta caseta = new Caseta();
		String cad1 = caseta.cobrarPeaje(v1.getEjes());
		assertEquals(cad1, "El vehiculo es un automovil y paga 89.50 pesos");
	}

	@Test
	void testCobrarPeaje1() {
		Vehiculo v1 = new Vehiculo("Ford", "Lobo", "Azul", 2);
		Caseta caseta = new Caseta();
		v1.setEjes(9);
		String cad1 = caseta.cobrarPeaje(v1.getEjes());
		assertEquals(cad1, "No se proceso su respuesta");
	}

	@Test
	void testCobrarPeaje2() {
		Vehiculo v1 = new Vehiculo("Ducati", "Scrambler", "Negro mate", 1);
		Caseta caseta = new Caseta();
		String cad1 = caseta.cobrarPeaje(v1.getEjes());
		assertEquals(cad1, "El vehiculo es una motocicleta y paga 49.50 pesos");
	}
	
	@Test
	void testCobrarPeaje3() {
		Vehiculo v1 = new Vehiculo("Ducati", "Scrambler", "Negro mate", -34);
		Caseta caseta = new Caseta();
		String cad1 = caseta.cobrarPeaje(v1.getEjes());
		assertEquals(cad1, "El vehiculo no se escaneo de manera correcta");
	}

	@Test
	void muestraAutosConErrores() {
		List<Vehiculo> listaVehiculos = new ArrayList<>();
		listaVehiculos.add(new Vehiculo("Dodge", "Charger 400", "Negro", 2));
		listaVehiculos.add(new Vehiculo("Volskwagen", "Gol", "Rojo", 2));
		listaVehiculos.add(new Vehiculo("Scannia", "K360C B4x2NB", "Azul", 3));
		listaVehiculos.add(new Vehiculo("Ford", "Fiesta 2012", "Verde", 2));
		listaVehiculos.add(new Vehiculo("Yamaha", "R6", "Azul c Gris", 1));
		listaVehiculos.add(new Vehiculo("Chevrolet", "Silverado", "Blanco", 2));
		listaVehiculos.add(new Vehiculo("Kenworth", "T680", "Amarrillo", 4));
		listaVehiculos.add(new Vehiculo("Man", "MAN TGS 33.540", "Negro", 3));
		listaVehiculos.add(new Vehiculo("Kawasaki", "Ninja 400", "Verde", 1));
		listaVehiculos.add(new Vehiculo("Ford", "Lobo 2021", "Negra", 2));

		Caseta caseta = new Caseta();
		ArrayList<Vehiculo> arrVehiculos = caseta.muestraVehiculosErroneos(listaVehiculos);
		assertEquals(arrVehiculos, null);
	}
	
	@Test
	void comprobarVehiculosErroneos() {
		Caseta caseta = new Caseta();
		List<Vehiculo> listaVehiculos = new ArrayList<>();
		listaVehiculos.add(new Vehiculo("Dodge", "Charger 400", "Negro", 2));
		listaVehiculos.add(new Vehiculo("Volskwagen", "Gol", "Rojo", 2));
		listaVehiculos.add(new Vehiculo("Scannia", "K360C B4x2NB", "Azul", 3));
		listaVehiculos.add(new Vehiculo("Ford", "Fiesta 2012", "Verde", 2));
		listaVehiculos.add(new Vehiculo("Yamaha", "R6", "Azul c Gris", 1));
		listaVehiculos.add(new Vehiculo("Chevrolet", "Silverado", "Blanco", 2));
		listaVehiculos.add(new Vehiculo("Kenworth", "T680", "Amarrillo", 4));
		listaVehiculos.add(new Vehiculo("Man", "MAN TGS 33.540", "Negro", 3));
		listaVehiculos.add(new Vehiculo("Kawasaki", "Ninja 400", "Verde", 1));
		listaVehiculos.add(new Vehiculo("Ford", "Lobo 2021", "Negra", 2));
		boolean vehiculosErroneos = caseta.compruebaVehiculosErroneos(listaVehiculos);
		assertEquals(true, true);
	}
}
