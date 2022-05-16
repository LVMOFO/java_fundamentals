package labs_examples.conditions_loops.labs;
/**
 * Modified by Bo Bender 220516@1218
 */

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 3: Months of the year
 * <p>
 * Take in a number from the user and print "January", "February", ... "December", or "Other"
 * if the number from the user is 1, 2,... 12, or other respectively. Use a "switch" statement.
 */

public class Exercise_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" ");
        System.out.println(" ");
        System.out.print("Enter a number between 1 and 12; 1-January; 3-March; 5-May; etc: ");
        int number = scanner.nextInt();

        switch(number) {
            case 1:
                System.out.println("Congrats you chose January with a " + number);
                break;
            case 2:
                System.out.println("Congrats you chose February with a " + number);
                break;
            case 3:
                System.out.println("Congrats you chose March with a " + number);
                break;
            case 4:
                System.out.println("Congrats you chose April with a " + number);
                break;
            case 5:
                System.out.println("Congrats you chose May with a " + number);
                break;
            case 6:
                System.out.println("Congrats you chose June with a " + number);
                break;
            case 7:
                System.out.println("Congrats you chose July with a " + number);
                break;
            case 8:
                System.out.println("Congrats you chose August with a " + number);
                break;
            case 9:
                System.out.println("Congrats you chose September with a " + number);
                break;
            case 10:
                System.out.println("Congrats you chose October with a " + number);
                break;
            case 11:
                System.out.println("Congrats you chose November with a " + number);
                break;
            case 12:
                System.out.println("Congrats you chose December with a " + number);
                break;
            default:
                System.out.println("I'm sorry " + number + " does not fall between 1-12.");
                break;

        }

    }
}
