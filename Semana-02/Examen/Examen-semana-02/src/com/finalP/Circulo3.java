package com.finalP;

public class Circulo3 {

	private final double radio;
	private final double PI = 3.1416;
	
	public Circulo3(double radio) {
		this.radio = radio;
	}
	
	public void calcularArea(double radio) {
		double area = (PI * radio) * 2;
		System.out.println("Area: " + area);
	}
	
	public final void mostrarPI() {
		System.out.println(PI);
	}

}
