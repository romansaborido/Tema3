package boletin1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		// Creamos la variable numeroUsuario donde almacenaremos el numero que introduzca el usuario
		double numeroUsuario = 0;
		
		// Creamos el scanner
		Scanner reader = new Scanner(System.in);
		
		// Creamos el array numerosDecimales de longitud 5
		double numerosDecimales[] = new double[5];
		
		// Pedimos los valores del array y los aplicamos
		for (int i = 0 ; i < numerosDecimales.length ; i++) {
			
			// Mientras que el numero no sea decimal se le seguira preguntando
			do {
				try {
					
					// Pedimos el numero al usuario
					System.out.print("Introduzca un número decimal: ");
					numeroUsuario = reader.nextDouble();
					
					// Asignamos el valor de numeroUsuario a la posicion actual del array
					numerosDecimales[i] = numeroUsuario;
					
					// Si no introduce un numero decimal se le imprimira lo siguiente
					assert (numeroUsuario % 1 != 0) : "El número debe contener decimales";
					
				// Mostramos el mensaje del error de asercion
				} catch (AssertionError e) {
					System.err.println(e.getMessage());
					
				// Mostramos el mensaje del error de no introducir un numero
				} catch (InputMismatchException e) {
					System.err.println("Introduzca un número");
					reader.next();
				}
			} while (numeroUsuario % 1 == 0);
		}
		
		// Mostramos los valores del array en el mismo orden en el que se han introducido los valores
		for (int i = 0 ; i < numerosDecimales.length ; i++) {
			System.out.println(numerosDecimales[i]);
		}
		
		// Cerramos el scanner
		reader.close();
		
		
	}

}
