package englishexercises;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {

		// Create the array of length 10
		int array[] = new int[10];

		// Create the random class to generate the random position of the fly
		Random rand = new Random();

		// Create the variable flyPosition to store the position of the fly
		int flyPosition = rand.nextInt(0, 10);

		// Create the variable userPosition to store the position entered by the user
		int userPosition = 0;

		// Create the scanner
		Scanner reader = new Scanner(System.in);

		// Assign the fly (1) in the random position
		array[flyPosition] = 1;

		// Ask the user in what position he thinks the fly is 
		do {
			try {
				System.out.println("Enter the position you think the fly is");
				userPosition = reader.nextInt();
				assert (userPosition >= 0 && userPosition <= 9) : "Enter a valid position (0 to 9)";
			} catch (AssertionError e) {
				System.err.println(e.getMessage());
			} catch (InputMismatchException e) {
				System.err.println("Enter an integer number");
				reader.next();
			}
		} while (userPosition < 0 || userPosition > array.length - 1);

		
		// As long as the value of array[userPosition] is not equal to 1
		while (array[userPosition] != 1) {
			
			// If the userPosition is 0
			if (userPosition == 0) {
				
				// Check that the fly is in the next position
				if (array[userPosition + 1] == 1) {
					System.out.println("You have been very close. You have scared the fly and has changed of position");
					Arrays.fill(array, 0);
					flyPosition = rand.nextInt(0, 10);
					array[flyPosition] = 1;
				} else {
					System.out.println("The fly is far. The flay is en the same position");
				}
				
			// If the userPosition is 9
			} else if (userPosition == 9) {
				
				// Check that the fly is in the before position
				if (array[userPosition - 1] == 1) {
					System.out.println("You have been very close. You have scared the fly and has changed of position");
					Arrays.fill(array, 0);
					flyPosition = rand.nextInt(0, 10);
					array[flyPosition] = 1;
				} else {
					System.out.println("The fly is far. The flay is en the same position");
				}
				
			// If the userPosition is not 0 or 9. Check that the fly is in the before position or next position
			} else if (array[userPosition - 1] == 1 || array[userPosition + 1] == 1) {
				System.out.println("You have been very close. You have scared the fly and has changed of position");
				Arrays.fill(array, 0);
				flyPosition = rand.nextInt(0, 10);
				array[flyPosition] = 1;
			} else {
				System.out.println("The fly is far. The flay is en the same position");
			}
			
			// Ask the user in what position he thinks the fly is 
			do {
				try {
					System.out.println("Enter the position you think the fly is");
					userPosition = reader.nextInt();
					assert (userPosition >= 0 && userPosition <= 9) : "Enter a valid position (0 to 9)";
				} catch (AssertionError e) {
					System.err.println(e.getMessage());
				} catch (InputMismatchException e) {
					System.err.println("Enter an integer number");
					reader.next();
				}
			} while (userPosition < 0 || userPosition > array.length - 1);
			
		}
		
		// You have caught the fly
		System.out.println("You have caught the fly");
		
		// Close the scanner
		reader.close();

		
	}

}
