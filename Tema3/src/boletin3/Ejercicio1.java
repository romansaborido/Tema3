package boletin3;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		// Creamos el array num de 3 filas por 6 columnas
		int num[][] = new int[3][6];
		
		// Asignamos los valores por posicion
		num[0][0] = 0;
		num[1][0] = 75;
		num[0][1] = 30;
		num[0][2] = 2;
		num[2][2] = -2;
		num[2][3] = 9;
		num[1][4] = 0;
		num[0][5] = 5;
		num[2][5] = 11;

		// Mostramos el contenido de los elementos de la tabla
		for (int i = 0 ; i < num.length ; i++) {
			for (int j = 0 ; j < num[i].length ; j++) {
				System.out.print(num[i][j] + " ");
			}
			System.out.println();
		}

	}

}
