package com.inyecciondd.optimizado2;

public class CasetaPeaje {

	private int noRegistro;
	private String marca;
	private String modelo;
	private String color;

	private Vehiculo vh;

	public CasetaPeaje(int noRegistro, String marca, String modelo, String color) {
		super();
		this.noRegistro = noRegistro;
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void cobrarPeaje() {
		System.out.println(
				"\nRegistro " + noRegistro + "\nMarca: " + marca + "\nModelo: " + modelo + "\nColor: " + color);
		vh.obtenerCuota();
	}

	public Vehiculo getVehiculo() {
		return vh;
	}

	public void setVehiculo(Vehiculo vh) {
		this.vh = vh;
	}
}
