package Caseta.v2;

public class Automovil implements Vehiculo{

	String color;
	String marca;

	Automovil(String color, String marca) {
		this.color = color;
		this.marca = marca;
	}

	@Override
	public double getPayment() {
		if (color == null || marca == null) {
			return 0;
		} else {
			return 89.0;
		}
	}
	
	public String toString(){
		return "Automovil \nColor: "+ color + "\nMarca: "+ marca;
	}

	
}
