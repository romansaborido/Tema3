package boletin2;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		// Creamos el array llamado valoresRandom de longitud 30
		int valoresRandom[] = new int[30];
		
		// Creamos la clase random para generar numeros aleatorios
		Random rand = new Random();
		
		// Creamos la variable valor para ir almacenando los valores del array
		int valor;
		
		// Asignamos los valores del array
		for (int i = 0 ; i < valoresRandom.length ; i++) {
			
			// Valor = numero aleatorio entre 0 y 9
			valor = rand.nextInt(0,10);
			
			// Asignamos el valor en la posicion actual del array
			valoresRandom[i] = valor;
		}
		
		// Ordenamos los valores del array
		Arrays.sort(valoresRandom);
		
		// Mostramos el contenido del array
		System.out.println(Arrays.toString(valoresRandom));
		

	}

}
