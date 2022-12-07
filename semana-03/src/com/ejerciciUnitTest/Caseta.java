package com.ejerciciUnitTest;

import java.util.ArrayList;
import java.util.List;

public class Caseta {

	public String cobrarPeaje(int ejes) {
		String cadena = "";
		if (ejes <= 0) {
			cadena = "El vehiculo no se escaneo de manera correcta";
		} else {
			switch (ejes) {
			case 1:
				cadena = "El vehiculo es una motocicleta y paga 49.50 pesos";
				break;
			case 2:
				cadena = "El vehiculo es un automovil y paga 89.50 pesos";
				break;
			case 3:
				cadena = "El vehiculo es un autovbus  y paga 149.50 pesos";
				break;
			case 4:
				cadena = "El vehiculo es un camion de carga y paga 209.50 pesos";
				break;
			default:
				cadena = "No se proceso su respuesta";
				break;
			}
		}
		return cadena;
	}
	
	public ArrayList<Vehiculo> muestraVehiculosErroneos(List<Vehiculo> lvh) {
		ArrayList<Vehiculo> vehiculosErroneos = null;
		for (Vehiculo vh : lvh) {
			if(vh.getEjes() <= 0 || vh.getEjes() > 4) {
				System.out.println("entre en vehiculo "+ vh);
				vehiculosErroneos.add(vh);
			}
		}
		return vehiculosErroneos;
	}
	
	public boolean compruebaVehiculosErroneos(List<Vehiculo> lvh) {
		boolean vehiculosErroneos = false;
		for (Vehiculo vh : lvh) {
			if(vh.getEjes() <= 0 || vh.getEjes() > 4) {
				vehiculosErroneos = true;
			}
		}
		return vehiculosErroneos;
	}
}
