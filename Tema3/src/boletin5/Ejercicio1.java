package boletin5;

import java.util.Random;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		// Creamos la clase random
		Random rand = new Random();
		
		// Creamos un array bidimensional llamado numerosEnteros de 4 por 5
		int numerosEnteros[][] = new int[4][5];
		
		// Creamos un boleano para almacenar el resultado de la funcion
		boolean busqueda;
		
		// Creamos una variable llamada valorBuscar para almacenar el numero que el usuario quiera buscar
		int valorBuscar;
		
		// Asignamos los valores del array (numeros enteros aleatorios del 1 al 100)
		for (int i = 0 ; i < numerosEnteros.length ; i++) {
			for (int j = 0 ; j < numerosEnteros[i].length ; j++) {
				numerosEnteros[i][j] = rand.nextInt(1,101);
			}
		}
		
		// Mostramos la tabla
		System.out.println("Tabla de números aleatorios del 1 al 100");
		System.out.println();
		
		for (int i = 0 ; i < numerosEnteros.length ; i++) {
			for (int j = 0 ; j < numerosEnteros[i].length ; j++) {
				System.out.print(numerosEnteros[i][j] + "\t");
			}
			System.out.println();
		}
		
		
		// Preguntamos al usuario que valor quiere buscar
		
	}
	
	static boolean buscar(int t[][], int valor) {
		
		// Creamos el booleano a devolver y lo inicializamos a false 
		boolean busqueda = false;
		
		
		
		// Devolvemos el booleano
		return busqueda;
	}

}
