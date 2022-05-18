package labs_examples.arrays.labs;
/**
 * Modified by Bo Bender 220518@0216
 */

import java.util.ArrayList;

/**
 *  ArrayLists
 *
 *      Please demonstrate how to create an ArrayList, populate an array list, access elements within an ArrayList.
 *      Also take a moment to explore the many methods that are available to you when you use an ArrayList. By simply
 *      typing the dot operator (".") after the ArrayList object that you create. You should see a menu pop up that
 *      shows a list of methods.
 *
 */
public class Exercise_07 {
    public static void main(String[] args) {
        ArrayList<String> sColors = new ArrayList<String>();
        sColors.add("Red");
        sColors.add("White");
        sColors.add("Blue");
        sColors.add("Green");
        sColors.add("Teal");
        System.out.println("Array currently contains:");
        for (String sElement : sColors){
            System.out.print(sElement + " ");
        }
        System.out.println();
        System.out.println();
        System.out.println("Add an element with .add command - adding Orange: ");
        sColors.add("Orange");
        for (String sElement : sColors){
            System.out.print(sElement + " ");
        }
        System.out.println();
        System.out.println();
        System.out.println("Remove an element with .remove command - removing Teal: ");
        sColors.remove("Teal");
        for (String sElement : sColors){
            System.out.print(sElement + " ");
        }
        System.out.println();
        System.out.println();
        System.out.println("See if an element exists with .contains command stored in a boolean - checking for Green: ");
        boolean bContains = sColors.contains("Green");
        System.out.println(bContains);
        System.out.println();
        System.out.println("Get element at index 2 with .get command - Blue: ");
        String sContains = sColors.get(2);
        System.out.println(sContains);
        System.out.println();
        System.out.println("Reprinting array:");
        for (String sElement : sColors){
            System.out.print(sElement + " ");
        }
        System.out.println();
    }
}
