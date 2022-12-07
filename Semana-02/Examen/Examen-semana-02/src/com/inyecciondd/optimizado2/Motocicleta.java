package com.inyecciondd.optimizado2;

public class Motocicleta extends Vehiculo {

	public Motocicleta(String particularidad) {
		super(particularidad);
	}

	@Override
	public void obtenerCuota() {
		System.out.println("Tipo: Motocicleta\nParticularidad: " + super.getParticularidad() + "\nPaga: $44 pesos");
	}

}
