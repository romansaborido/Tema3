package boletin2;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		// Creamos el array llamado numerosRandom de tamaño 1000
		int numerosRandom[] = new int[1000];
		
		// Creamos la variable valor para almacenar el valor a buscar que introduzca el usuario
		int valor = 0;
		
		// Creamos la variable posicion para ir controlando la posicion cuando estamos buscando el valor
		int posicion = 0;
		
		// Creamos la variable veces para almacenar el numero de veces que se encuentra el valor en la tabla
		int veces = 0;
		
		// Creamos el scanner
		Scanner reader = new Scanner(System.in);
		
		// Creamos la clase random para generar numeros aleatorios
		Random rand = new Random();
		
		// Establecemos los valores aleatorios del array
		for (int i = 0 ; i < numerosRandom.length ; i++) {
			numerosRandom[i] = rand.nextInt(0,100);
		}
		
		// Mostramos al usuario el funcionamiento del programa
		System.out.println("Tengo una tabla de 1000 numeros aleatorios entre el 0 y 99. Busca un valor");
		System.out.println();
		
		// Pedimos al usuario que introduzca el valor a buscar
		do {
			try {
				System.out.print("Introduzca un valor a buscar en el array: ");
				valor = reader.nextInt();
				assert (valor >= 0 && valor <= 99) : "El valor a buscar debe estar entre 0 y 99 (incluidos)";
			} catch (AssertionError e) {
				System.err.println(e.getMessage());
			} catch (InputMismatchException e) {
				System.out.println("Introduzca un número entero");
				reader.next();
			}
		} while (valor < 0 || valor > 99);
		
		// Buscamos el valor
		while (posicion < numerosRandom.length - 1) {
			posicion++;
			
			// Si el valor es igual que el valor de la posicion actual incrementamos veces
			if (valor == numerosRandom[posicion]) {
				veces++;
			}
		}
		
		// Mostramos los resultados
		if (posicion < numerosRandom.length) {
			System.out.println();
			System.out.println("El valor " + valor + " se encuentra en la tabla " + veces + " veces");
		} else {
			System.out.println();
			System.out.println("El valor " + valor + " no se encuentra en la tabla");
		}
		
		// Cerramos el scanner
		reader.close();
		
		
	}

}
