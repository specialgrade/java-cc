/**
 * This class demonstrates variable declarations and prints their values in a structured format.
 * It also includes a ternary operation.
 *
 * @author Alyssa Marie D. Dela Cruz
 * @version 1.0
 * @since 2025-03-04
 */

public class Ex3A {
	/**
	 * Default constructor for Ex3A.
	 */
	public Ex3A() {
		// No initialization needed.
	}
	/**
	 * The main method prints the values of predefined variables.
	 * It also demonstrates a boolean negation and a simple conditional evaluation using a ternary operator.
	 *
	 * @param args Command-line arguments (not used in this program)
	 */
	public static void main(String[] args) {
		boolean sagot = true;
		int a = 2;
		int b = 4;
		char letter = 'c';
		double pi = 3.14;

		System.out.println("The value of A is " + a + " while B is " + b);
		System.out.println("Letter " + letter);
		System.out.println("Initial value of Sagot is " + sagot);
		System.out.println("Pi contains the value " + pi);
		System.out.println("Sagot is now " + !sagot);
		System.out.println("Is " + a + " greater than " + b + "? " + (a > b ? "Yes" : "No"));
	}
}