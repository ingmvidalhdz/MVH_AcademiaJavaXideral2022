package com.inyecciondd;

public class Inyector {

	static Vehiculo moto = new Motocicleta("Yamaha", "Gixxer-SF250", "Azul", 1);
	static Vehiculo bus = new Autobus("Scannia", "bus-23", "Gris", 3);
	static Vehiculo auto = new Automovil("Volskwagen", "Jetta", "Blanco", 2);
	static Vehiculo camion = new Camion("Volvo", "Vlx2", "Negro", 5);

	static void inyectarAuto(CasetaPeaje cp, int ejes) {
		switch (ejes) {
		case 1:
			cp.setVehiculo(moto);
			break;
		case 2:
			cp.setVehiculo(auto);
			break;
		case 3:
			cp.setVehiculo(bus);
			break;
		default:
			cp.setVehiculo(camion);
			break;
		}
	}
}
