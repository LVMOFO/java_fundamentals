package labs_examples.objects_classes_methods.labs.oop.B_polymorphism;
/**
 * Created by Bo Bender 220605@1108
 */
public class GIOverloadMethod
{
    public static void main(String[] args) {
        float returnValue;
        //add Numbers
        returnValue = addThreeNumbers(50, 25, 75);
        System.out.println("Returning int + int + int = " + returnValue);
        System.out.println("--  --  --  --  --  --  --  --  --  --  --  --");
        returnValue = addThreeNumbers(20, 30, 29.8f);
        System.out.println("Returning int + int + float = " + returnValue);
        System.out.println("--  --  --  --  --  --  --  --  --  --  --  --");
        returnValue = addThreeNumbers(13, 13.2f, 13.1f);
        System.out.println("Returning int + float + float = " + returnValue);
        System.out.println("--  --  --  --  --  --  --  --  --  --  --  --");
        returnValue = addThreeNumbers(22.2f, 22.2f, 22.2f);
        System.out.println("Returning float + float + float = " + returnValue);
        System.out.println("--  --  --  --  --  --  --  --  --  --  --  --");
        returnValue = addThreeNumbers(100, 69.69f, 100);
        System.out.println("Returning int + float + int = " + returnValue);
        System.out.println("--  --  --  --  --  --  --  --  --  --  --  --");
        returnValue = addThreeNumbers(23.30f, 20, 25.7f);
        System.out.println("Returning float + int + float = " + returnValue);
        System.out.println("--  --  --  --  --  --  --  --  --  --  --  --");
    }
    public static float addThreeNumbers(int a, int b, int c){
        float d = a + b + c;
        return d;
    }
    public static float addThreeNumbers(int a, int b, float c){
        float d = a + b + c;
        return d;
    }
    public static float addThreeNumbers(int a, float b, float c){
        float d = a + b + c;
        return d;
    }
    public static float addThreeNumbers(float a, float b, float c){
        float d = a + b + c;
        return d;
    }
    public static float addThreeNumbers(int a, float b, int c){
        float d = a + b + c;
        return d;
    }
    public static float addThreeNumbers(float a, int b, float c){
        float d = a + b + c;
        return d;
    }

}