package boletin3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		// Creamos la tabla bidimensional llamada tabla 
		int tabla[][];
		
		// Creamos la variable filas para almacenar el numero de filas que introduzca el usuario
		int filas;
		
		// Creamos la variable columnas para almacenar el numero de columnas que introduzca el usuario
		int columnas;
		
		// Creamos el scanner
		Scanner reader = new Scanner(System.in);
		
		// Pedimos al usuario que introduzca el numero de filas de la tabla
		System.out.println("Introduzca el número de filas que quieres que tenga la tabla");
		filas = reader.nextInt();
		
		// Pedimos al usuario que introduzca el numero de columnas de la tabla
		System.out.println("Introduzca el número de columnas que quieres que tenga la tabla");
		columnas = reader.nextInt();
		
		// Establecemos las dimensiones de la tabla
		tabla = new int[filas][columnas];
		
		// Asignamos los valores de la tabla
		for (int i = 0 ; i < tabla.length ; i++) {
			for (int j = 0 ; j < tabla[i].length ; j++) {
				tabla[i][j] = 10 * i + j;
			}
		}
		
		// Salto de linea
		System.out.println();
		
		// Mostramos los valores de la tabla
		for (int i = 0 ; i < tabla.length ; i++) {
			for (int j = 0 ; j < tabla[i].length ; j++) {
				System.out.print(tabla[i][j] + "\t");
			}
			System.out.println();
		}
		
		// Cerramos el scanner
		reader.close();
		
		
	}

}
