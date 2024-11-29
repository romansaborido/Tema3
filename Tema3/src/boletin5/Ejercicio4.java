package boletin5;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		// Creamos la tabla bidimesional tablero para almacenar el resultado de la funcion
		char tablero[][] = alfil(0,4,'A');
		
		// Mostramos el tablero
		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero[i].length; j++) {
				System.out.print(tablero[i][j] + " ");
			}
			System.out.println();
		}
	}

	static char[][] alfil(int posFila, int posColumna, char pieza) {

		// Creamos el tablero de ajedrez de 8 por 8 tipo char
		char tablero[][] = new char[8][8];

		// Damos forma al tablero
		for (int i = 0 ; i < tablero.length ; i++) {
			for (int j = 0 ; j < tablero[i].length ; j++) {
				if ((i + j) % 2 == 0) {
					tablero[i][j] = ' ';
				} else {
					tablero[i][j] = '#';
				}
			}
		}
		
		// Asignamos la pieza en su posicion
		tablero[posFila][posColumna] = 'A';

		// Pintamos en el array los posibles movimientos del alfil
		for (int i = posFila ; i >= posFila ; i--) {
			for (int j = posFila + posColumna ; j >= posFila ; j++) {
				if (i == j && tablero[i][j] != 'A') {
					tablero[i][j] = 'x';
				}
			}
		}

		return tablero;
	}

}
