package boletin4_unidimensional;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		// Creamos el scanner 
		Scanner reader = new Scanner(System.in);
		
		// Creamos la tabla
		int tabla[] = {0, 5, 3, 10, 21, 43, 6, 8, 18};
		
		// Creamos la variable valorBuscar para almacenar el valor a buscar
		int valorBuscar;
		
		// Creamos la variable busqueda para almacenar el resultado de la funcion
		int busqueda;
		
		// Pedimos al usuario que introduzca un valor a buscar 
		System.out.println("Introduzca un valor a buscar. Te dire en que posicion se encuentra. Si no esta en la tabla te devolvere -1");
		valorBuscar = reader.nextInt();	
		
		// Almacenamos el resultado de la funcion 
		busqueda = buscar(tabla, valorBuscar);
		
		// Salto de linea
		System.out.println();
		
		// Imprimimos el resultado de la busqueda
		System.out.println("Resultado de la busqueda -> " + busqueda);
		
		// Salto de linea
		System.out.println();
		
		// Imprimimos la tabla para que el usuario compruebe el resultado
		System.out.println("Si deseas puedes comprobar el resultado");
		System.out.println(Arrays.toString(tabla));
		
		// Cerramos el scanner
		reader.close();
		
	}
	
	static int buscar(int t[], int clave) {
		
		// Creamos la variable busqueda para almacenar el resultado de esta
		int busqueda = 0;
		
		// Creamos la variable posicion para ir almacenando la posicion de la busqueda secuencial
		int posicion = 0;
		
		// Mientras que la posicion sea menor que la longitud de la tabla y la clave no sea igual que el valor
		while (posicion < t.length && clave != t[posicion]) {
			posicion++;
		}
		
		// Si posicion es menor que la longitud de la tabla, busqueda vale posicion, sino -1
		if (posicion < t.length) {
			busqueda = posicion;
		} else {
			busqueda = -1;
		}
		
		// Devolvemos el resultado de la busqueda
		return busqueda;
	}

}
