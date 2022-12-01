package com.inyecciondd.optimizado2;

public class Autobus extends Vehiculo {

	public Autobus(String particularidad) {
		super(particularidad);
	}

	@Override
	public void obtenerCuota() {
		System.out
				.println("Tipo: Autobus\nEjes: 3\nParticularidad: " + super.getParticularidad() + "\nPaga: $246 pesos");
	}
}
