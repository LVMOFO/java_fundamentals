package labs_examples.fundamentals.labs;


/**
 * Fundamentals Exercise 5: Working with Strings
 *
 *      Please follow the instructions in the comments below
 *
 */

public class Exercise_05 {

    public static void main(String[] args) {

        String str = "hello!";
        // please declare an int variable below, and set it to the value of the length of "str"
        int iLength = str.length();
        System.out.println("hello! is how many characters = " + iLength);

        String str2 = "hello";
        // please initialize a boolean variable and test whether str is equal to str2
        boolean bEquiv = str.equals(str2);
        System.out.println(str + " is equivalent to " + str2 + " = " + bEquiv);
        
        // please concatenate str & str2 and set the result to a new String variable below
        String str3 = str + str2;
        System.out.println("Concat of str and str2 = " + str3);

        // please demonstrate the use of any other method that is available to us in the String class
        // for example, replace(), substring(), contains(), indexOf() etc
        String str4 = str.toUpperCase();
        System.out.println("Upside down Hi = " + str.substring(iLength-1) + str4.charAt(0));


    }


}