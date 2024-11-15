package boletin4;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		// Creamos la tabla llamada numerosEnteros de longitud 10
		int numerosEnteros[] = new int[10];
		
		// Creamos la clase random para generar numeros aleatorios
		Random rand = new Random();
		
		// Asignamos los valores del array
		for (int i = 0 ; i < numerosEnteros.length ; i++) {
			numerosEnteros[i] = rand.nextInt(1,11);
		}
		
		// Imprimimos la tabla
		System.out.println(Arrays.toString(numerosEnteros));
		
		// Salto de linea
		System.out.println();
		
		// Llamamos a la funcion e imprimimos su valor
		System.out.println("Suma de todos los valores de la tabla -> " + sumaValores(numerosEnteros));
		
	}
	
	
	static int sumaValores(int[] tabla) {
		
		// Creamos la variable a devolver
		int suma = 0;
		
		// Calculamos la suma de todos los valores del array
		for (int i = 0 ; i < tabla.length ; i++) {
			suma += tabla[i];
		}
		
		// Devolvemos el valor a la variable suma
		return suma;
		
	}

}
