package boletin5;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio2 {
	
	public static void main(String[] args) {
		
		// Creamos la tabla ordenada de los números del 1 al 10
		int tabla[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	
		// Título de la tabla 
		System.out.println("1 al 10 - Ordenado");
		
		// Mostramos la tabla ordenada
		System.out.println(Arrays.toString(tabla));
		System.out.println();
		
		// Desordenamos la tabla a traves de la funcion
		desordenar(tabla);
		
		// Título de la tabla desordenada
		System.out.println("1 al 10 - Desordenado");
		
		// Imprimimos la tabla ya desordenada
		System.out.println(Arrays.toString(tabla));
	}
	
	static void desordenar(int t[]) {
		
		// Creamos la clase random 
		Random rand = new Random();
		
		// Creamos esta variable para generar una posicion aleatoria
		int posicionRandom;
		
		// Creamos la variable aux para almacenar el valor de la posicion i 
		int aux;
		
		// Recorremos la tabla
		for (int i = 0 ; i < t.length ; i++) {
			
			// Generamos la posicion aleatoria
			posicionRandom = rand.nextInt(0, t.length);
			
			// Almaceno en aux el valor de la posicion i
			aux = t[i];
			
			// Machacho la posicion i con el valor de la posicion random
			t[i] = t[posicionRandom];
			
			// Almacenamos en la posicion aleatoria el valor de aux
			t[posicionRandom] = aux;
		}
			
		
		
	}

}
