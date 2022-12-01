package com.inyecciondd;

public class Motocicleta extends Vehiculo {

	public Motocicleta(String marca, String modelo, String color, int ejes) {
		super(marca, modelo, color, ejes);
	}

	@Override
	public void obtenerCuota() {
		System.out.println("Motocicleta\nMarca: " + super.getMarca() + "\nModelo: " + super.getModelo() + "\nColor: "
				+ super.getColor() + "\nPaga: $44 pesos");
	}

}
