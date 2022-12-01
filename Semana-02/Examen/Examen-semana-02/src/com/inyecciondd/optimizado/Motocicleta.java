package com.inyecciondd.optimizado;

public class Motocicleta extends Vehiculo {

	public Motocicleta(int ejes) {
		super(ejes);
	}

	@Override
	public void obtenerCuota() {
		System.out.println("Tipo: Motocicleta\nPaga: $44 pesos");
	}

}
