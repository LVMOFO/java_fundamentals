package labs_examples.conditions_loops.labs;
/**
 * Modified by Bo Bender 220516@2012
 */
/**
 * Conditions and Loops Exercise 9: break
 *
 *      Demonstrate the use of the "break" statement to exit a loop.
 *
 */

public class Exercise_09 {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++){
            if (i==51) {
                System.out.println("Break point set at 51");
                break;
            }
        }
    }

}
