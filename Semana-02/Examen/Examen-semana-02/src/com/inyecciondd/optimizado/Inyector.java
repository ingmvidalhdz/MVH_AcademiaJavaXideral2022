package com.inyecciondd.optimizado;

public class Inyector {

	static Vehiculo moto = new Motocicleta(1);
	static Vehiculo bus = new Autobus(3);
	static Vehiculo auto = new Automovil(2);
	static Vehiculo camion = new Camion(5);

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
