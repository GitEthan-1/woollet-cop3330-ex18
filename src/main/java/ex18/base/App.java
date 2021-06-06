package ex18.base;

import java.util.Locale;
import java.util.Scanner;

/**
 * Exercise 18 - Temperature Converter
 * You’ll often need to determine which part of a program is run based on user input or other events.
 *
 * Create a program that converts temperatures from Fahrenheit to Celsius or from Celsius to Fahrenheit.
 * Prompt for the starting temperature. The program should prompt for the type of conversion and then perform the conversion.
 *
 * The formulas are
 *
 * C = (F − 32) × 5 / 9
 *
 * and
 *
 * F = (C × 9 / 5) + 32
 *
 * Example Output
 *
 * Press C to convert from Fahrenheit to Celsius.
 * Press F to convert from Celsius to Fahrenheit.
 * Your choice: C
 * Please enter the temperature in Fahrenheit: 32
 * The temperature in Celsius is 0.
 *
 * Constraints
 *
 * Ensure that you allow upper or lowercase values for C and F.
 * Use as few output statements as possible and avoid repeating output strings.
 *
 * Challenges
 *
 * Revise the program to ensure that inputs are entered as numeric values. Don’t allow the user to proceed if the value entered is not numeric.
 * Break the program into functions that perform the computations.
 * Implement this program as a GUI program that automatically updates the values when any value changes.
 * Modify the program so it also supports the Kelvin scale.
 */

public class App {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Press C to convert from Fahrenheit to Celsius.");
		System.out.println("Press F to convert from Celsius to Fahrenheit.");
		char unit = in.nextLine().toLowerCase(Locale.ROOT).charAt(0);
		
		while(!(unit == 'c' || unit == 'f'))
		{
			System.out.println("Unknown unit type. Please enter C or F: ");
			unit = in.nextLine().toLowerCase(Locale.ROOT).charAt(0);
		}
		
		System.out.println("Your choice: " + (unit == 'c' ? "C" : "F" ));
		
		System.out.print("Please enter the temperature in " + (unit == 'c' ? "Celsius" : "Fahrenheit" ) + ": ");
		float temp = Integer.parseInt(in.nextLine());
		
		if(unit == 'c')
		{
			temp = (temp -32) * 5/9;
		}
		else if(unit == 'f')
		{
			temp = (temp * 9/5) + 32;
		}
		else
		{
			System.out.println("\"uhh\" - Jeff Goldblum");
		}
		System.out.println("The temperature in " + (unit == 'c' ? "Celsius" : "Fahrenheit" )+ " is " + Math.round(temp));
		
	}
}
