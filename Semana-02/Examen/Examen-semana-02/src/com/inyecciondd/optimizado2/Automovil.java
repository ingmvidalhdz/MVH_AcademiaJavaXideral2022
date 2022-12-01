package com.inyecciondd.optimizado2;

public class Automovil extends Vehiculo {

	public Automovil(String particularidad) {
		super(particularidad);
	}

	@Override
	public void obtenerCuota() {
		System.out.println("Tipo: Automovil\nEjes: 2\nParticularidad: " + super.getParticularidad() + "\nPaga: $89 pesos");
	}
}
