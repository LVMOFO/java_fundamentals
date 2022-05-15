package labs_examples.datatypes_operators.labs;

/**
 * Fundamentals Exercise 4: Volume and Surface Area
 *
 *      Write the necessary code to calculate the volume and surface area of a cylinder
 *      with a radius of 3.14 and a height of 5. Print out the result.
 *
 */

public class Exercise_06 {

    public static void main(String[] args) {

        // write code here
        // Volume = π * r-squared * height
        float r = 3.14f;
        float h = 5;
        float p = 3.1415926535898f;
        float v = (r * r * h * p);
        System.out.println("The Volume of the Cylinder with a radius of " + r + " and height of " + h + " = " + v);
        //Surface area = 2*pie*r*h+2*pie*r*r
        float s = (2 * p * r * h) + (2 * p * r * r);
        System.out.println("The Surface Area of the Cylinder with a radius of " + r + " and height of " + h + " = " + s);


    }
}