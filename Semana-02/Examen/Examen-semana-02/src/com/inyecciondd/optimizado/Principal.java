package com.inyecciondd.optimizado;

public class Principal {

	public static void main(String[] args) {

		CasetaPeaje c1 = new CasetaPeaje(1, "Yamaha", "Gixxer-250", "Azul");

		Inyector.inyectarAuto(c1, 1);

		c1.cobrarPeaje();

		CasetaPeaje c2 = new CasetaPeaje(2, "Volskwagen", "Jetta Clasico", "Blanco");

		Inyector.inyectarAuto(c2, 2);

		c2.cobrarPeaje();

		CasetaPeaje c3 = new CasetaPeaje(3, "Man", "Mand-113", "Rojo");

		Inyector.inyectarAuto(c3, 4);

		c3.cobrarPeaje();
		
		CasetaPeaje c4 = new CasetaPeaje(4, "Mercedez Bens", "Bus-line-2312", "Gris");

		Inyector.inyectarAuto(c4, 3);

		c4.cobrarPeaje();

	}

}
