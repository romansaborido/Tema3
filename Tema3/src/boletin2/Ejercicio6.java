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
		
		// Creamos la variable posicionUsuario para almacenar la posicion de un valor a buscar en la tabla cuponUsuario
		int posicionUsuario = 0;
		
		// Creamos la variable posicionGanador para almacenar la posicion de un valor a buscar en la tabla cuponGanador
		int posicionGanador = 0;
		
		// Creamos la variable busqueda y busqueda2 para almacenar los resultados de las busquedas
		int busqueda;
		int busqueda2;
		
		// Creamos la variable numeroAleatorio para ir almacenando los numeros aleatorios que vamos generando
		int numeroAleatorio;
		
		// Creamos la clase random para generar numeros aleatorios
		Random rand = new Random();
		
		// Asignamos los valores del array cuponUsuario
		while (posicionUsuario < cuponUsuario.length) {
			numeroAleatorio = rand.nextInt(1,50);
			Arrays.sort(cuponUsuario);
			busqueda = Arrays.binarySearch(cuponUsuario, numeroAleatorio);
			if (busqueda < 0) {
				cuponUsuario[0] = numeroAleatorio;
				posicionUsuario++;
			}
		}
		
		// Asignamos los valores del array cuponGanador
		while (posicionGanador < cuponGanador.length) {
			numeroAleatorio = rand.nextInt(1,50);
			Arrays.sort(cuponGanador);
			busqueda = Arrays.binarySearch(cuponUsuario, numeroAleatorio);
			if (busqueda < 0) {
				cuponUsuario[0] = numeroAleatorio;
				posicionGanador++;
			}
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
			busqueda2 = Arrays.binarySearch(cuponGanador, cuponUsuario[i]);
			
			if (busqueda2 >= 0) {
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
