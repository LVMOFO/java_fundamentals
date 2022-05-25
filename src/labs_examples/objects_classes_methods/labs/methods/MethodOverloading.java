package labs_examples.objects_classes_methods.labs.methods;
/**
 * Modified by Bo Bender 220524@1430
 */
public class MethodOverloading {
    public static void main(String[] args) {

    }
    //Method Overloading Below
    public static void runMethodOverloading(){
        System.out.println("#1.--------------------THIS IS AN EXAMPLE OF METHOD OVERLOADING--------------------");
        int i = 0;
        double j = 0;
        float k=0.0f;
        System.out.println("---Using iMultiply with Integers---");
        i = iMultiply(10,7);
        System.out.println(i);
        i = iMultiply(10,7, 8);
        System.out.println(i);
        i = iMultiply(10,7, 8, 2);
        System.out.println(i);
        i = iMultiply(10,7, 8, 2, 3);
        System.out.println(i);
        System.out.println();

        System.out.println("---Using iMultiply with Doubles---");
        j = iMultiply(10,7);
        System.out.println(j);
        j = iMultiply(10,7, 8);
        System.out.println(j);
        j = iMultiply(10,7, 8, 2);
        System.out.println(j);
        j = iMultiply(10,7, 8, 2, 3);
        System.out.println(j);
        System.out.println();

        System.out.println("---Using iMultiply with Floats---");
        k = iMultiply(10.0f,7.0f);
        System.out.println(k);
        k = iMultiply(10.0f,7.0f, 8.0f);
        System.out.println(k);
        k = iMultiply(10.0f,7.0f, 8.0f, 2.0f);
        System.out.println(k);
        k = iMultiply(10.0f,7.0f, 8.0f, 2.0f, 3.0f);
        System.out.println(k);
    }
    public static int iMultiply(int a, int b){
        return a*b;
    }
    public static int iMultiply(int a, int b, int c){
        return a*b*c;
    }
    public static int iMultiply(int a, int b, int c, int d){
        return a*b*c*d;
    }
    public static int iMultiply(int a, int b, int c, int d, int e){
        return a*b*c*d*e;
    }
    public static double iMultiply(double a, double b){
        return a*b;
    }
    public static double iMultiply(double a, double b, double c){
        return a*b*c;
    }
    public static double iMultiply(double a, double b, double c, double d){
        return a*b*c*d;
    }
    public static double iMultiply(double a, double b, double c, double d, double e){
        return a*b*c*d*e;
    }
    public static float iMultiply(float a, float b){
        return a*b;
    }
    public static float iMultiply(float a, float b, float c){
        return a*b*c;
    }
    public static float iMultiply(float a, float b, float c, float d){
        return a*b*c*d;
    }
    public static float iMultiply(float a, float b, float c, float d, float e){
        return a*b*c*d*e;
    }
}
