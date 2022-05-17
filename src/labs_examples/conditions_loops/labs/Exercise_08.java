package labs_examples.conditions_loops.labs;
/**
 * Modified by Bo Bender 220516@2000
 */
/**
 * Conditions and Loops Exercise 8: do-while loop
 *
 *      Use a "do-while" loop print out every third number counting backwards from 1000 to 1.
 *
 */

public class Exercise_08 {
    public static void main(String[] args) {
        int i = 1000;
        int cnt = 0;
        do{
           cnt++;
           if (cnt == 3) {
               System.out.println(i);
               i--;
               cnt = 0;
            } else {
               i--;
           }
        } while (i>0);
    }
}
