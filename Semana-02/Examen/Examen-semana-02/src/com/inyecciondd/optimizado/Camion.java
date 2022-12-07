package com.inyecciondd.optimizado;

public class Camion extends Vehiculo {

	public Camion(int ejes) {
		super(ejes);
	}

	@Override
	public void obtenerCuota() {
		System.out.println("Tipo: Camiom\nEjes: " + super.getEjes() + "\nPaga: $308 pesos");
	}

}
