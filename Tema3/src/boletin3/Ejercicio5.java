package boletin3;

import java.util.Random;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		// Creamos el array bidimensional llamado numerosAleatorios de 4 filas por 5 columnas
		int numerosAleatorios[][] = new int[4][5];
		
		// Creamos la variable sumaFilas para ir almacenando la suma de cada una de las filas
		int sumaFilas = 0;
		
		// Creamos la variable sumaColumnas para ir almacenando la suma de cada una de las columnas
		int sumaColumnas = 0;
		
		// Creamosla variable sumaTotal para almacenar la suma total de los valores
		int sumaTotal = 0;
		
		// Creamos la clase random que nos va a permitir generar numeros random
		Random rand = new Random();
		
		// Asignamos los valores del array
		for (int i = 0 ; i < numerosAleatorios.length ; i++) {
			for (int j = 0 ; j < numerosAleatorios[0].length ; j++) {
				numerosAleatorios[i][j] = rand.nextInt(100,1000);
			}
		}
		
		// Calculamos la suma de las filas recorriendo la tabla por filas
		for (int i = 0 ; i < numerosAleatorios.length ; i++) {
			for (int j = 0 ; j < numerosAleatorios[0].length ; j++) {
				System.out.print(numerosAleatorios[i][j] + "\t");
				sumaFilas += numerosAleatorios[i][j];
			}
			System.out.print(sumaFilas + " fila" + i);
			System.out.println();
		}
		
		// Calculamos la suma de las columnas recorriendo la tabla por columnas
		for (int j = 0 ; j < numerosAleatorios[0].length ; j++) {
			for (int i = 0 ; i < numerosAleatorios.length ; i++) {
				sumaColumnas += numerosAleatorios[i][j];
			}
		sumaTotal += sumaColumnas;
		System.out.print(sumaColumnas + "\t");
		}
		
		// Imprimimos el total
		System.out.print(sumaTotal);
	
		
	}

}
