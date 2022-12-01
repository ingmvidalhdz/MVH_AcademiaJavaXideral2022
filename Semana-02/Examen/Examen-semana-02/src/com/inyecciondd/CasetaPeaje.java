package com.inyecciondd;

public class CasetaPeaje {

	private int noRegistro;
	private Vehiculo vh;

	public CasetaPeaje(int noRegistro) {
		this.noRegistro = noRegistro;
	}

	public void cobrarPeaje() {
		System.out.println("\nRegistro " + noRegistro);
		vh.obtenerCuota();
	}
	
	public Vehiculo getVehiculo() {
		return vh;
	}
	
	public void setVehiculo(Vehiculo vh) {
		this.vh = vh;
	}
}
