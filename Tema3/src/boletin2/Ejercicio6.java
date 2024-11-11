package boletin2;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio6 {

	public static void main(String[] args) {
	
		// Creamos la tabla cuponUsuario de longitud 6
		int cuponUsuario[] = new int[6];
		
		// Creamos la tabla cuponGanador de longitud 6
		int cuponGanador[] = new int[6];
		
		// Creamos la variable numeroAciertos para almacenar el numero de aciertos
		int numeroAciertos = 0;
		
		// Creamos la variable posicion para almacenar la posicion de un valor a buscar
		int posicion;
		
		// Creamos la clase random para generar numeros aleatorios
		Random rand = new Random();
		
		// Asignamos los valores del array cuponUsuario
		for (int i = 0 ; i < cuponUsuario.length ; i++) {
			cuponUsuario[i] = rand.nextInt(1,50);
		}
		
		// Asignamos los valores del array cuponGanador
		for (int i = 0 ; i < cuponGanador.length ; i++) {
			cuponGanador[i] = rand.nextInt(1,50);
		}
		
		// Ordenamos los valores del array cuponGanador
		Arrays.sort(cuponGanador);
		
		// Damos la bienvenida al usuario
		System.out.println("¡Bienvenido a la primitiva del día!");
		System.out.println();
		
		// Mostramos al usuario su cupon
		System.out.println("Su cupón:");
		System.out.println(Arrays.toString(cuponUsuario));
		System.out.println();
		
		// Mostramos al usuario el cupón ganador
		System.out.println("Cupón ganador del día: ");
		System.out.println(Arrays.toString(cuponGanador));
		System.out.println();
		
		// Buscamos los valores del array cuponUsuario en el array ordenado cuponGanador
		for (int i = 0 ; i < cuponUsuario.length ; i++) {
			posicion = Arrays.binarySearch(cuponGanador, cuponUsuario[i]);
			
			if (posicion >= 0) {
				numeroAciertos++;
			}	
		}
		
		// Mostramos los resultados
		if (numeroAciertos > 0) {
			System.out.println("Número de aciertos: " + numeroAciertos);
		} else {
			System.out.println("No tienes ningún acierto :(");
		}
		
		
	}

}
