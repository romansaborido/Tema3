package boletin4_unidimensional;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		// Creamos la tabla llamada numerosEnteros de longitud 10
		int numerosEnteros[] = new int[10];
		
		// Creamos la variable sumaNumerosEnteros para almacenar el resultado de la funcion
		int sumaNumerosEnteros;
		
		// Creamos la clase random para generar numeros aleatorios
		Random rand = new Random();
		
		// Asignamos los valores del array
		for (int i = 0 ; i < numerosEnteros.length ; i++) {
			numerosEnteros[i] = rand.nextInt(1,11);
		}
		
		// Almacenamos el resultado de la funcion
		sumaNumerosEnteros = sumaValores(numerosEnteros);
		
		// Imprimimos la tabla
		System.out.println(Arrays.toString(numerosEnteros));
		
		// Salto de linea
		System.out.println();
		
		// Imprimimos el resultado
		System.out.println("Suma de todos los valores de la tabla -> " + sumaNumerosEnteros);
		
	}
	
	
	static int sumaValores(int tabla[]) {
		
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
