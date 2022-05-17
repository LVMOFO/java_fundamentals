package labs_examples.conditions_loops.labs;
/**
 * Modified by Bo Bender 220516@2017
 */
/**
 * Conditions and Loops Exercise 10: continue
 *
 *      Demonstrate the use of the "continue" statement to skip to the next iteration of a loop.
 *
 */

public class Exercise_10 {
    public static void main(String[] args) {

        for (int i = 0; i<101; i++){
            if (i%10 != 0) {
                continue;
            } else {
                System.out.println(i + " has a zero mod");
            }
        }
    }
}
