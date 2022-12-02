package com.excepciones.v3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Excepciones2 {

	public static void main(String[] args) {

		PrintWriter pw = null;
		int a = 5;
		int b = 10;
		double res = 0;

		try (FileWriter fw = new FileWriter("C\\trabajo\\prueba.txt")) {
			pw = new PrintWriter(fw);
			for (int i = 0; i < 6; i++) {
				res = b / a;
				System.out.println(a);
				pw.println("Resultado " + i + ": " + res);
				a--;
			}
		} catch (IOException | NullPointerException | ArithmeticException e) {
			System.out.println("Excepción encontrada: " + e.toString());
		}
	}
}
