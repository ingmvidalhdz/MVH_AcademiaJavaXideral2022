package com.inyecciondd;

public class Camion extends Vehiculo {

	public Camion(String marca, String modelo, String color, int ejes) {
		super(marca, modelo, color, ejes);
	}

	@Override
	public void obtenerCuota() {
		System.out.println("Camiom\nMarca: " + super.getMarca() + "\nModelo: " + super.getModelo() + "\nColor: "
				+ super.getColor() + "\nEjes: " + super.getEjes() + "\nPaga: $308 pesos");
	}

}
