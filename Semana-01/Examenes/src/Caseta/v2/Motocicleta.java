package Caseta.v2;

public class Motocicleta implements Vehiculo {
	String color;
	String marca;

	Motocicleta(String color, String marca) {
		this.color = color;
		this.marca = marca;
	}

	@Override
	public double getPayment() {
		if (color == null || marca == null) {
			return 0;
		} else {
			return 44.0;
		}
	}
	
	public String toString(){
		return "Motocicleta \nColor: "+ color + "\nMarca: "+ marca;
	}
}
