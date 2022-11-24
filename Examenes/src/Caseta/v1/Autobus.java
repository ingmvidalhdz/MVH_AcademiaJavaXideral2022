package Caseta.v1;

public class Autobus extends Vehiculo {

	int ejes;
	String linea;

	public Autobus(String color, String marca, int ejes, String linea) {
		super(color, marca);
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
