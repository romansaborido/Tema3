package boletin2;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {

		// Creamos el array arrayValor
		int arrayValor[];

		// Creamos la variable tamaño para almacenar el tamaño del array que indique el usuario
		int tamaño = 0;

		// Creamos la variable valor para almacenar el valor que quiere almacenar el usuario en todo el array
		int valor = 0;
		
		// Creamos el booleano entradaValida para regular la entrada de datos por parte del usuario
		boolean entradaValida = false;

		// Creamos el scanner
		Scanner reader = new Scanner(System.in);

		// Mostramos el funcionamiento del programa al usuario
		System.out.println("Introduzca un tamaño y un valor. Te mostraré un array a partir de estos datos");
		System.out.println();
		
		
		// Pedimos al usuario que introduzca el tamaño del array
		do {
			try {
				System.out.println("Introduzca el tamaño del array");
				tamaño = reader.nextInt();
				assert (tamaño > 0) : "Introduzca un número mayor que 0";
			} catch (AssertionError e) {
				System.err.println(e.getMessage());
			} catch (InputMismatchException e) {
				System.err.println("Introduzca un número entero");
				reader.next();
			}
		} while (tamaño <= 0);

		
		// Pedimos al usuario que introduzca el valor que quiere almacenar en el array
		do {
			try {
				System.out.println("Introduzca el valor a almacenar en el array");
				valor = reader.nextInt();
				entradaValida = true;
			} catch (InputMismatchException e) {
				System.err.println("Introduzca un número entero");
				reader.next();
			}
		} while (!entradaValida);
		
		
		// Creamos el array con el tamaño indicado
		arrayValor = new int[tamaño]; 
		
		// Rellenamos el array con el valor indicado
		Arrays.fill (arrayValor, valor);
		
		// Mostramos el contenido de la tabla
		System.out.println();
		System.out.println(Arrays.toString(arrayValor));
		
		// Cerramos el scanner
		reader.close();
		
		
	}

}


