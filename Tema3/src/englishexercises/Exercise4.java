package englishexercises;

import java.util.Random;
import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) {
		
		// Creamos la clase random
		Random rand = new Random();
		
		// Creamos el scanner
		Scanner reader = new Scanner(System.in);
		
		// Creamos el array de longitud 20
		String array[] = new String[20];
		
		// Creamos la variable posicionMina para ir almacenando la posicion aleatoria de la mina
		int posicionMina;
		
		// Creamos la variable contador para ir controlando el numero de minas almacenadas en el array
		int contador = 0;
		
		// Asignamos las minas aleatoriamente en el array
		while (contador <= 6) {
			posicionMina = rand.nextInt(0,20);
			if (!(array[posicionMina].equalsIgnoreCase("*"))) {
				array[posicionMina] = "*";
				contador++;
			}
		}
		
		

	}

}
