package Caseta.v1;

public class Motocicleta extends Vehiculo {

	public Motocicleta(String color, String marca) {
		super(color, marca);
	}

	@Override
	public double getPayment() {
		if (color == null || marca == null) {
			return 0;
		} else {
			return 44.0;
		}
	}

	@Override
	public String toString() {
		return getClass().getName() + "\nColor: " + color + "\nMarca: " + marca + "\nEjes: 1";
	}

}
