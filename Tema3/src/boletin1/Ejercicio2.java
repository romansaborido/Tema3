package boletin1;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		// Creamos la variable numeroUsuario donde almacenaremos el numero que introduzca el usuario
		double numeroUsuario;
		
		// Creamos el scanner
		Scanner reader = new Scanner(System.in);
		
		// Creamos el array numerosDecimales de longitud 5
		double numerosDecimales[] = new double[5];
		
		// Pedimos los valores del array y los aplicamos
		for (int i = 0 ; i < numerosDecimales.length ; i++) {
			System.out.print("Introduzca un número decimal: ");
			numeroUsuario = reader.nextDouble();
			numerosDecimales[i] = numeroUsuario;
		}
		
		// Mostramos los valores del array en el mismo orden en el que se han introducido los valores
		for (int i = 0 ; i < numerosDecimales.length ; i++) {
			System.out.println(numerosDecimales[i]);
		}
		
		// Cerramos el scanner
		reader.close();
		
		
	}

}
