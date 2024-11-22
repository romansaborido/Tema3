package boletin4_bidimesional;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		// Creamos la tabla bidimensional con la secuencia de numeros hasta el 16
		int tabla[][] = new int[4][4];
		
		// Creamos la tabla bidimensional tabla90 para almacenar el resultado de la funcion
		int tabla90[][];
		
		// Creamos la variable valor para ir incrementando el mismo y asi almacenar la secuencia
		int valor = 1;
		
		// Asignamos los valores del array
		for (int i = 0 ; i < tabla.length ; i++) {
			for (int j = 0 ; j < tabla[i].length ; j++) {
				tabla[i][j] = valor;
				valor++;
			}
		}
		
		// Almacenamos el resultado de la funcion
		tabla90 = gira90(tabla);
		
		// Imprimimos la tabla
		for (int i = 0 ; i < tabla.length ; i++) {
			for (int j = 0 ; j < tabla[i].length ; j++) {
				System.out.print(tabla[i][j] + "\t");
			}
			System.out.println();
		}
		
		// Salto de linea
		System.out.println();
		
		// Imprimimos la tabla que nos ha devuelto la funcion
		for (int i = 0 ; i < tabla90.length ; i++) {
			for (int j = 0 ; j < tabla90[i].length ; j++) {
				System.out.print(tabla90[i][j] + "\t");
			}
			System.out.println();
		}
	}
	
	static int[][] gira90(int tablaInicio[][]) {
		
		// Creamos la tabla bidimensional a devolver de la misma longitud y altura que tablaInicio
		int tabla90[][] = new int[tablaInicio.length][tablaInicio[0].length];
		
		// Recorremos la tabla y la almacenamos girada 90º en la nueva tabla
		for (int j = 0 ; j < tablaInicio[0].length ; j++) {
			for (int i = tablaInicio.length - 1 ; i >= 0 ; i--) {
				tabla90[j][tablaInicio.length - i - 1] = tablaInicio[i][j];
			}
		}
		
		// Devolvemos la tabla
		return tabla90;
	}

}
