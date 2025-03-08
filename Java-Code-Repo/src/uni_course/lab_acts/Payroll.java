import java.util.Scanner;

/**
 * This class demonstrates a simple payroll computation.
 * It includes the calculation of gross pay, withholding tax, and net pay.
 *
 * @author Alyssa Marie D. Dela Cruz
 * @version 1.0
 * @since 2025-03-04
 */

public class Payroll {
	/**
	 * Default constructor for Payroll.
	 */
	public Payroll() {
		// No initialization needed.
	}
	/**
	 * The main method prompts the user for an hourly rate and number of hours worked.
	 * It calculates and displays the total gross pay, withholding tax (15% of gross pay),
	 * and net pay (gross pay - withholding tax).
	 *
	 * @param args Command-line arguments (not used in this program)
	 */
	public static void main(String[] args) {
		System.out.println("=== PAYROLL SYSTEM ===\n");
		
		Scanner scanner = new Scanner(System.in);
		
		// User Input
		System.out.print("Enter hourly rate: ");
		double hourlyRate = scanner.nextDouble();

		System.out.print("Enter number of hours worked: ");
		int hoursWorked = scanner.nextInt();
		
		scanner.close();
		
		// Calculations
		double grossPay = hourlyRate * hoursWorked;
		double tax = 0.15 * grossPay;
		double netPay = grossPay - tax;

		// Output
		System.out.println("\n=== PAYROLL SUMMARY ===\n");

		System.out.printf("Hourly rate: " + String.format("%.3f\n", hourlyRate));
		System.out.println("Hours worked: " + hoursWorked);
		System.out.printf("Gross pay: " + String.format("%.3f\n", grossPay));
		System.out.printf("Withholding tax: " + String.format("%.3f\n", tax));
		System.out.printf("Net pay: " + String.format("%.3f\n", netPay));
	}
}