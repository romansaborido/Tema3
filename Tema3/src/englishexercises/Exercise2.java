package englishexercises;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		
		// Create the array named sequence
		int sequence[];
		
		// Create the variable named value to storage the value that user introduce
		int value;
		
		// Create the variable named increase to storage the increase that user introduce
		int increase;
		
		// Create the variable length to storage the array length that user introduce
		int length;
		
		// Create the scanner
		Scanner reader = new Scanner(System.in);
		
		// Ask user to enter the value
		System.out.println("Introduce the start value");
		value = reader.nextInt();
		
		// Ask user to enter the increase
		System.out.println("Introduce the increase");
		increase = reader.nextInt();
		
		// Ask user to enter the array length
		System.out.println("Introduce the array length");
		length = reader.nextInt();
		
		// Size array
		sequence = new int[length];
		
		// Storage the array values
		for (int i = 0 ; i < length ; i++) {
			sequence[i] = value;
			value += increase;
		}
		
		// Salto de linea
		System.out.println();
		
		// Show the array values
		System.out.println(Arrays.toString(sequence));
		
		// Close the scanner
		reader.close();
		


	}

}
