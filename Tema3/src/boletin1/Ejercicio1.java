package boletin1;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		// Creamos el array enterosAleatorios de longitud 10
		int enterosAleatorios[] = new int[10];
				
		// Creamos la clase random
		Random rand = new Random();
				
		// Establecemos los valores del array
		for (int i = 0 ; i < 10 ; i++) {
			enterosAleatorios[i] = rand.nextInt(1,101);
		}
				
		// Mostramos el contenido del array
		System.out.println(Arrays.toString(enterosAleatorios));
				

	}

}
