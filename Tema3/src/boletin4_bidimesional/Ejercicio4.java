package boletin4_bidimesional;

public class Ejercicio4 {

	public static void main(String[] args) {

		// Creamos la tablaMagica para comprobar que la funcion funciona correctamente
		int tablaMagica[][] = new int[3][3];
		
		// Creamos el booleano esMagica para almacenar el resultado de la funcion
		boolean esMagica;
		
		// Asignamos los valores de la tabla
		tablaMagica[0][0] = 4;
		tablaMagica[0][1] = 9;
		tablaMagica[0][2] = 2;
		tablaMagica[1][0] = 3;
		tablaMagica[1][1] = 5;
		tablaMagica[1][2] = 7;
		tablaMagica[2][0] = 8;
		tablaMagica[2][1] = 1;
		tablaMagica[2][2] = 6;
		
		// Almacenamos el resultado de la funcion
		esMagica = esMagica(tablaMagica);
		
		// Mostramos la tabla
		for (int i = 0 ; i < tablaMagica.length ; i++) {
			for (int j = 0 ; j < tablaMagica[i].length ; j++) {
				System.out.print(tablaMagica[i][j] + " ");
			}
			System.out.println();
		}
		
		// Salto de linea
		System.out.println();
		
		// Mostramos el resultado
		if (esMagica) {
			System.out.println("La tabla es mágica!");
		} else {
			System.out.println("La tabla no es mágica :(");
		}


	}

	static boolean esMagica(int tabla[][]) {

		// Creamos el booleano a devolver esMagica y lo inicializamos a false
		boolean esMagica = true;

		// Creamos la variable sumaFila para ir comprobando la suma de cada una de las filas
		int sumaFila = 0;

		// Creamos la variable sumaColumna para ir comprobando la suma de cada una de las columnas
		int sumaColumna = 0;

		// Recorremos la tabla recibida y calculamos la suma de las filas
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[i].length; j++) {
				sumaFila += tabla[i][j];
				sumaColumna += tabla[j][i];
			}
			if (sumaFila != sumaColumna) {
				esMagica = false;
			}
		}

		// Devolvemos el resultado del booleano
		return esMagica;
	}
}
