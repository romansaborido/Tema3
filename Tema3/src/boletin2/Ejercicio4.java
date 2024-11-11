package boletin2;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		// Creamos el array llamado puntuaciones de longitud 8
		int puntuaciones[] = new int[8];
		
		// Creamos la variable puntuacion para ir almacenando las puntuaciones de los jugadores
		int puntuacion = 0;
		
		// Creamos el scanner
		Scanner reader = new Scanner(System.in);
		
		// Mostramos el funcionamiento del programa
		System.out.println("Introduzca las puntuaciones de los distintos juadores del torneo y visualiza la clasificación");
		System.out.println();
		
		
		// Pedimos la puntuacion del jugador al usuario de los jugadores al usuario
		for (int i = 0 ; i < puntuaciones.length ; i++) {
			
			// Pedimos que introduzca la puntuacion de cada jugador al usuario
			do {
				try {
					System.out.print("Introduzca la puntuacion del jugador " + (i + 1) + ": " );
					puntuacion = reader.nextInt();
					assert (puntuacion >= 1000 && puntuacion <= 2800) : "La puntuación mínima es 1000 y la máxima 2800";
				} catch (AssertionError e) {
					System.err.println(e.getMessage());
				} catch (InputMismatchException e) {
					System.err.println("Introduzca un número entero");
					reader.next();
				}
			} while (puntuacion < 1000 || puntuacion > 2800);
			
			// Asignamos la puntuacion del jugador al array
			puntuaciones[i] = puntuacion;
			
		}
		
		// Salto de linea
		System.out.println();
		
		// Ordenamos las puntuaciones del array 
		Arrays.sort(puntuaciones);
		
		// Mostramos la clasificación
		for (int i = puntuaciones.length - 1 ; i > 0 ; i--) {
			System.out.println(puntuaciones[i]);
		}
		
		// Cerramos el scanner
		reader.close();
	}

}
