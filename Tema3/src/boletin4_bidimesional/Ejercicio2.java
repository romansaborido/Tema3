package boletin4_bidimesional;

import java.util.Random;

public class Ejercicio2 {

public static void main(String[] args) {
		
		// Creamos la clase random
		Random rand = new Random();
		
		// Creamos la tabla bidimensional numerosAleatorios de 4 por 4
		int numerosAleatorios[][] = new int[4][4];
		
		// Creamos la tabla bidimensional tablaPorColumnas para almacenar el resultado de la funcion
		int tablaPorColumnas[][];
		
		// Rellenamos la tabla con numeros aleatorios del 1 al 10
		for (int i = 0 ; i < numerosAleatorios.length ; i++) {
			for (int j = 0 ; j < numerosAleatorios[i].length ; j++) {
				numerosAleatorios[i][j] = rand.nextInt(1,11);
			}
		}
		
		// Asignamos el resultado de la funcion a tablaPorColumnas
		tablaPorColumnas = leerPorColumnas(numerosAleatorios);
		
		// Mostramos el titulo de la tabla numeros aleatorios
		System.out.println("Tabla de números aleatorios");
		System.out.println();
		
		// Mostramos la tabla numeros aleatorios
		for (int i = 0 ; i < numerosAleatorios.length ; i++) {
			for (int j = 0 ; j < numerosAleatorios[i].length ; j++) {
				System.out.print(numerosAleatorios[i][j] + "\t");
			}
		System.out.println();
		}
		
		// Salto de linea x2
		System.out.println();
		System.out.println();
		
		// Mostramos el titulo de la tabla por columnas
		System.out.println("Tabla de números aleatorios por columnas");
		System.out.println();
		
		// Mostramos la tabla por columnas
		for (int i = 0 ; i < tablaPorColumnas.length ; i++) {
			for (int j = 0 ; j < tablaPorColumnas[i].length ; j++) {
				System.out.print(tablaPorColumnas[i][j] + "\t");
			}
		System.out.println();
		}
	}
	
	static int[][] leerPorColumnas(int t[][]) {
		
		// Creamos la tabla bidimensional a devolver
		int tablaColumnas[][] = new int[t[0].length][t.length];
		
		// Asignamos los valores del array tablaColumnas
		for (int j = 0 ; j < t[0].length ; j++) {
			for (int i = 0 ; i < t.length ; i++) {
				tablaColumnas[j][i] = t[i][j];
			}
		}
		
		// Devolvemos la tabla
		return tablaColumnas;
	}

}
