package com.inyecciondd;

public class Autobus extends Vehiculo{

	public Autobus(String marca, String modelo, String color, int ejes) {
		super(marca, modelo, color, ejes);
	}

	@Override
	public void obtenerCuota() {
		System.out.println("Autobus\nMarca: " + super.getMarca() + "\nModelo: " + super.getModelo() + "\nColor: "
				+ super.getColor() + "\nEjes: " + super.getEjes() + "\nPaga: $246 pesos");
	}
	
}
