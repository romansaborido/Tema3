package boletin4_unidimensional;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		// Creamos la tabla numeros de longitud 15
		int numeros[] = new int[15];
		
		// Creamos la tabla resultadoBusqueda para almacenar el resultado de la funcion
		int resultadoBusqueda[];
		
		// Creamos la variable valorBuscar para almacenar el valor a buscar que introduzca el usuario
		int valorBuscar = 0;
		
		// Creamos la clase random
		Random rand = new Random();
		
		// Creamos el scanner
		Scanner reader = new Scanner(System.in);
		
		// Asignamos los valores del array
		for (int i = 0 ; i < numeros.length ; i++) {
			numeros[i] = rand.nextInt(0, 11);
		}
		
		// Mostramos el funcionamiento del programa al usuario
		System.out.println("Voy a generar una tabla de 15 números aleatorios desde el 0 al 10");
		System.out.println();
		
		// Pedimos al usuario que busque un numero en la tabla
		do {
			try {
				System.out.println("Introduzca un valor a buscar en la tabla y te diré en las posiciones de la tabla en las que se encuentra");
				valorBuscar = reader.nextInt();
				assert (valorBuscar >= 0 && valorBuscar <= 10) : "Introduzca un número válido (0 al 10 incluidos)";
			} catch (AssertionError e) {
				System.err.println(e.getMessage());
			} catch (InputMismatchException e) {
				System.err.println("Introduzca un número entero");
			} finally {
				reader.nextLine();
			}
		} while (valorBuscar < 0 || valorBuscar > 11);
		
		// Almacenamos el resultado de la funcion en la variable resultadoBusqueda
		resultadoBusqueda = buscarTodos(numeros, valorBuscar);
		
		// Salto de linea
		System.out.println();
		
		// Imprimimos el resultado
		System.out.println("Resultado -> " + Arrays.toString(resultadoBusqueda));
		
		// Salto de linea
		System.out.println();
				
		// Imprimimos la tabla para que el usuario compruebe el resultado
		System.out.println("Si deseas puedes comprobar el resultado");
		System.out.println(Arrays.toString(numeros));
		
		// Cerramos el scanner
		reader.close();
	}
	
	static int[] buscarTodos(int t[], int valor) {
		
		// Creamos la tabla que vamos a devolver
		int tabla[];
		
		int indice = 0;
		
		int numVeces = 0;
		
		for (int i = 0 ; i < t.length ; i++) {
			if (valor == t[i]) {
				numVeces++;
			}
		}
		
		tabla = new int[numVeces];
		
		for (int i = 0 ; i < tabla.length ; i++) {
			while (indice < t.length && valor != t[indice]) {
				indice++;
			}
			if (indice < t.length) {
				tabla[i] = indice;
				indice++;
			}
		}
		
		// Devolvemos la tabla
		return tabla;
	}

}
