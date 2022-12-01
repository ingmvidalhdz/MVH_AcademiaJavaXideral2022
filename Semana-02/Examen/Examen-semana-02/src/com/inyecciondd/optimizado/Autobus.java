package com.inyecciondd.optimizado;

public class Autobus extends Vehiculo{

	public Autobus(int ejes) {
		super(ejes);
	}

	@Override
	public void obtenerCuota() {
		System.out.println("Tipo: Autobus\nEjes: " + super.getEjes() + "\nPaga: $246 pesos");
	}
}
