package labs_examples.conditions_loops.labs;
/**
 * Modified by Bo Bender 220516@1310
 */
/**
 * Conditions and Loops Exercise 4: Even numbers
 *
 *      Using a "for-loop", print out all even numbers from 1-100.
 *
 */
public class Exercise_04 {
    public static void main(String[] args) {
        for (int i = 1; i<=100; i++){
            int iMod = i%2;
            if (iMod == 0){
                System.out.println(i + " is even");
            }
        }
    }
}
