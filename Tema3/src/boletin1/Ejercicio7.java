package boletin1;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		
		// Creamos la variable temperaturaMes para ir almacenando la temperatura que introduzca el usuario
		int temperaturaMes;
		
		// Creamos el array temperaturas de longitud 12
		int temperaturas[] = new int[12];
		
		// Creamos el scanner
		Scanner reader = new Scanner(System.in);
		
		// Pedimos los valores del array al usuario (temperaturas mensuales)
		for (int i = 0 ; i < temperaturas.length ; i++) {
			
			// Si la posicion del array es menor que 9 mostramos el mes con un cero a la izquierda
			if (i < 9) {
				System.out.println("Introduzca la temperatura media del 0" + (i + 1) + "/2024");
			} else {
				System.out.println("Introduzca la temperatura media del " + (i + 1) + "/2024");
			}
			
			// Leemos la temperatura que introduzca el usuario y la asignamos en el array
			temperaturaMes = reader.nextInt();
			temperaturas[i] = temperaturaMes;
		}
		
		// Salto de linea
		System.out.println();
		
		// Creamos el diagrama
		for (int i = 0 ; i < temperaturas.length ; i++) {
			
			// Si la posicion del array es menor que 9 mostramos el mes con un cero a la izquierda
			if (i < 9) {
				System.out.print("0" + (i + 1) + "/2024 |");
			} else {
				System.out.print((i + 1) + "/2024 |");
			}
			
			// Imprimimos asteriscos hasta el valor de la posicion actual del array
			for (int j = 0 ; j < temperaturas[i] ; j++) {
				System.out.print("#");
			}
		System.out.println();
		}
		
		// Cerramos el scanner
		reader.close();
		
		
	}

}
