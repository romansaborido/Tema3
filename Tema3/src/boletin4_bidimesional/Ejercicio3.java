package boletin4_bidimesional;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		// Creamos una tabla bidimensional de matriz simetrica
		int tabla[][] = new int[3][3]; 
		
		// Creamos el booleano simetria para almacenar el resultado de la funcion
		boolean simetria;
		
		// Asignamos los valores de la tabla
		tabla[0][0] = 4;
		tabla[0][1] = 1;
		tabla[0][2] = 2;
		tabla[1][0] = 1;
		tabla[1][1] = 3;
		tabla[1][2] = 5;
		tabla[2][0] = 2;
		tabla[2][1] = 5;
		tabla[2][2] = 6;
		
		// Asignamos el resultado de la funcion a simetria
		simetria = simetriaMatriz(tabla);
		
		// Mostramos la tabla 
		for (int i = 0 ; i < tabla.length ; i++) {
			for (int j = 0 ; j < tabla)
		}
		
	}
	
	static boolean simetriaMatriz(int t[][]) {
		
		// Creamos el booleano a devolver llamado simetrico y lo inicializamos a false
		boolean simetrico = false;
		
		// Creamos un contador para ir contando los valores simetricos
		int contador = 0;
		
		// Recorremos la tabla para saber si se trata de una matriz simetrica o no
		for (int i = 0 ; i < t.length ; i++) {
			for (int j = 0 ; j < t[i].length ; j++) {
				if (t[i][j] == t[j][i]) {
					contador++;
				}
			}
		}
		
		// Si contador es mayor o igual que la longitud * el ancho de la tabla es simetrico
		if (contador >= t.length * t[0].length) {
			simetrico = true;
		}
		
		// Devolvemos el booleano
		return simetrico;
	}

}
