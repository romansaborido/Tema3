package boletin5;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		// Creamos la clase random
		Random rand = new Random();
		
		// Creamos el scanner
		Scanner reader = new Scanner(System.in);
		
		// Creamos un array bidimensional llamado numerosEnteros de 4 por 5
		int numerosEnteros[][] = new int[4][5];
		
		// Creamos un boleano para almacenar el resultado de la funcion
		boolean busqueda;
		
		// Creamos una variable llamada valorBuscar para almacenar el numero que el usuario quiera buscar
		int valorBuscar = 0;
		
		// Asignamos los valores del array (numeros enteros aleatorios del 1 al 100)
		for (int i = 0 ; i < numerosEnteros.length ; i++) {
			for (int j = 0 ; j < numerosEnteros[i].length ; j++) {
				numerosEnteros[i][j] = rand.nextInt(1,101);
			}
		}
		
		// Título de la tabla
		System.out.println("Tabla de números aleatorios del 1 al 100");
		System.out.println();
		
		// Mostramos la tabla
		for (int i = 0 ; i < numerosEnteros.length ; i++) {
			for (int j = 0 ; j < numerosEnteros[i].length ; j++) {
				System.out.print(numerosEnteros[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println();
		
		// Pedimos al usuario que introduzca el valor a buscar en la tabla
		do {
			try {
				System.out.print("Introduzca un valor a buscar en la tabla: ");
				valorBuscar = reader.nextInt();
				assert (valorBuscar >= 1 && valorBuscar <= 100) : "Introduzca un número del 1 al 100 (incluidos)";
				System.out.println();
			} catch (AssertionError e) {
				System.err.println(e.getMessage());
				System.out.println();
			} catch (InputMismatchException e) {
				System.err.println("Introduzca un número entero");
				System.out.println();
			} finally {
				reader.nextLine();
			}
		} while (valorBuscar < 1 || valorBuscar > 100);
		
		// Almacenamos el resultado de la funcion en el booleano busqueda
		busqueda = buscar(numerosEnteros, valorBuscar);
		
		// Mostramos el resultado de la busqueda
		if (busqueda) {
			System.out.println("El número SÍ se encuentra en la tabla");
		} else {
			System.out.println("El número NO se encuentra en la tabla");
		}
		
		// Cerramos el scanner
		reader.close();
		
	}
	
	static boolean buscar(int t[][], int valor) {
		
		// Creamos el booleano a devolver y lo inicializamos a false 
		boolean busqueda = false;
		
		// Creamos la variable contadorFilas para ir controlando la posicion del valor cuando estamos realizando la busqueda
		int contadorFilas = 0;
		
		// Creamos la variable contadorColumnas para ir controlando la posicion del valor cuando estamos realizando la busqueda
		int contadorColumnas = 0;
		
		// Recorremos la tabla comprobando si el valor a buscar es igual al numero actual
		while (contadorFilas < t.length && !busqueda) {
			while (contadorColumnas < t[contadorFilas].length && !busqueda) {
				if (valor == t[contadorFilas][contadorColumnas]) {
					busqueda = true;
				}
				contadorColumnas++;
			}
			contadorFilas++;
			contadorColumnas = 0;
		}
		
		// Devolvemos el booleano
		return busqueda;
	}

}
