package com.inyecciondd;

public class Automovil extends Vehiculo {

	public Automovil(String marca, String modelo, String color, int ejes) {
		super(marca, modelo, color, ejes);
	}

	@Override
	public void obtenerCuota() {
		System.out.println("Automovil\nMarca: " + super.getMarca() + "\nModelo: " + super.getModelo() + "\nColor: "
				+ super.getColor() + "\nEjes: " + super.getEjes() + "\nPaga: $89 pesos");
	}

}
