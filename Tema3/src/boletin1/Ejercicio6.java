package boletin1;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		
		// Creamos el array ochoNumeros de longitud 8
		int ochoNumeros[] = new int[8];
		
		// Creamos la variable numeroUsuario para ir almacenando el numero que introduzca el usuario
		int numeroUsuario;
		
		// Creamos el scanner
		Scanner reader = new Scanner(System.in);
		
		// Pedimos los valores del array al usuario
		for (int i = 0 ; i < ochoNumeros.length ; i++) {
			System.out.print("Introduzca un número entero: ");
			numeroUsuario = reader.nextInt();
			ochoNumeros[i] = numeroUsuario;
		}
		
		// Salto de linea
		System.out.println();
		
		// Mostramos los valores del array y mostramos si es par o impar 
		for (int i = 0 ; i < ochoNumeros.length ; i++) {
			if (ochoNumeros[i] % 2 == 0) {
				System.out.println(ochoNumeros[i] + " -> Par");
			} else {
				System.out.println(ochoNumeros[i] + " -> Impar");
			}
		}
		
		// Cerramos el scanner
		reader.close();
	}

}
