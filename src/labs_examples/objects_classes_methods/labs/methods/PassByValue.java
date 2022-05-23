package labs_examples.objects_classes_methods.labs.methods;
/**
 * Modified by Bo Bender 220522@1541
 */
public class PassByValue {
    public static void main(String[] args) {

    }

    public static void runPassByVal() {
        System.out.println();
        System.out.println("#2a.--------------------THIS IS AN EXAMPLE OF PASS BY VALUE--------------------");
        int a = 22;
        System.out.println("Pass by Value initial value Main method = " + a);
        PassByValue.iPassByValue(a);
        System.out.println("Pass by Value after returning to Main method = " + a);

        System.out.println();
        String s = "Adding some text";
        System.out.println("Pass by Value initial value Main method = " + s);
        PassByValue.iPassByValue(s);
        System.out.println("Pass by Reference after method value = " + s);
    }
    //Pass by Value
    public static void iPassByValue(int a){
        a = a+10;
        System.out.println("Pass by Value inside method after increment = " + a);
    }
    public static void iPassByValue(String s){
        s = s + "-->Added more to end";
        System.out.println("Pass by Value inside method after String concat = " + s);
    }
}
