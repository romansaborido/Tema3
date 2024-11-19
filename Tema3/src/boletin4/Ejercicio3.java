package boletin4;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio3 {

	// Creamos el scanner
	static Scanner reader = new Scanner(System.in);
	
	public static void main(String[] args) {

		// Creamos el array tablaPares para almacenar el resultado de la funcion
		int tablaPares[];
		
		// Creamos la variable longitudArray para almacenar la longitud de la tabla que introduzca el usuario
		int longitudArray = 0;

		// Creamos la variable valorFinal para almacenar el valor maximo del rango
		int valorFinal;
		
		// Pedimos al usuario que introduzca la longitud del array
		longitudArray = pedirNumeroEntero("Introduzca la longitud del array");
		
		// Pedimos al usuario que introduzca el valor maximo del rango
		valorFinal = pedirNumeroEntero("Introduzca el valor maximo del array");
		
		// Almacenamos el resultado de la funcion
		tablaPares = rellenaPares(longitudArray, valorFinal);
		
		// Salto de linea
		System.out.println();
		
		// Imprimimos el array
		System.out.println(Arrays.toString(tablaPares));
		
		// Cerramos el scanner
		reader.close();
	}

	static int[] rellenaPares(int longitud, int fin) {

		// Creamos la tabla a devolver de la longitud que el usuario indique
		int tabla[] = new int[longitud];

		// Creamos la clase random para generar numeros aleatorios
		Random rand = new Random();

		// Creamos la variable contador para almacenar el numero de veces que almacenamos un valor par en el arary
		int contador = 0;
		
		// Creamos la variable numeroRandom para almacenar el numero aleatorio que generemos
		int numeroRandom;
		
		// Mientras que el contador sea menor que la longitud de la tabla
		while (contador < tabla.length) {
			
			// Generamos un numero random
			numeroRandom = rand.nextInt(2, fin + 1);
			
			// Si el numero random es par lo almacenamos en el array e incrementamos contador
			if (numeroRandom % 2 == 0) {
				tabla[contador] = numeroRandom;
				contador++;
			}
		}

		// Ordenamos la tabla
		Arrays.sort(tabla);
		
		// Devolvemos la tabla
		return tabla;
	}

	static int pedirNumeroEntero(String mensaje) {
		
		// Creamos la variable a devolver numero y la incializamos a 0
		int numero = 0;
		
		do {
			try {
				System.out.println(mensaje);
				numero = reader.nextInt();
				assert (numero > 0) : "Introduzca un número mayor que 0";
			} catch (AssertionError e) {
				System.err.println(e.getMessage());
			} catch (InputMismatchException e) {
				System.err.println("Introduzca un número entero");
			} finally {
				reader.nextLine();
			}
		} while (numero <= 0);
		
		// Devolvemos el numero
		return numero;
	}
	
}


