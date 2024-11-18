package englishexercises;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {
		
		// Creamos el array de longitud 10
		int array[] = new int[10];
		
		// Creamos la clase random para generar la posicion de la mosca aleatoriamente
		Random rand = new Random();
		
		// Creamos la variable posicionMosca para ir almacenando la posicion de la mosca
		int posicionMosca = rand.nextInt(0,10);
		
		// Creamos la variable posicionUsuario para ir almacenando la posicion que introduzca el usuario
		int posicionUsuario = 0;
		
		// Creamos el scanner
		Scanner reader = new Scanner(System.in);
		
		// Asignamos la mosca (1) en la posicion aleatoria
		array[posicionMosca] = 1;
		
		// Creamos el bucle para preguntar al usuario
		
			do {
				
				try {
					System.out.println("Introduzca la posicion en la que tu crees que esta la mosca");
					posicionUsuario = reader.nextInt();
					assert (posicionUsuario >= 0 && posicionUsuario <= 9) : "Introduzca una posicion valida (0 a 9)";
				} catch (AssertionError e) {
					System.err.println(e.getMessage());
				} catch (InputMismatchException e) {
					System.err.println("Introduzca un número entero");
				}
				
				if (posicionUsuario == 0) {
					if (array[posicionUsuario + 1] == 1) {
						System.out.println("Has estado muy cerca. Has espantado a la mosca y ha cambiado de posicion");
						Arrays.fill(array, 0);
						posicionMosca = rand.nextInt(0,10);
						array[posicionMosca] = 1;
					} else {
						System.out.println("La mosca está lejos. No se ha movido de posicion");
					}
				} else if (posicionUsuario == 9) {
					if (array[posicionUsuario - 1] == 1) {
						System.out.println("Has estado muy cerca. Has espantado a la mosca y ha cambiado de posicion");
						Arrays.fill(array, 0);
						posicionMosca = rand.nextInt(0,10);
						array[posicionMosca] = 1;
					} else {
						System.out.println("La mosca está lejos. No se ha movido de posicion");
					}
				} else if (array[posicionUsuario - 1] == 1 || array[posicionUsuario + 1] == 1) {
					System.out.println("Has estado muy cerca. Has espantado a la mosca y ha cambiado de posicion");
					Arrays.fill(array, 0);
					posicionMosca = rand.nextInt(0,10);
					array[posicionMosca] = 1;
				} else {
					System.out.println("Has atrapado a la mosca");
				}
				
			} while (array[posicionUsuario] != 1);
			
			// Cerramos el scanner
			reader.close();
		
		

	}

}
