import java.util.Scanner;

public class Case_Study_2 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int SENTINEL = -1;
            
            get_problem();
            
            while (SENTINEL != 5 && SENTINEL != 0) {
                SENTINEL = scanner.nextInt();
                
                switch (SENTINEL) {
                    case 1 -> {
                        TwoPoint data = new TwoPoint();
                        get2_pt(data, scanner);
                        slope_intcpt_from2_pt(data);        
                    }

                    case 2 -> {
                        PointSlope data = new PointSlope();
                        get_pt_slope(data, scanner);
                        intcpt_from_pt_slope(data);
                    }
                    default -> System.out.println("Invalid parameters");
                }
                
                do_another(scanner);
            }
        }
    }
    //ito yung printing ng option
    static void get_problem() {
        System.out.println("1) Two-point form (you know the points on the line)");
        System.out.println("2) Point-slope form (you know the line\'s slope and one point)");
        System.out.print("=> ");
    }
    //ito number1 option
    static void get2_pt(TwoPoint data, Scanner scanner){
        System.out.print("Enter the x-y coordinates of the first point separated by a space=> ");
        data.x1 = scanner.nextFloat();
        data.y1 = scanner.nextFloat();
        System.out.print("Enter the x-y coordinates of the second point separated by a space=> ");
        data.x2 = scanner.nextFloat();
        data.y2 = scanner.nextFloat();
    }
    //ito number2 option
    static void get_pt_slope(PointSlope data, Scanner scanner) {
        System.out.print("Enter the slope => ");
        data.m = scanner.nextFloat();

        System.out.print("Enter the x-y coordinates of the point separated by a space => ");
        data.x = scanner.nextFloat();
        data.y = scanner.nextFloat();
    }
    //ito number1 solution
    static void slope_intcpt_from2_pt(TwoPoint data){
        float m = (data.y2 - data.y1) /(data.x2 - data.x1);
        float b = data.y1 - (m * data.x1);
        display_slope_intcpt(data, m, b);
    }
    //ito number2 solution
    static void intcpt_from_pt_slope(PointSlope data) {
        float b = data.y - (data.m * data.x);
        display_pt_slope(data, b);
    }
    //ito number1 printing output
    static void display_slope_intcpt(TwoPoint data, float m, float b){
        System.out.println("\nTwo-point form");
        System.out.printf("\t(%.2f - %.2f)", data.y2, data.y1);
        System.out.println("\nm = ------------------");
        System.out.printf("\t(%.2f - %.2f)", data.x2, data.x1);
        System.out.println();
        System.out.println("\nSlope-intercept form");
        System.out.printf("\ty = %.2f + %.2f\n", m, b);
    }
    //ito number2 printing output
    static void display_pt_slope(PointSlope data, float b){
        System.out.println("Point-slope form:");
        System.out.printf("\ty - %.2f = %.2f (x - %.2f)\n", data.y, data.m, data.x);
        System.out.println("Slope-intercept form:");
        System.out.printf("\ty = %.2fx %.2f\n", data.m, b);
    }
    //ito magpapaloop
    static void do_another(Scanner scanner) {
        System.out.print("\nDo another conversion (Y or N)? => ");
        char do_again = scanner.next().charAt(0);

        if (do_again == 'Y' || do_again == 'y') {
            get_problem();
        } else {
            System.exit(0);
        }
    }
}
//ito pang pass ng value ng 1
class PointSlope {
    float m, x, y;
}
//ito para sa 2
class TwoPoint {
    float x1, x2, y1, y2;
}