package boletin5;

import java.util.Random;

public class Ejercicio3 {

	// Creamos la clase random
	static Random rand = new Random();

	public static void main(String[] args) {

		// Generamos una tabla ordenada de 4 por 5
		int tabla[][] = new int[3][5];
		
		tabla[0][0] = 1;
		tabla[0][1] = 2;
		tabla[0][2] = 3;
		tabla[0][3] = 4;
		tabla[0][4] = 5;
				
		tabla[1][0] = 6;
		tabla[1][1] = 7;
		tabla[1][2] = 8;
		tabla[1][3] = 9;
		tabla[1][4] = 10;
				
		tabla[2][0] = 11;
		tabla[2][1] = 12;
		tabla[2][2] = 13;
		tabla[2][3] = 14;
		tabla[2][4] = 15;
		
		// Título de la tabla 
		System.out.println("1 al 15 - Ordenado");
				
		// Mostramos la tabla ordenada
		for (int i = 0 ; i < tabla.length ; i++) {
			for (int j = 0 ; j < tabla[i].length ; j++) {
				System.out.print(tabla[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println();
				
		// Desordenamos la tabla a traves de la funcion
		desordenar(tabla);
				
		// Título de la tabla desordenada
		System.out.println("1 al 15 - Desordenado");
				
		// Imprimimos la tabla ya desordenada
		for (int i = 0 ; i < tabla.length ; i++) {
			for (int j = 0 ; j < tabla[i].length ; j++) {
				System.out.print(tabla[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println();
	}

	static void desordenar(int t[][]) {

		// Creamos esta variable para generar una posicion de fila aleatoria
		int posicionRandomFila = 0;

		// Creamos esta variable para generar una posicion de columna aleatoria
		int posicionRandomColumna = 0;

		// Creamos la variable aux para almacenar el valor de la posicion i
		int aux;

		// Recorremos la tabla
		for (int i = 0; i < t.length; i++) {
			for (int j = 0; j < t[i].length; j++) {

				// Generamos un numero de fila random
				posicionRandomFila = rand.nextInt(0, t.length);

				// Generamos un numero de columna random
				posicionRandomColumna = rand.nextInt(0, t[i].length);

				// Almacenamos en aux el valor de la posicion i y j
				aux = t[i][j];

				// Machacamos el valor de i y j por un valor random de la tabla
				t[i][j] = t[posicionRandomFila][posicionRandomColumna];

				// Asignamos aux a la posicion random
				t[posicionRandomFila][posicionRandomColumna] = aux;
			}
		}

	}

}
