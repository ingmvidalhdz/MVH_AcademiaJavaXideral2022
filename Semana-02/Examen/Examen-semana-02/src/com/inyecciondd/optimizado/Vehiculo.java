package com.inyecciondd.optimizado;

public abstract class Vehiculo {

	private int ejes;

	public Vehiculo(int ejes) {
		this.ejes = ejes;
	}
	
	public abstract void obtenerCuota();

	public int getEjes() {
		return ejes;
	}

	public void setEjes(int ejes) {
		this.ejes = ejes;
	}
}