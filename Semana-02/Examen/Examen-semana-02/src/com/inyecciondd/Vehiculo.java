package com.inyecciondd;

public abstract class Vehiculo {
	private String marca;
	private String modelo;
	private String color;
	private int ejes;

	public Vehiculo(String marca, String modelo, String color, int ejes) {
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.ejes = ejes;
	}
	
	public abstract void obtenerCuota();

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

	public int getEjes() {
		return ejes;
	}

	public void setEjes(int ejes) {
		this.ejes = ejes;
	}
}
