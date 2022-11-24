package Caseta.v2;

public class Autobus implements Vehiculo {

	String color, marca, linea;
	int ejes;

	public Autobus(String color, String marca, int ejes, String linea) {
		this.color = color;
		this.marca = marca;
		this.ejes = ejes;
		this.linea = linea;
	}

	@Override
	public double getPayment() {
		double cuota = 0;
		if (ejes == 2) {
			cuota = 170.00;
		} else if (ejes == 3) {
			cuota = 246.00;
		}
		return cuota;
	}

	public String toString() {
		return getClass().getName() + "\nColor: " + color + "\nMarca: " + marca + "\nLinea: " + linea + "\nEjes: "
				+ ejes;
	}
}
