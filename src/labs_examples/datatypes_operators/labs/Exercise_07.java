package labs_examples.datatypes_operators.labs;

import java.util.Scanner;

/**
 * Fundamentals Exercise 5: Days to seconds
 *
 *      Take in a number in days from the user between 1 and 1,000,000 and convert it to
 *      seconds.
 *
 *      NOTE: We will be using the Scanner class to collect user input. This is demonstrated below.
 *
 */

public class Exercise_07 {

    public static void main(String[] args) {

        // create scanner
        Scanner scanner = new Scanner(System.in);
        // prompt user
        System.out.print("Enter a number in days between 1 and 1,000,000: ");

        // assign input to variable as int
        int days = scanner.nextInt();

        // write completed code here
        if (days <= 1000000 & days > 0) {
            int seconds = 86400;
            long totalSeconds = (long)days * (long)seconds;
            //long maxLong = 9223372036854775807L;
            //System.out.println("Max Long = 9,223,372,036,854,775,807  Var Set to that:" + maxLong);
            System.out.print("There are -->" + totalSeconds + " in " + days + " days!");
        } else {
            System.out.println("You entry was to big or to small; try again");
        }
    }

}
