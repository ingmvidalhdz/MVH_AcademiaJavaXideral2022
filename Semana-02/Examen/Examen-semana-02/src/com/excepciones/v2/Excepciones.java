package com.excepciones.v2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Excepciones {

	public static void main(String[] args) throws FileNotFoundException {

		FileReader fr = abrirArchivo();

	}

	public static FileReader abrirArchivo() throws FileNotFoundException {
		FileReader fileR = null;
		fileR = new FileReader("C:\\Prueba\\archivo.txt");
		return fileR;
	}
}
