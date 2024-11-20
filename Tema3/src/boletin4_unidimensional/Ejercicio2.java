package boletin4_unidimensional;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		// Creamos el array llamado tablaEnteros de longitud 10
		int tablaEnteros[] = new int[10];
		
		// Creamos la variable valorMaximo para almacenar el resultado de la funcion
		int valorMaximo;
		
		// Creamos la clase random para generar numeros aleatorios
		Random rand = new Random();
		
		// Asignamos los valores del array
		for (int i = 0 ; i < tablaEnteros.length ; i++) {
			tablaEnteros[i] = rand.nextInt(1,11);
		}
		
		// Almacenamos el resultado de la funcion
		valorMaximo = valorMaximo(tablaEnteros);
		
		// Imprimimos la tabla
		System.out.println(Arrays.toString(tablaEnteros));
				
		// Salto de linea
		System.out.println();
		
		// Imprimimos el resultado
		System.out.println("Valor maximo de la tabla -> " + valorMaximo);

	}
	
	static int valorMaximo(int t[]) {
		
		// Creamos la variable a devolver y la inicializamos al primer valor de la tabla
		int valorMaximo = t[0];
		
		// Recorremos la tabla y si el valor que leemos es mayor que valorMaximo actualizamos valorMaximo
		for (int valor : t) {
			if (valor > valorMaximo) {
				valorMaximo = valor;
			}
		}
		
		// Devolvemos el valor a la variable valorMaximo
		return valorMaximo;
	}

}
