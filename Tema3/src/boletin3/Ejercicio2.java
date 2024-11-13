package boletin3;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		// Creamos la tabla llamada notas de 4 por 5
		double notasAlumnos[][] = new double [4][5];
		
		// Creamos la variable nota para ir almacenando las notas de los alumnos
		double nota;
		
		// Creamos la variable suma para almacenar la suma de las notas de cada alumno para posteriormente calcular la media
		double suma = 0;
		
		// Creamos la variable media para almacenar la media de las notas de cada alumno
		double media;
		
		// Creamos la variable nota maxima para almacenar la nota maxima del alumno
		double notaMaxima = Double.MIN_VALUE;
		
		// Creamos la variable nota maxima para almacenar la nota maxima del alumno
		double notaMinima = Double.MAX_VALUE;
		
		// Creamos el scanner
		Scanner reader = new Scanner(System.in);
		
		// Pedimos los valores al usuario
		for (int i = 0 ; i < notasAlumnos.length ; i++) {
			System.out.println("Alumno " + (i+1) + ", introduzca tus notas");
			System.out.println();
			for (int j = 0 ; j < notasAlumnos[i].length ; j++) {
				System.out.print("Introduzca la nota " + (j+1) + ": ");
				nota = reader.nextDouble();
				notasAlumnos[i][j] = nota;
			}
			System.out.println();
		}
		
		// Imprimimos las notas 
		System.out.print("\t\t" + "Nota 1");
		for (int i = 2 ; i <= 5 ; i++) {
			System.out.print("\t" + "Nota"+i);
		}
		System.out.println();
		
		// Mostramos la tabla
		for (int i = 0 ; i < notasAlumnos.length ; i++) {
			System.out.print("Alumno " + i + "\t");
			for (int j = 0 ; j < notasAlumnos[i].length ; j++) {
				System.out.print(notasAlumnos[i][j] + "\t");
			}
		System.out.println();
		}
		
		// Salto de linea
		System.out.println();
		
		// Mostramos los resultados
		for (int i = 0 ; i < notasAlumnos.length ; i++) {
			for (int j = 0 ; j < notasAlumnos[i].length ; j++) {
				suma += notasAlumnos[i][j];
				notaMinima = Math.min(notaMinima, notasAlumnos[i][j]);
				notaMaxima = Math.max(notaMaxima, notasAlumnos[i][j]);
			}
			media = suma / 5;
			System.out.println("Alumno " + (i+1));
			System.out.println("Nota media: " + media);
			System.out.println("Nota máxima: " + notaMaxima);
			System.out.println("Nota mínima: " + notaMinima);
			System.out.println();
		}
		
		// Cerramos el scanner
		reader.close();
		
		
	}

}
