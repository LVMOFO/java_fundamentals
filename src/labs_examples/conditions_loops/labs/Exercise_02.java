package labs_examples.conditions_loops.labs;
/**
 * Modified by Bo Bender 220516@1030
 */
import java.util.Scanner;
/**
 * Conditions and Loops Exercise 2: Days of the week
 *
 *      Take in a number from the user and print "Monday", "Tuesday", ... "Sunday", or "Other"
 *      if the number from the user is 1, 2,... 7, or other respectively. Use an if-else statement
 *      to accomplish this task.
 * 
 *      Bonus Tricky Challenge: Use a "nested-if" statement.
 *
 */

public class Exercise_02 {
    // create scanner
    public static void main(String[] args) {
        // write completed here
        Scanner scanner = new Scanner(System.in);  // prompt user
        System.out.print("Enter a number between 1 and 7; 1-Monday; 3-Wednesday; 5-Friday; 7-Sunday; etc: ");   // assign input to variable as int
        int number = scanner.nextInt();
        if (number == 1) {
            System.out.println("You chose Monday!");
        } else {
            if (number == 2){
                System.out.println("You chose Tuesday!");
            } else{
                if (number == 3) {
                    System.out.println("You chose Wednesday!");
                } else {
                    if (number == 4) {
                        System.out.println("You chose Thursday!");
                    } else {
                        if (number == 5) {
                            System.out.println("You chose Friday!");
                        } else {
                            if (number == 6) {
                                System.out.println("You chose Saturday!");
                            } else {
                                if (number == 7) {
                                    System.out.println("You chose Sunday!");
                                } else {
                                    System.out.println("You did not choose 1-7.  Try again");
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}

