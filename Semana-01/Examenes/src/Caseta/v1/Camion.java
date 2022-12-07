package Caseta.v1;

public class Camion extends Vehiculo {

	int ejes;
	String categoria;

	public Camion(String color, String marca, int ejes, String categoria) {
		super(color, marca);
		this.ejes = ejes;
		this.categoria = categoria;
	}

	@Override
	public double getPayment() {
		double cuota;
		switch (ejes) {
		case 4:
			cuota = 308.00;
			break;
		case 5:
			cuota = 429.00;
			break;
		case 6:
			cuota = 482.00;
			break;
		case 7:
			cuota = 603.00;
			break;
		case 8:
			cuota = 679.00;
			break;
		case 9:
			cuota = 721.00;
			break;
		default:
			cuota = 0;
		}
		return cuota;
	}

	public String toString() {
		return getClass().getName()
				+ "\nColor: " + color + "\nMarca: " + marca + "\nCategoria: " + categoria
				+ "\nEjes: " + ejes;
	}
}
