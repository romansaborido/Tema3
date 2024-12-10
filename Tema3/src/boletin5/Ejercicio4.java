package boletin5;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		// Creamos el array bidimensional resultado de 8 por 8 para representar los posibles movimientos en él
		char resultado[][] = new char[8][8];
		
		// Creamos la variable posFila para almacenar la posicion de la fila que introduzca el usuario
		int posFila;
		
		// Creamos la variable posColumna para almacenar la posicion de la columna que introduzca el usuario
		int posColumna;
		
		// Creamos la variable pieza para almacenar la pieza que quiera utilizar el usuario
		char pieza;
		
		// Creamos el scanner
		Scanner reader = new Scanner(System.in);
		
		// Pedimos al usuario que introduzca la posicion de la fila y la almacenamos en posFila
		System.out.println("Introduzca la posición de la fila");
		posFila = reader.nextInt();
		
		// Pedimos al usuario que introduzca la posicion de la columna y la almacenamos en posColumna
		System.out.println("Introduzca la posición de la columna");
		posColumna = reader.nextInt();
		
		// Pedimos al usuario que introduzca la pieza que va a utilizar y la almacenamos en pieza
		System.out.println("Introduzca la pieza que vas a utilizar para revelar sus posibles movimientos");
		pieza = reader.next().toUpperCase().charAt(0);
		
		// Creamos un switch con pieza para llamar a la funcion
		switch(pieza) {
			case 'T' ->{
				resultado = torre(posFila, posColumna, pieza);
			}
			case 'A' ->{
				resultado = alfil(posFila, posColumna, pieza);
			}
			case 'D' ->{
				resultado = dama(posFila, posColumna, pieza);
			}
			case 'C' ->{
				resultado = caballo(posFila, posColumna, pieza);
			}
			default ->{
				System.out.println("Introduzca una pieza válida");
			}
		}
		
		// Mostramos el tablero
		for(int i = 0 ; i < resultado.length ; i++) {
			for(int j = 0 ; j < resultado[i].length ; j++) {
				System.out.print(resultado[i][j] + " ");
			}
			System.out.println();
		}
		
		// Cerramos el scanner
		reader.close();
		
	}
	
	
	// Funcion para la torre
	static char[][] torre(int posFila, int posColumna, char pieza) {
		
		// Creamos el array bidimensional tablero de 8 por 8
		char tablero[][] = new char[8][8];
		
		// Rellenamos el tablero con '#' suponiendo que cada '#' es una casilla del tablero
		for(int i = 0; i < tablero.length; i++) {
			for(int j = 0; j < tablero[i].length; j++) {
				tablero[i][j] = '#';
			}
		}
		
		// Pintamos la torre en el tablero en la posicion indicada por el usuario
		tablero[posFila][posColumna] = 'T';
		
		// Recorremos la tabla
		for(int i = 0; i < tablero.length; i++) {
			for(int j = 0; j < tablero[i].length; j++) {
				
				// Dibujamos los posibles movimientos de la torre
				if(tablero[i][posColumna] == '*') {
					tablero[i][posColumna] = 'X';
					
				} else if (tablero[posFila][j] == '*') { 
					tablero[posFila][j] = 'X';
				}
			}
		}
		
		// Devolvemos el tablero con los posibles movimientos de la torre
		return tablero;
	}
	
	
	// Funcion para el alfil
	static char[][] alfil(int posFila, int posColumna, char pieza) {
		
		// Creamos el array bidimensional tablero de 8 por 8
		char tablero[][] = new char[8][8];
		
		// Creamos la variable contador para ir controlando las casillas marcadas
		int contador = 0;
		
		// Rellenamos el tablero con '#' suponiendo que cada '#' es una casilla del tablero
		for(int i = 0; i < tablero.length; i++) {
			for(int j = 0; j < tablero[i].length; j++) {
				tablero[i][j] = '#';
			}
		}
		
		// Pintamos el alfil en el tablero en la posicion indicada por el usuario
		tablero[posFila][posColumna] = 'A';
		
		// Recorremos la tabla en la parte del tablero inferior a la pieza
		for(int i = posFila; i < tablero.length; i++) {
			for(int j = 0; j < tablero[i].length; j++) {
				
				// Si j es diferente a la posicion de la columna
				if(j != posColumna) { 
					
					// Si j es igual a posicion de la columna menos el contador pintamos X || Si j es igual a posicion de la columna mas el contador pintamos X
					if(j == (posColumna - contador) || j == (posColumna + contador)) {
						tablero[i][j] = 'X';
					}
				}
			}
			
			// Incrementamos el contador
			contador++;	
		}
		
		// Reiniciamos el contador
		contador = 0;
		
		// Recorremos la tabla en la parte del tablero superior a la pieza
		for(int i = posFila; i >= 0; i--) {
			for(int j = 0; j < tablero[i].length; j++) {
				
				// Si j es diferente a la posicion de la columna
				if(j != posColumna) { 
					
					// Si j es igual a posicion de la columna menos el contador pintamos X || Si j es igual a posicion de la columna mas el contador pintamos X
					if(j == (posColumna - contador) || j == (posColumna + contador)) {
						tablero[i][j] = 'X';
					}
				}
			}
			
			// Incrementamos el contador
			contador++;	
		}
		
		// Devolvemos el tablero con los posibles movimientos del alfil
		return tablero;
	}
	
	
	// Funcion para la dama
	static char[][] dama(int posFila, int posColumna, char pieza) {
		
		// Creamos el array bidimensional tablero de 8 por 8
		char tablero[][] = new char[8][8];
		
		// Creamos la variable contador para ir controlando las casillas marcadas
		int contador = 0;
		
		// Rellenamos el tablero con '#' suponiendo que cada '#' es una casilla del tablero
		for(int i = 0; i < tablero.length; i++) {
			for(int j = 0; j < tablero[i].length; j++) {
				tablero[i][j] = '#';
			}
		}
		
		// Pintamos la dama en el tablero en la posicion indicada por el usuario
		tablero[posFila][posColumna] = 'D';
		
		// Recorremos la tabla
		for(int i = 0; i < tablero.length; i++) {
			for(int j = 0; j < tablero[i].length; j++) {
				
				// Dibujamos los posibles movimientos verticales y horizontales de la dama
				if(tablero[i][posColumna] == '*') { 
					tablero[i][posColumna] = 'X';
					
				} else if(tablero[posFila][j] == '*') {
					tablero[posFila][j] = 'X';
				}
			}
		}
		
		// Recorremos la tabla en la parte del tablero superior a la pieza
		for(int i = posFila; i >= 0; i--) {
			for(int j = 0; j < tablero[i].length; j++) {
				
				// Si j es diferente a la posicion de la columna
				if(j != posColumna) {
					
					// Si j es igual a posicion de la columna menos el contador pintamos X || Si j es igual a posicion de la columna mas el contador pintamos X
					if(j == (posColumna - contador) || j == (posColumna + contador)) {
						tablero[i][j] = 'X';
					}
				}
			}
			
			// Incrementamos el contador
			contador++;
		}
		
		// Reiniciamos el contador
		contador = 0;
		
		// Recorremos la tabla en la parte del tablero inferior a la pieza
		for(int i = posFila; i < tablero.length; i++) {
			for(int j = 0; j < tablero[i].length; j++) {
				
				// Si j es diferente a la posicion de la columna
				if(j != posColumna) {
					
					// Si j es igual a posicion de la columna menos el contador pintamos X || Si j es igual a posicion de la columna mas el contador pintamos X
					if(j == (posColumna - contador) || j == (posColumna + contador)) { 
						tablero[i][j] = 'X';
					}
				}
			}
			
			// Incrementamos el contador
			contador++;
		}
		
		// Devolvemos el tablero con los posibles movimientos de la dama
		return tablero;
	}
	
	
	// Funcion para el caballo
	static char[][] caballo(int posFila, int posColumna, char pieza) {
		
		// Creamos el array bidimensional tablero de 8 por 8
		char tablero[][] = new char[8][8];
		
		// Rellenamos el tablero con '#' suponiendo que cada '#' es una casilla del tablero
		for(int i = 0; i < tablero.length; i++) {
			for(int j = 0; j < tablero[i].length; j++) {
				tablero[i][j] = '#';
			}
		}
		
		// Pintamos el caballo en el tablero en la posicion indicada por el usuario
		tablero[posFila][posColumna] = 'C';
		
		// Recorremos la tabla en la parte del tablero superior a la pieza
		for(int i = posFila; i >= 0; i--) {
			for(int j = 0; j < tablero[i].length; j++) {
				
				// Asignamos los posibles movimientos
				if((i == posFila - 1 && j == posColumna + 2) || (i == posFila - 2 && j == posColumna + 1)) { 
					tablero[i][j] = 'X';																	 
					
				} else if((i == posFila - 1 && j == posColumna - 2) || (i == posFila - 2 && j == posColumna -1)) { 
					tablero[i][j] = 'X';																		   
					
				}
			}
		}
		
		// Recorremos la tabla en la parte del tablero inferior a la pieza
		for(int i = posFila; i < tablero.length; i++) {
			for(int j = 0; j < tablero[i].length; j++) {
				
				// Asignamos los posibles movimientos
				if((i == posFila + 1 && j == posColumna + 2) || (i == posFila + 2 && j == posColumna + 1)) { 
					tablero[i][j] = 'X';																	 
					
				} else if((i == posFila + 1 && j == posColumna - 2) || (i == posFila + 2 && j == posColumna -1)) { 
					tablero[i][j] = 'X';																		   
					
				}
			}
		}
		
		// Devolvemos el tablero con los posibles movimientos del caballo
		return tablero;
	}
	
	
}

