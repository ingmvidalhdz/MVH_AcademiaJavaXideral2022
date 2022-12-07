package com.finalP;

public final class Circulo2 {

	private final double radio;
	private final double PI = 3.1416;
	
	public Circulo2(double radio) {
		this.radio = radio;
	}
	
	public void calcularArea(double radio) {
		double area = (PI * radio) * 2;
		System.out.println("Area: " + area);
	}


	public double getRadio() {
		return radio;
	}
	
	public void setRadio(double radio) {
		this.radio = radio;
	}

	public double getPI() {
		return PI;
	}
}
