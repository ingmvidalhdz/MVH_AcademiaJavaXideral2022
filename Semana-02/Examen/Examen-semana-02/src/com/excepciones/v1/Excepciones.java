package com.excepciones.v1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Excepciones {

	public static void main(String[] args) {
		
		FileReader fr = abrirArchivo();
		
	}

	public static FileReader abrirArchivo() {
		FileReader fileR = null;
		try {
			fileR = new FileReader("C:\\Prueba\\archivo.txt");
		} catch (FileNotFoundException e) {
			System.out.println(e.toString());
		}
		return fileR;
	}
}
