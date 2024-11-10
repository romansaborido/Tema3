package boletin2;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		// Creamos el primer array llamado array1 de longitud 10
		int array1[] = new int[10];
		
		// Creamos el segundo array llamado array2 de longitud 10
		int array2[] = new int[10];
		
		// Creamos la variable valor1 para almacenar los valores del array1 que introduzca el usuario
		int valor1;
		
		// Creamos la variable valor2 para almacenar los valores del array2 que introduzca el usuario
		int valor2;
		
		// Creamos el booleano entradaValida para regular la entrada de datos por parte del usuario
		boolean entradaValida = false;
		
		// Creamos el booleano sonIguales para almacenar si las tablas son iguales o no
		boolean sonIguales;
		
		// Creamos el scanner
		Scanner reader = new Scanner(System.in);
		
		
		// Pedimos al usuario que introduzca los 10 primeros valores para el array 1
		System.out.println("Introduzca los 10 primeros valores para el array 1");
		System.out.println();
		
		// Pedimos los 10 primeros valores al usuario que se almacenaran en el array 1
		for (int i = 0 ; i < 10 ; i++) {
			do {
				try {
					System.out.print("Introduzca un valor: ");
					valor1 = reader.nextInt();
					array1[i] = valor1;
					entradaValida = true;
				} catch (InputMismatchException e) {
					System.err.println("Introduzca un número entero");
					reader.next();
				}
			} while (!entradaValida);
		}
		
		
		// Salto de linea
		System.out.println();
		
		// Pedimos al usuario que introduzca los otros 10 valores para el array 2
		System.out.println("Introduzca los otros 10 valores para el array 2");
		System.out.println();
				
		// Pedimos los otros 10 valores al usuario que se almacenaran en el array 2
		for (int i = 0 ; i < 10 ; i++) {
			do {
				try {
					System.out.print("Introduzca un valor: ");
					valor2 = reader.nextInt();
					array2[i] = valor2;
					entradaValida = true;
				} catch (InputMismatchException e) {
					System.err.println("Introduzca un número entero");
					reader.next();
				}
			} while (!entradaValida);
		}
		
		
		// Mostramos el contenido del array 1
		System.out.println();
		System.out.println("Array 1");
		System.out.println(Arrays.toString(array1));
		
		// Mostramos el contenido del array 1
		System.out.println();
		System.out.println("Array 2");
		System.out.println(Arrays.toString(array2));
		
		// Comparamos los dos arrays
		sonIguales = Arrays.equals(array1, array2);
		
		// Mostramos el resultado
		System.out.println();
		if (sonIguales) {
			System.out.println("Array 1 && Array 2 son iguales");
		} else {
			System.out.println("Array 1 && Array 2 NO son iguales");
		}
		
		// Cerramos el scanner
		reader.close();
		
		
	}

}
