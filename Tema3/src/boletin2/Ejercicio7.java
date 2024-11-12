package boletin2;

import java.util.Arrays;

public class Ejercicio7 {

	public static void main(String[] args) {
		
		// Creamos el array secuenciaValores e inicializamos el tamaño a la variable tamaño
		int secuenciaValores[] = new int[55];
		
		// Creamos la variable inicio para ir controlando el inicio del rango del fill
		int inicio = 0;
		
		// Creamos el for para ir generando el valor a rellenar
		for (int i = 1 ; i <= 10 ; i++) {
			Arrays.fill(secuenciaValores, inicio, inicio + i, i);
			
			// Incrementamos inicio con el valor a rellenar
			inicio += i;
		}
		
		// Mostramos el array
		System.out.println(Arrays.toString(secuenciaValores));
		

	}

}
