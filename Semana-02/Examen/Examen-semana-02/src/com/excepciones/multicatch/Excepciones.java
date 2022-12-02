package com.excepciones.multicatch;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Excepciones {

	public static void main(String[] args) {
		int a = 5;
		int b = 10;
		double res = 0;
		try {
			while (a >= 0) {
				res = b / a;
				System.out.println("b: " + b + " a: " + a + " = " + res);
				a--;
			}
		} catch (Exception e) {
			System.out.println("Excepcion encontrada: "+ e.toString());
		}
	}
}
