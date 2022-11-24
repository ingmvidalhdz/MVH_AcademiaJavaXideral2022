package Caseta.v1;

public class Automovil extends Vehiculo {

	public Automovil(String color, String marca) {
		super(color, marca);
	}

	@Override
	public double getPayment() {
		if (color == null || marca == null) {
			return 0;
		} else {
			return 89.0;
		}
	}

	public String toString() {
		return getClass().getName() + "\nColor: " + color + "\nMarca: " + marca + "\nEjes: 2";
	}

}
