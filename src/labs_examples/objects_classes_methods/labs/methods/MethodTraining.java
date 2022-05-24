package labs_examples.objects_classes_methods.labs.methods;
/**
 * Modified by Bo Bender 220522@1221
 */
public class MethodTraining {
    public static void main(String[] args) {
        //1) Demonstrate method overloading in this class
        MethodOverloading.runMethodOverloading();

        //2) Demonstrate the difference between "pass by value" and "pass by reference"
        PassByValue.runPassByVal();
        PassByReference.runPassByRef();
        System.out.println();

        //3) Create a method that will return the largest of 4 numbers (all of which are passed in as arguments)
        String iElements = Largest4Numbers.highest4Numbers(26, 33, 3, 12, 5, 17, 15, 8, 1);
        System.out.println(iElements);

        // 4) Write a method to count all consonants (the opposite of vowels) in a String
        int iNumCons = CountConsonants.iCountConsonants("Hummingbird");
        System.out.println(iNumCons);

        //5) Write a method that will determine whether or not a number is prime
        boolean thePrimesOf = PrimeNumbers.checkPrimes(13);
        System.out.println(thePrimesOf);

        //6) Write a method that will return a small array containing the highest and lowest numbers in a given
        // numeric array, which is passed in as an argument
        int[] arr = new int[2];
        arr = HiLowArray.HiLowNums(99,77,55,33,11,22,44,66,88);
        System.out.println(arr[0] + ", "+ arr[1]);

        //7) Write a method that takes 3 arguments (int maxNum, int divisor1, int divisor2) and returns an Integer Arraylist.
        //        In this method create an Integer ArrayList and populate it with each number between zero and maxNum that is
        //        divisible by both divisor1 and divisor2. Then return this ArrayList. After calling this method, print out the
        //        length of the returned list
        int[] returnArray = DivisibleByBoth.isDivisibleByBoth(100, 4, 10);
        System.out.println("Finished");

        //8) Write a method that will reverse an array in place use only one extra temp variable. For this exercise you cannot instantiate a second array. You must reverse the array in place using only one extra temp variable. Hint: this
        //        variable is used to temporarily store individual values in the array
    }











}
