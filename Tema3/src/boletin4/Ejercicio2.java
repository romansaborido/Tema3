package boletin4;

import java.util.Random;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		// Creamos el array llamado t de longitud 10
		int t[] = new int[10];
		
		// Creamos la clase random para generar numeros aleatorios
		Random rand = new Random();
		
		// Asignamos los valores del array
		for (int i = 0 ; i < t.length ; i++) {
			t[i] = rand.nextInt(1,11);
		}
		

	}
	
	static int valorMaximo(int t[]) {
		
		// Creamos la variable a devolver y la inicializamos
		int valorMaximo = 0;
		
		
		
		
		// Devolvemos el valor a la variable valorMaximo
		return valorMaximo;
	}

}
