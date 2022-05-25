package labs_examples.objects_classes_methods.labs.methods;
/**
 * Modified by Bo Bender 220524@1430
 */
import javax.sound.midi.Soundbank;

public class PrimeNumbers {
    public static void main(String[] args) {

    }
    public static boolean checkPrimes(int p) {
        System.out.println();
        System.out.println("#5.--------------------THIS IS AN EXAMPLE OF A PRIME NUMBER--------------------");
        System.out.print("The number " + p + " is a PRIME Number: ");
        int iPrime = 0;
        boolean bPrime = true;
        int iComp = 2;
        if (p == 0 || p == 1) {
            bPrime = false;
        } else if (p == 2) {
              bPrime = true;
        } else {
            for (int i = 2; i < p; i++) {
                iPrime = p % iComp;
                if (iPrime == 0) {
                    bPrime = false;
                    break;
                }
                iComp++;
            }
        }
        return bPrime;
    }
}
