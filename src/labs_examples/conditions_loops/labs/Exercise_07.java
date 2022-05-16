package labs_examples.conditions_loops.labs;
/**
 * Modified by Bo Bender 220516@1417
 */
import java.util.Scanner;
/**
 * Conditions and Loops Exercise 7: First vowel
 *
 *      Take in a word from the user and using a "while" loop, find the first vowel in the word.
 *      Once you find the vowel, print out the word and the first vowel.
 *
 *      Hints:
 *          - there are a few helpful methods in the String class called length(), charAt() and indexOf()
 *          - you'll likely want to use a String that contains all the vowels:
 *              - ie: String vowels = "aeiou";
 *
 */
public class Exercise_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word that has  vowels: ");
        String inp = scanner.next();
        //System.out.println(inp);
        String upp = inp.toUpperCase();
        //System.out.println(upp);
        int iLen = upp.length() - 1;
        int i = 0;
        char cha = upp.charAt(i);
        char cinp = inp.charAt(i);
        while (i < iLen){
            //(cha != 'A' || cha != 'E')
            cha = upp.charAt(i);
            cinp = inp.charAt(i);
            if (cha == 'A') {
                System.out.println("The word " + inp + " contains the vowel " + cinp + " at character " + (i + 1)  + ".");
                break;
            }
            if (cha == 'E') {
                System.out.println("The word " + inp + " contains the vowel " + cinp + " at character " + (i + 1)  + ".");
                break;
            }
            if (cha == 'I') {
                System.out.println("The word " + inp + " contains the vowel " + cinp + " at character " + (i + 1)  + ".");
                break;
            }
            if (cha == 'O') {
                System.out.println("The word " + inp + " contains the vowel " + cinp + " at character " + (i + 1)  + ".");
                break;
            }
            if (cha == 'U') {
                System.out.println("The word " + inp + " contains the vowel " + cinp + " at character " + (i + 1)  + ".");
                break;
            }
            //System.out.println(i + " cha:" + cha + " iLen:" + iLen);
            i++;
        }

    }
}
