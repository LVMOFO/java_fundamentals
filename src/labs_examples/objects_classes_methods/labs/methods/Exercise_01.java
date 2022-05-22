package labs_examples.objects_classes_methods.labs.methods;
/**
 * Modified by Bo Bender 220522@1221
 */
/**
 * Created by ryandesmond - https://codingnomads.co
 */
public class Exercise_01 {

    public static void main(String[] args) {

        // please create the methods as instructed below then
        // call each of those methods from here, within the main()
        int a=100;
        int b=10;
        int iMultiply = multiply(a,b);
        System.out.println(a + "*" + b + " = " + iMultiply);
        System.out.println();
        int iDivide = divide(a,b);
        System.out.println(a + "/" + b + " = " + iDivide);
        System.out.println();
        joke();
        System.out.println();
        int iYears=50;
        int iSecsInYears = secondsInYears(iYears);
        System.out.println("The number of seconds that " + iYears + " in years represents = " + iSecsInYears);
        System.out.println();
        int iVarargs = countVarargs("1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11");
        System.out.println("The length of the varargs array passed in = " + iVarargs);
    }


    // 1) Create a static multiply() method below that takes two int arguments (int a, int b) and
    //    returns the result of a * b
    public static int multiply(int a, int b){
        return a*b;
    }

    // 2) Create a static divide() method below that takes two int arguments (int a, int b) and
    //    returns the result of a / b
    public static int divide(int a, int b){
        return a/b;
    }

    // 3) Create a static void method that will print of joke of your choice to the console
    public static void joke(){
        System.out.println("Why do blondes wear panties?"  );
        System.out.println("     They are trying to get their ankles warmed up.");
    }

    // 4) Create a static method that takes in a number in years (int years) as an argument
    //    and returns the number of seconds that number in years represents
    public static int secondsInYears(int years){
        return 365*24*60*60*years;
    }


    // 5) Create a varargs method that will return the length of the varargs array passed in
    public static int countVarargs(String... args){
        int iCount=0;
        for (String sIncoming : args){
            iCount++;
        }
        return iCount;
    }





}
