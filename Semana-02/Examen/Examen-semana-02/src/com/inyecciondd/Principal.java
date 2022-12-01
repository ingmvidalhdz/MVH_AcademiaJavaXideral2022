package com.inyecciondd;

public class Principal {

	public static void main(String[] args) {

		CasetaPeaje c1 = new CasetaPeaje(1);

		Inyector.inyectarAuto(c1, 1);

		c1.cobrarPeaje();

		CasetaPeaje c2 = new CasetaPeaje(11);

		Inyector.inyectarAuto(c2, 2);

		c2.cobrarPeaje();

		CasetaPeaje c3 = new CasetaPeaje(32);

		Inyector.inyectarAuto(c3, 4);

		c3.cobrarPeaje();

	}

}
