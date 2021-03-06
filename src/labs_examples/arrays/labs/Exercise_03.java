package labs_examples.arrays.labs;
/**
 * Modified by Bo Bender 220518@0040
 */
/**
 *  2D Array
 *
 *      Creat and populate a 5x5 2D array with multiples of 3, starting with 3. Once populated, print out the results.
 *
 *      The output should look something like this:
 *
 *      3 6 9 12 15
 *      18 21 24 27 30
 *      ...
 *      ...
 *      ...
 *
 */

public class Exercise_03 {

    public static void main(String[] args) {
        int[][] twoDArray = new int[5] [5];
        int iAdd = 0;
        for (int r = 0; r < twoDArray.length; r++) {
            for (int c = 0; c < twoDArray[r].length; c++) {
                twoDArray[r][c] = (iAdd += 3);
            }
        }
        for (int[] multTable : twoDArray) {
            for (int mtVal : multTable) {
                System.out.print(mtVal + " ");
            }
            System.out.println();
        }
    }
}
