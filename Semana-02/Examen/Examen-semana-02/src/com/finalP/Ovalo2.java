package com.finalP;

public class Ovalo2 extends Circulo3{

	private double diametro;
	
	public Ovalo2(double radio, double diametro) {
		super(radio);
		this.diametro = diametro;
	}
	
	@Override
	public void calcularArea(double radio) {
		double area = diametro * radio;
		System.out.println("Area: " + area);
	}
	
	@Override
	public void mostrarPI() {
		System.out.println(PI);
	}
}
