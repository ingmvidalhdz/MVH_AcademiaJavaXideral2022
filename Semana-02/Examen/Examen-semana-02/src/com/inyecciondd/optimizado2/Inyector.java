package com.inyecciondd.optimizado2;

public class Inyector {

	static Vehiculo moto = new Motocicleta("Con franjas verdes");
	static Vehiculo bus = new Autobus("Linea Comercial ETN");
	static Vehiculo auto = new Automovil("4 puertas, rines rojos");
	static Vehiculo camion = new Camion("Transporta madera");

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
