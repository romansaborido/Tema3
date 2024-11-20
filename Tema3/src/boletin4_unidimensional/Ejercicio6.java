package boletin4_unidimensional;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		
		// Creamos la clase random
		Random rand = new Random();
		
		// Creamos el scanner
		Scanner reader = new Scanner(System.in);
		
		// Creamos la tablaAleatoria de longitud aleatoria del 1 al 20
		int tablaAleatoria[] = new int[rand.nextInt(1,21)];
		
		// Creamos la tabla sumaSecuencia para almacenar el resultado del array
		int sumaSecuencia [];
		
		// Creamos la variable agrupacion para almacenar el numero en el que se agrupan los valores de su tabla
		int agrupacion = 0;
		
		// Asignamos los valores del array aleatoriamente con numeros del 1 al 20
		for (int i = 0 ; i < tablaAleatoria.length ; i++) {
			tablaAleatoria[i] = rand.nextInt(1,21);
		}
		
		// Mostramos el funcionamiento del programa al usuario
		System.out.println("Voy a crear una tabla de longitud aleatoria y numeros aleatorios (1 al 20). Te la muestro: ");
		
		// Salto de linea
		System.out.println();
		
		// Mostramos la tabla al usuario
		System.out.println(Arrays.toString(tablaAleatoria));
		
		// Salto de linea
		System.out.println();
		
		// Pedimos al usuario el numero en el que quiere que se agrupen los valores de su tabla 
		do {
			try {
				System.out.print("Introduzca el numero en el que quiere que se agrupen los valores de su tabla: ");
				agrupacion = reader.nextInt();
				assert (agrupacion > 2) : "El numero de agrupacion es menor que 2";
			} catch (AssertionError e) {
				System.err.println(e.getMessage());
			} catch (InputMismatchException e) {
				System.err.println("Introduzca un número entero");
			} finally {
				reader.nextLine();
			}
		} while (agrupacion < 2);
		
		// Almacenamos el resultado de la funcion
		sumaSecuencia = suma(tablaAleatoria, agrupacion);
		
		// Mostramos el resultado
		System.out.println(Arrays.toString(sumaSecuencia));
		
		// Cerramos el scanner
		reader.close();
	}
	
	static int[] suma(int t[], int numElementos) {
		
		// Creamos la tabla a devolver
		int tabla[] = new int [t.length - numElementos + 1];
		
		// Creamos la variable suma para ir almacenando la suma de la secuencia de numeros
		int suma = 0;
		
		// Creamos la variable indice para ir contolando la posicion del valor del array que debemos sumar
		int indice;
		
		// Asignamos los valores de la tabla a devolver 
		for (int i = 0 ; i < t.length - numElementos + 1 ; i++) {
			
			// Asignamos el valor de i a indice
			indice = i;
			
			// Sumamos los valores hasta el numElementos que ha proporcionado el usuario
			for (int j = 0 ; j < numElementos ; j++) {
				
				// Sumamos el valor de t en la posicion indice
				suma += t[indice];
				
				// Incrementamos indice para que despues sume el numero siguiente
				indice++;
			}
			
			// Una vez sumada la secuencia de numeros asignamos el valor de suma a la tabla y establecemos de nuevo suma a 0
			tabla[i] = suma;
			suma = 0;
		}
		
		// Devolvemos la tabla
		return tabla;
	}

}
