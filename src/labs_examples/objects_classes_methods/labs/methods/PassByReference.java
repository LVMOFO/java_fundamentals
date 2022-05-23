package labs_examples.objects_classes_methods.labs.methods;
/**
 * Modified by Bo Bender 220522@1541
 */
public class PassByReference {
    public static void main(String[] args) {


    }

    public static void runPassByRef() {
        Zoomy mySequoia = new Zoomy();
        System.out.println();
        System.out.println("#2b.--------------------THIS IS AN EXAMPLE OF PASS BY REFERENCE--------------------");

        mySequoia.sColor = "Black";
        mySequoia.sLicense = "509ZLF";
        mySequoia.sState = "OH";
        mySequoia.sMake = "Toyota";
        mySequoia.sModel = "Sequoia";
        mySequoia.sYear = "2003";
        mySequoia.sMiles = "295,141";
        System.out.println(mySequoia.toString());
        setSomeColor(mySequoia);
        setMiles(mySequoia);
        System.out.println(mySequoia.toString());


    }
    public static void setSomeColor(Zoomy car){
        car.sColor = "Green";
    }
    public static void setMiles(Zoomy car){
        car.sMiles = "300,000";

    }
}



