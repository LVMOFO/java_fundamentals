package labs_examples.arrays.labs;
/**
 * Modified by Bo Bender 220518@0024
 */

import java.util.Scanner;

/**
 *  More labs_examples.arrays
 *
 *      Using the array below, take in a number from 1-10 from the user and print out the index of that
 *      element.
 *
 */

public class Exercise_02 {

    public static void main(String[] args) {

        int[] array = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        Scanner scanner  = new Scanner(System.in);
        System.out.print("Enter a number from 1-10: ");
        int iInput = scanner.nextInt();
        int iLen = array.length;
        int i = 0;
        while (i < iLen){
            if (iInput == array[i]){
                System.out.println(i);
                break;
            }
            i++;
        }

        // write code here


    }
}