package englishexercises;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
		
		// Create the array named numbers of size 10
		int numbers[] = new int[10];
		
		// Create the variable named option to storage the answer of user
		String option;
		
		// Create the variable named value to storage the value of user introduce
		int value;
		
		// Create the variable named position to storage the array position of user introduce
		int position;
		
		// Create the boolean named exit to exit the menu
		boolean exit = false;
		
		// Create the scanner
		Scanner reader = new Scanner(System.in);
		
		// Show the menu to user
		System.out.println("a. Show values");
		System.out.println("b. Introduce a value");
		System.out.println("c. Exit");
		System.out.println();
		
		// Ask user to enter a option
		System.out.println("Introduce a option");
		option = reader.next();
		System.out.println();
		
		// Create the loop of menu 
		while (!option.equalsIgnoreCase("c") && !exit) {
			
			// Create a switch with options of menu
			switch (option) {
				case "a" -> {
					System.out.println(Arrays.toString(numbers));
				}
				case "b" -> {
					System.out.print("Value to introduce: ");
					value = reader.nextInt();
					System.out.print("Position value to introduce: ");
					position = reader.nextInt();
						
					numbers[position] = value;
				}
				case "c" -> {
					exit = true;
				}
				default -> {
					System.err.println("You have to introduce a integer number");
				}
			}
			
			// Show the menu to user
			System.out.println();
			System.out.println("a. Show values");
			System.out.println("b. Introduce a value");
			System.out.println("c. Exit");
			System.out.println();
			
			// Ask user to enter a option
			System.out.println("Introduce a option");
			option = reader.next();
			System.out.println();
		}
		
		// End of program
		System.out.println("End of program");
		
		// Close the scanner
		reader.close();
		
		
	}
}
