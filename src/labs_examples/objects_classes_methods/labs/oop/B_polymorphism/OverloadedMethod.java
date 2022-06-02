package labs_examples.objects_classes_methods.labs.oop.B_polymorphism;
/**
 * Created by Bo Bender 220601@2210
 */
public class OverloadedMethod
{
    public static void main(String[] args) {
        float returnValue;
        //Multiply Numbers
        returnValue = multiplyThreeNumbers(5, 7, 6);
        System.out.println("Returning int * int * int = " + returnValue);
        System.out.println("--  --  --  --  --  --  --  --  --  --  --  --");
        returnValue = multiplyThreeNumbers(5, 7, 2.7f);
        System.out.println("Returning int * int * float = " + returnValue);
        System.out.println("--  --  --  --  --  --  --  --  --  --  --  --");
        returnValue = multiplyThreeNumbers(5, 7.6f, 2.7f);
        System.out.println("Returning int * float * float = " + returnValue);
        System.out.println("--  --  --  --  --  --  --  --  --  --  --  --");
        returnValue = multiplyThreeNumbers(2.1f, 7.1f, 2.7f);
        System.out.println("Returning float * float * float = " + returnValue);
        System.out.println("--  --  --  --  --  --  --  --  --  --  --  --");
        returnValue = multiplyThreeNumbers(5, 7.4f, 8);
        System.out.println("Returning int * float * int = " + returnValue);
        System.out.println("--  --  --  --  --  --  --  --  --  --  --  --");
        returnValue = multiplyThreeNumbers(6.9f, 7, 2.7f);
        System.out.println("Returning float * int * float = " + returnValue);
        System.out.println("--  --  --  --  --  --  --  --  --  --  --  --");
    }
    public static float multiplyThreeNumbers(int a, int b, int c){
        float d = a * b * c;
        return d;
    }
    public static float multiplyThreeNumbers(int a, int b, float c){
        float d = a * b * c;
        return d;
    }
    public static float multiplyThreeNumbers(int a, float b, float c){
        float d = a * b * c;
        return d;
    }
    public static float multiplyThreeNumbers(float a, float b, float c){
        float d = a * b * c;
        return d;
    }
    public static float multiplyThreeNumbers(int a, float b, int c){
        float d = a * b * c;
        return d;
    }
    public static float multiplyThreeNumbers(float a, int b, float c){
        float d = a * b * c;
        return d;
    }

}
