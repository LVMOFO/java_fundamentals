package labs_examples.conditions_loops.labs;
/**
 * Modified by Bo Bender 220516@1319
 */
import java.util.Scanner;
/**
 * Conditions and Loops Exercise 5: Calculator
 *
 *      Take two numbers from the user, an upper and lower bound. Using a "for-loop", calculate the sum
 *      of numbers from the lower bound to the upper bound. Also, calculate the average of numbers.
 *      Print the results to the console.
 *
 *      For example, if a user enters 1 and 100, the output should be:
 *
 *      The sum is: 5050
 *      The average is: 50.5
 *
 *
 */

public class Exercise_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an upper bound number <= 1000000: ");
        int number = scanner.nextInt();
        System.out.print("Enter a lower bound number >= 0: ");
        int number2 = scanner.nextInt();
        System.out.println(" ");
        int cycles = number - number2 + 1;
        int i = 1;
        int val = 0;
        for (i = number2; i <= number; i++)
        {
            val += i;
            if (i == number) {
                System.out.println(" ");
                System.out.println("Upper Bound =" + number);
                System.out.println("Lower Bound =" + number2);
                System.out.println(" ");
                System.out.println("The sum of the numbers is =" + val);
                double d = (double)val / (double)cycles;
                System.out.println("The average of the numbers is =" + d + "| val =" + val + "| cycles =" + cycles);
            }

        }
    }
}
