package com.inyecciondd.optimizado;

public class Automovil extends Vehiculo {

	public Automovil(int ejes) {
		super(ejes);
	}

	@Override
	public void obtenerCuota() {
		System.out.println("Tipo: Automovil\nEjes: " + super.getEjes() + "\nPaga: $89 pesos");
	}
}
