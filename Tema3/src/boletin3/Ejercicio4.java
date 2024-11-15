package boletin3;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		// Creamos la tabla tablasMultiplicar de tamaño 10 por 10
		int tablasMultiplicar[][] = new int[10][10];
		
		// Asignamos los valores del array
		for (int i = 0 ; i < tablasMultiplicar.length ; i++) {
			for (int j = 0 ; j < tablasMultiplicar[i].length ; j++) {
				tablasMultiplicar[i][j] = (i + 1) * (j + 1);
			}
		}
		
		// Mostramos los valores del array
		for (int i = 0 ; i < tablasMultiplicar.length ; i++) {
			for (int j = 0 ; j < tablasMultiplicar[i].length ; j++) {
				System.out.print((i + 1) + " x " + (j + 1) + " = " + tablasMultiplicar[i][j] + "\t");
			}
		System.out.println();
		}
			
		
	}

}
