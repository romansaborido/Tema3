package boletin4_bidimesional;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio1 {

public static void main(String[] args) {
		
		// Creamos la clase random
		Random rand = new Random();
		
		// Creamos el array bidimensional numerosAleatorios de 6 por 10
		int numerosAleatorios[][] = new int[6][10];
		
		// Creamos el array unidimensional minMax para almacenar el resultado de la funcion
		int minMax[];
		
		// Asignamos los valores al array
		for (int i  = 0 ; i < numerosAleatorios.length ; i++) {
			for (int j = 0 ; j < numerosAleatorios[i].length; j++) {
				numerosAleatorios[i][j] = rand.nextInt(0,1001);
			}
		}
		
		// Asignamos el resultado de la funcion a la tabla minMax
		minMax = minMax(numerosAleatorios);
		
		// Mostramos el titulo de la tabla
		System.out.println("Tabla de números aleatorios");
		System.out.println();
		
		// Mostramos la tabla
		for (int i  = 0 ; i < numerosAleatorios.length ; i++) {
			for (int j = 0 ; j < numerosAleatorios[i].length; j++) {
				System.out.print(numerosAleatorios[i][j] + "\t");
			}
			System.out.println();
		}
		
		// Salto de linea
		System.out.println();
		
		// Mostramos el resultado: valor minimo y maximo
		System.out.println("Valor minimo y valor maximo -> " + Arrays.toString(minMax));
	}
	
	static int[] minMax(int t[][]) {
		
		// Creamos el array de longitud 2 unidimensional a devolver
		int tabla[] = new int[2];
		
		// Creamos la variable valorMin y valorMax y le asignamos el primer valor de la tabla
		int valorMin = t[0][0];
		int valorMax = t[0][0];
		
		// Recorremos el array proporcionado
		for (int i  = 0 ; i < t.length ; i++) {
			for (int j = 0 ; j < t[i].length; j++) {
				if (t[i][j] < valorMin) {
					valorMin = t[i][j];
				}
				if (t[i][j] > valorMax) {
					valorMax = t[i][j];
				}
			}
		}
		
		// Asignamos los dos valores (minimo y maximo en nuestro array unidimensional)
		tabla[0] = valorMin;
		tabla[1] = valorMax;
		
		// Devolvemos el array
		return tabla;
	}

}
