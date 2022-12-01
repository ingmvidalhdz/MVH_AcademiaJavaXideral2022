package com.inyecciondd.optimizado2;

public abstract class Vehiculo {

	private String particularidad;

	public Vehiculo(String particularidad) {
		this.particularidad = particularidad;
	}
	
	public abstract void obtenerCuota();

	public String getParticularidad() {
		return particularidad;
	}

	public void setParticularidad(String particularidad) {
		this.particularidad = particularidad;
	}
	
	
}

