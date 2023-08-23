
package mySamples;

// Java program to take an integer
// as input and print it

import java.util.Scanner;


public class AddNos {

	public static void main(String[] args)
	{

		// Declare the variables
		int num; int i;
		
		num = 0;
		
		for (i = 0; i < 2; i++)
				{
		// Input the integer
		System.out.println("Enter the integer: ");

		try (// Create Scanner object
		Scanner s = new Scanner(System.in)) {
			// Read the next integer from the screen
			num = num + s.nextInt();
		}

		// Display the integer
		System.out.println("Entered integer is: "
						+ num);
	}
	}
}
