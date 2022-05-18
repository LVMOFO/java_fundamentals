package labs_examples.arrays.labs;
/**
 * Modified by Bo Bender 220518@0040
 */
/**
 *  Irregular Arrays
 *
 *      Create and populate a 2 dimensional irregular array of size and contents of your choosing. Using a nested
 *      "for-each" loop, iterate and print out each element of the array.
 *
 */

public class Exercise_04 {
    public static void main(String[] args) {
        String[][] sRegArray = {
                {"Bo", "Mackenzie", "Reise", "Maxius"},
                {"Michele", "Lauren", "Latte", "Magic", "Chicken1", "Chicken2"},
                {"Amy", "Barb", "Olive", "Justice", "Batman", "Boo", "Beef"},
                {"Lou", "MaryLou", "Mikey"}
        };
        for (String[] sRows : sRegArray){
            for (String sCols : sRows){
                System.out.print(sCols + " ");
            }
            System.out.println();
        }
    }
}
