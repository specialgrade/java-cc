/**@author aleah ganda i miss u baby*/
import java.util.Scanner;

public class Case_Study_3{

    public static void main(String[] args) {
      
        String[] COLOR_CODES = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "gray", "white"};

        
        Scanner scan = new Scanner (System.in);

        String color1, color2, color3;
        int digit1, digit2, powerIndex;
        String choice;

        
        do { 
        System.out.println("""
            Enter the colors of the resistor's three bands, beginning with the band nearest the end. Type the colors in lowercase letters only, NO CAPS.""");
        System.out.print("Band 1 => ");
        color1 = scan.next();
        System.out.print("Band 2 => ");
        color2 = scan.next();
        System.out.print("Band 3 => ");
        color3 = scan.next();


        digit1 = search(COLOR_CODES, COLOR_CODES.length, color1); 
        digit2 = search(COLOR_CODES, COLOR_CODES.length, color2); 
        powerIndex = search(COLOR_CODES, COLOR_CODES.length, color3);
        
        
        if (digit1 == -1 || digit2 == -1 || powerIndex == -1) {
            if (digit1 == -1) {
                System.out.println("Invalid color: " + color1);
            }
            if (digit2 == -1) {
                System.out.println("Invalid color: " + color2);
            }
            if (powerIndex == -1) {
                System.out.println("Invalid color: " + color3);
            }

        } else { 
            String digitString = Integer.toString(digit1) + Integer.toString(digit2); 
            int digitInt = Integer.parseInt(digitString);

            int ohms = digitInt * (int) Math.pow(10, powerIndex); 
            int kilo_ohms = ohms / 1000;

            System.out.println(String.format("Resistance Value: %d kilo-ohms",kilo_ohms));

        }

        System.out.print("Do you want to decode another resistor?\n=>");
        choice = scan.next().toLowerCase(); 
        } while (choice.equals("y")); 
    
    }
    
    public static int search(String[] array, int size, String target){ 
        for (int x = 0; x < size; x++) {
            if (array[x].equals(target)) { 
                return x;
            }            
        }
        
        return -1; 
    }
}


