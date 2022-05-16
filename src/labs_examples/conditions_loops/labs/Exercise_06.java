package labs_examples.conditions_loops.labs;
/**
 * Modified by Bo Bender 220516@1417
 */
/**
 * Conditions and Loops Exercise 6: Basic while loop
 *
 *      Use a "while" loop find the sum of numbers to from 1-100. Print the sum to the console
 *
 */

public class Exercise_06 {
    public static void main(String[] args) {
        int i = 100;
        int val = 0;
        while (i >= 1){
            val += i;
            i--;
        }
        System.out.println(val);
    }

}
