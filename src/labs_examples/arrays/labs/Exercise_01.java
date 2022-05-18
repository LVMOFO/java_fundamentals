package labs_examples.arrays.labs;

import java.util.Scanner;

/**
 * Arrays calculator
 *
 *      Take in 10 numbers from the user. Place the numbers in an array. Using the loop of your choice,
 *      calculate the sum of all of the numbers in the array as well as the average.
 *
 *      Print the results to the console.
 *
 */

public class Exercise_01 {
    public static void main(String[] args) {
        //***Add below back in below
        int[] iNumsA = new int[10];
        //***Add above back in below
        int i = 0;
        int iCount = 0;
        //***Remove  below later
        //iCount = 10;
        //int[] iNumsA = {9,8,7,6,5,4,3,2,1,0};
        //***Remove  above later
//***Add below back in below
        for (i = 1; i<=10; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter ten integers.  You have entered " + iCount + " integers so far.");
            int iInput = scanner.nextInt();
            iNumsA[iCount] = iInput;
            iCount++;
        }
//***Add above back in below
        int iSum = 0;
        for (int r : iNumsA){
//            System.out.print(r + " ");
            iSum += r;
        }
//        System.out.println();
        float iAverage = (float)iSum / (float)iCount;
        System.out.println(iSum);
        System.out.println(iAverage);

    }
}