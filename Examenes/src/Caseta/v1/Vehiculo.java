package Caseta.v1;

public abstract class Vehiculo {
	String color;
	String marca;

	public Vehiculo(String color, String marca) {
		this.color = color;
		this.marca = marca;
	}

	public abstract double getPayment();

	public String toString() {
		return getClass().getName() + "\nColor: " + color + "\nMarca: " + marca;
	}
}
