package boletin4;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {

		// Creamos el scanner
		Scanner reader = new Scanner(System.in);

		// Creamos la variable longitudArray para almacenar la longitud de la tabla que introduzca el usuario
		int longitudArray = 0;

		// Creamos la variable valorFinal para almacenar el valor maximo del rango
		int valorFinal = 0;

		// Creamos el array tablaPares para almacenar el resultado de la funcion
		int tablaPares[] = new int[longitudArray];
		
		// Pedimos al usuario que introduzca la longitud del array
		do {
			try {
				System.out.println("Introduzca la longitud de la tabla");
				longitudArray = reader.nextInt();
				assert (longitudArray > 0) : "Introduzca un número mayor que 0";
			} catch (AssertionError e) {
				System.err.println(e.getMessage());
			} catch (InputMismatchException e) {
				System.err.println("Introduzca un número entero");
			} finally {
				reader.nextLine();
			}
		} while (longitudArray <= 0);

		// Pedimos al usuario que introduzca la longitud del array
		do {
			try {
				System.out.println("Introduzca el valor final de la tabla");
				valorFinal = reader.nextInt();
				assert (valorFinal > 2) : "Introduzca un número mayor que 2";
			} catch (AssertionError e) {
				System.err.println(e.getMessage());
			} catch (InputMismatchException e) {
				System.err.println("Introduzca un número entero");
			} finally {
				reader.nextLine();
			}
		} while (valorFinal < 2);

		// Almacenamos el resultado de la funcion
		System.out.println(Arrays.toString(rellenaPares(longitudArray, valorFinal)));
		
	}
	
	static int[] rellenaPares(int longitud, int fin) {

		// Creamos la tabla a devolver de la longitud que el usuario indique
		int tabla[] = new int[longitud];

		// Creamos la clase random para generar numeros aleatorios
		Random rand = new Random();
		
		// Creamos la variable contador para almacenar el numero de veces que almacenamos un valor par en el arary
		int contador = 0;
		
		while (contador < tabla.length) {
			
		}
		

		// Ordenamos la tabla
		Arrays.sort(tabla);

		return tabla;
	}
	
}
