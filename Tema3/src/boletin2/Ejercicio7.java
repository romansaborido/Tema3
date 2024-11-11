package boletin2;

import java.util.Arrays;

public class Ejercicio7 {

	public static void main(String[] args) {
		
		// Creamos el array secuenciaValores de longitud 55
		int secuenciaValores[] = new int[1];
		
		// Asignamos los valores del array
		for (int i = 1 ; i <= 10 ; i++) {
			System.out.print(i);
			for (int j = 0 ; j < i - 1 ; j++) {
				System.out.print(i);
				Arrays.fill(secuenciaValores, j);
			}
			
		}
		
		// Mostramos el array
		System.out.println(Arrays.toString(secuenciaValores));
		

	}

}
