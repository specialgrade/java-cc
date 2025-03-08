import java.util.Scanner;

/**
 * This class demonstrates conversion of a given time in minutes to hours and minutes.
 * It takes user input, performs conversion, and displays the result.
 *
 * @author Alyssa Marie D. Dela Cruz
 * @version 1.0
 * @since 2025-03-04
 */

public class MinToHour {
	/**
	 * Default constructor for MinToHour.
	 */
	public MinToHour() {
		// No initialization needed.
	}
	/**
	 * The main method prompts the user for a time in minutes,
	 * converts it into hours and minutes, and displays the result.
	 *
	 * @param args Command-line arguments (not used in this program)
	 */
	public static void main(String[] args) {
		System.out.println("=== TIME CONVERTER: MINUTES TO HOURS ===\n");
		
		Scanner scanner = new Scanner(System.in);

		// User Input
		System.out.print("Number of minutes: ");
		int givenMins = scanner.nextInt();
		
		scanner.close();
		
		// Conversion
		int toHours = givenMins / 60;
		int toMins = givenMins % 60;

		// Output
		System.out.println("\n=== CONVERSION RESULT ===\n");
		System.out.println("Given Time: " + givenMins + " minute/s");
		System.out.println("Converted Time: " + toHours + " hour/s and " + toMins + " minute/s");
	}
}