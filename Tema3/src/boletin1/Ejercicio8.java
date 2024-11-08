package boletin1;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		
		// Creamos el array enteros de longitud 100
		int enteros[] = new int[100];
		
		// Creamos la clase random para generar posteriormente numeros aleatorios
		Random rand = new Random();
		
		// Creamos la variable valor para almacenar el valor a buscar que introduzca el usuario
		int valor = 0;
		
		// Creamos el scanner
		Scanner reader = new Scanner(System.in);
		
		// Rellenamos la tabla con numeros aleatorios entre el 1 y el 10
		for (int i = 0 ; i < enteros.length ; i++) {
			enteros[i] = rand.nextInt(1,11);
		}
		
		// Mostramos el funcionamiento del programa al usuario
		System.out.println("Busca un número en mi tabla. Te diré las posiciones en las que se encuentra");
		System.out.println();
		
		// Pedimos el valor a buscar al usuario. Si introduce un numero menor que 1 o mayor que 10 se le seguira preguntando
		do {
			try {
							
				// Pedimos el valor al usuario
				System.out.print("Introduzca el número a buscar : ");
				valor = reader.nextInt();
									
				// Si no introduce un numero entre el 1 y el 10 se le muestra el siguiente mensaje
				assert (valor >= 1 && valor <= 10) : "El número debe estar comprendido entre 1 y 10 (incluidos)";
							
				// Mostramos el mensaje del error de asercion
				} catch (AssertionError e) {
					System.err.println(e.getMessage());
							
				// Mostramos el mensaje del error de no introducir un numero entero
				} catch (InputMismatchException e) {
					System.err.println("Introduzca un número entero");
					reader.next();
				}
			} while (valor < 1 || valor > 10);
		
		// Buscamos el valor
		for (int i = 0 ; i < enteros.length ; i++) {
			
			// Si el valor es igual que el numero de la posicion actual
			if (valor == enteros[i]) {
				System.out.println(valor + " -> " + i);
			}
		}
		
		// Mostramos el contenido de la tabla por si el usuario quiere comprobar el resultado
		System.out.println();
		System.out.println("Si quieres puedes comprobar el resultado");
		System.out.println(Arrays.toString(enteros));
		
		// Cerramos el scanner
		reader.close();
		
		
	}

}


