package boletin1;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		// Creamos el array diezNumeros de longitud 10 
		int diezNumeros[] = new int[10];
		
		// Creamos la variable numeroUsuario para almacenar los numeros que introduzca el usuario
		int numeroUsuario;
		
		// Creamos el scanner
		Scanner reader = new Scanner(System.in);
		
		// Pedimos los valores del array
		for (int i = 0 ; i < diezNumeros.length ; i++) {
			System.out.print("Introduzca un número entero: ");
			numeroUsuario = reader.nextInt();
			diezNumeros[i] = numeroUsuario;
		}
		
		// Mostramos los valores del array en orden invertido
		for (int i = 9 ; i >= 0 ; i--) {
			System.out.println(diezNumeros[i]);
		}

		// Cerramos el scanner
		reader.close();
		
		
	}

}
