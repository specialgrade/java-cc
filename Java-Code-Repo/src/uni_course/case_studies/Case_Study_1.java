import java.util.Scanner;

public class Case_Study_1 {
	public static void main(String[] args) {
            try (Scanner scanner = new Scanner(System.in)) {
                int SENTINEL = 0;
                get_problem();
                while ((SENTINEL!=5||SENTINEL!=0)){
                    SENTINEL = scanner.nextInt();
                    switch(SENTINEL){
                        case 1 -> get_rate_drop_factor(scanner);
                        case 2 -> get_ml_per_hr(scanner);
                        case 3 -> get_kg_rate_conc(scanner);
                        case 4 -> get_units_conc(scanner);
                        case 5 -> System.exit(0);
                        default -> System.out.println("Invalid parameters\n");
                        
                    }
                    get_problem();
                }
            }
	}
	//displaying options
	static void get_problem() {
		System.out.print("Enter the number of the problem you wish to solve.\n");
		System.out.print("\tGIVEN A MEDICAL ORDER IN \t\t\tCALCULATE RATE IN\n");
		System.out.print("(1) ml/hr & tubing\'s drop factor\t\t\tdrops / min\n");
		System.out.print("(2) 1 L for n hr\t\t\t\t\tml / hr\n");
		System.out.print("(3) mg/kg/hr & concentration in mg/ml\t\t\tml / hr\n");
		System.out.print("(4) units/hr & concentration in units/ml\t\tml / hr\n");
		System.out.print("(5) QUIT\n");
		System.out.print("Problem=> ");
	}
	//option1
	static void get_rate_drop_factor(Scanner scanner){
		System.out.print("Enter rate in ml/hr=> ");
		float rate_ml = scanner.nextFloat();

		System.out.print("Enter tubing\'s drop factor (drops/ml)=> ");
		float tubing_drop_factor = scanner.nextFloat();
 
		float fig_drops_min = rate_ml* tubing_drop_factor/60;

		System.out.printf("The drop rate per minute is %d.\n\n", Math.round(fig_drops_min));
	}
	//option2
	static void get_ml_per_hr(Scanner scanner){
		System.out.print("Enter number of hours=>  ");
		float num_hr = scanner.nextFloat();
		float liter_to_ml = 1000;
		float fig_ml_hr = liter_to_ml / num_hr  ;

		System.out.printf("The rate in milliliters per hour is %d.\n\n", Math.round(fig_ml_hr));
	}
	//option3
	static void get_kg_rate_conc(Scanner scanner){
		System.out.print("Enter rate in mg/kg/hr=> ");
		float rate_mg_kg_hr = scanner.nextFloat();

		System.out.print("Enter patient weight in kgr=> ");
		float patient_weight = scanner.nextFloat();

		System.out.print("Enter concentration in mg/ml=> ");
		float concentration = scanner.nextFloat();

		float by_weight = rate_mg_kg_hr * patient_weight * concentration ;

		System.out.printf("The rate in milliliters per hour is %d.\n\n", Math.round(by_weight));
	}
	//option4
	static void get_units_conc(Scanner scanner){
		System.out.print("Enter rate in units/hr=> ");
		float rate_unit_hr = scanner.nextFloat();

		System.out.print("Enter concentration in units/ml=>  ");
		float conc_units_ml = scanner.nextFloat();

		float by_units = rate_unit_hr / conc_units_ml ;

		System.out.printf("The rate in milliliters per hour is %d.\n\n", Math.round(by_units));
	}
}