package labs_examples.datatypes_operators.labs;

import java.sql.SQLOutput;

/**
 * Please demonstrate the use of all arithmetic operators below. These include:
 *
 * addition, subtraction, multiplication, division and modulus
 *
 */
class ArithmeticOperators {

    public static void main(String[] args) {

        // write your code below
        int i = 10;
        int j = 20;
        int k = i + j;
        System.out.println("Addition of i and j = " + k);
        int l = j - i;
        System.out.println("Subtraction of i from j = " + l);
        int m = i * j;
        System.out.println("Multiplication of i and j = " + m);
        int n = j / i;
        System.out.println("Division of j divided by i = " + n);
        int o = j % i;
        System.out.println("Modulus (remainder) of i into j = " + o);
    }

}
