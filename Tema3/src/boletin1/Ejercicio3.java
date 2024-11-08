package boletin1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {

		// Creamos el array diezNumeros de longitud 10
		int diezNumeros[] = new int[10];

		// Creamos la variable numeroUsuario para almacenar los numeros que introduzca el usuario
		int numeroUsuario = 0;

		// Creamos el scanner
		Scanner reader = new Scanner(System.in);

		// Pedimos los valores del array
		for (int i = 0; i < diezNumeros.length; i++) {
			
			// Mientras que el numero no sea entero se le seguira preguntando
			do {
				try {

					// Pedimos el numero al usuario
					System.out.print("Introduzca un número entero: ");
					numeroUsuario = reader.nextInt();

					// Asignamos el valor de numeroUsuario a la posicion actual del array
					diezNumeros[i] = numeroUsuario;
					
				// Mostramos el mensaje del error de no introducir un numero entero
				} catch (InputMismatchException e) {
					System.err.println("Introduzca un número");
					reader.next();
				}
			} while (numeroUsuario % 1 != 0);
		}

		// Mostramos los valores del array en orden invertido
		for (int i = 9; i >= 0; i--) {
			System.out.println(diezNumeros[i]);
		}

		// Cerramos el scanner
		reader.close();


	}

}
