package boletin1;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		// Creamos el array diezNumeros de longitud 10
		double diezNumeros[] = new double[10];
		
		// Creamos la variable numeroUsuario para almacenar los numeros que introduzca el usuario
		double numeroUsuario;
		
		// Creamos la variable suma para almacenar la suma de todos los valores del array
		double suma = 0;
		
		// Creamos las variable valorMin y valorMax para almacenar el valor minimo y el maximo
		double valorMin;
		double valorMax;
		
		// Creamos el scanner
		Scanner reader = new Scanner(System.in);
		
		// Pedimos los valores del array al usuario
		for (int i = 1 ; i < 10 ; i++) {
		
			do {
				try {
					System.out.print("Introduzca un número entero: ");
					numeroUsuario = reader.nextInt();
					diezNumeros[i] = numeroUsuario;
				} catch (AssertionError e) {
					
				}
				} while (numeroUsuario <= 0);
				
		}
		
		// Asignamos el primer valor del array a las variables valorMin y valorMax
		valorMin = diezNumeros[0];
		valorMax = diezNumeros[0];
		
		// Recorremos el array, calculamos la suma de todos los valores, el valor maximo y el valor minimo
		for (int i = 0 ; i < 10 ; i++) {
			suma += diezNumeros[i];
			
			if (diezNumeros[i] < valorMin) {
				valorMin = diezNumeros[i];
			}
			if (diezNumeros[i] > valorMax) {
				valorMax = diezNumeros[i];
			}
		}
		
		// Mostramos los resultados
		System.out.println();
		System.out.println(Arrays.toString(diezNumeros));
		System.out.println("Valor mínimo: " + valorMin);
		System.out.println("Valor máximo: " + valorMax);
		System.out.println("La suma de todos los valores es: " + suma);

		// Cerramos el scanner
		reader.close();

		
	}

}
