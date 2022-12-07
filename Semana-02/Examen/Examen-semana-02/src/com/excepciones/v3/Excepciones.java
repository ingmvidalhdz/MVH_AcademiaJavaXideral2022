package com.excepciones.v3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Excepciones {

	public static void main(String[] args) {

		FileWriter fw = null;
		PrintWriter pw = null;
		int a = 5;
		int b = 10;
		double res = 0;

		try {
			fw = traerArchivo("C\\ta@bajo\\prueba.txt");
			pw = new PrintWriter(fw);
			for (int i = 0; i < 6; i++) {
				res = b / a;
				System.out.println(a);
				pw.println("Resultado " + i + ": " + res);
				a--;
			}
		} catch (RutaInvalida | IOException | NullPointerException | ArithmeticException e) {
			System.out.println("Excepción encontrada: " + e.toString());
		} finally {
			if (fw != null) {
				try {
					fw.close();
				} catch (Exception e2) {
					System.out.println("Excepción al cerrar el archivo: " + e2.toString());
				}
			}
		}
		
		System.out.println("fin...");
	}

	public static FileWriter traerArchivo(String ruta) throws RutaInvalida, IOException {
		if (ruta.equals("")) {
			throw new RutaInvalida("La ruta esta vacia");
		} else if (ruta.contains("@") || ruta.contains("$") || ruta.contains("}") || ruta.contains("{")) {
			throw new RutaInvalida("La ruta no debe tener caracteres especiales");
		} else {
			return new FileWriter(ruta);
			//return null;
		}
	}
}
