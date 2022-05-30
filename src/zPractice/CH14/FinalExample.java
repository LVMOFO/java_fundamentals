package zPractice.CH14;
/**
 * Created by Bo Bender 220529@1000
 */
public class FinalExample {
    // it is not possible to modify a final variable
    // ALL CAPS LOCKS for final variable names is common and accepted convention in Java
    public final double PI = 3.1415926535897932384626433832;

    public double getCircumference(double radius) {
        return ( 2 * PI * radius);
    }
}
