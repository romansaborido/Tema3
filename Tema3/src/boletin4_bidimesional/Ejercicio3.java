package boletin4_bidimesional;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		// Creamos una tabla matriz simetrica llamada A
		int A[][] = new int[3][3]; 
		
		// Creamos el booleano simetria para almacenar el resultado de la funcion
		boolean simetria;
		
		// Asignamos los valores de la tabla
		A[0][0] = 4;
		A[0][1] = 1;
		A[0][2] = 2;
		A[1][0] = 1;
		A[1][1] = 3;
		A[1][2] = 5;
		A[2][0] = 2;
		A[2][1] = 5;
		A[2][2] = 6;
		
		// Asignamos el resultado de la funcion a simetria
		simetria = simetriaMatriz(A);
		
		// Mostramos la tabla con fomato de matriz
		for (int i = 0 ; i < A.length ; i++) {
			if (i == 1) {
				System.out.print("A = ");
			} else {
				System.out.print("    ");
			}
			for (int j = 0 ; j < A[i].length ; j++) {
				System.out.print(A[i][j] + " ");
			}
			System.out.println();
		}
		
		// Salto de linea
		System.out.println();
		
		// Mostramos el resultado
		if (simetria) {
			System.out.println("La matriz es simétrica");
		} else {
			System.out.println("La matriz NO es simétrica");
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
