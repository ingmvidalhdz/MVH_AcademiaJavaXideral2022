package com.inyecciondd.optimizado2;

public class Camion extends Vehiculo {

	public Camion(String particularidad) {
		super(particularidad);
	}

	@Override
	public void obtenerCuota() {
		System.out.println("Tipo: Camiom\nEjes: 5 \nParticularidad: " + super.getParticularidad() + "\nPaga: $308 pesos");
	}

}
