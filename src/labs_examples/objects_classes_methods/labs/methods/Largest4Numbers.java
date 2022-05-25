package labs_examples.objects_classes_methods.labs.methods;
/**
 * Modified by Bo Bender 220524@1430
 */
import java.util.Arrays;

public class Largest4Numbers {
    public static void main(String[] args) {

    }

    public static String highest4Numbers(int... args) {
        System.out.println("#3.--------------------LARGEST FOUR NUMBERS--------------------");
        String sReturn = "";
        int[] iArray = args;
        int iLength = iArray.length - 1;
        System.out.println("BEGINNING ARRAY:");
        for (int i = 0; i<iArray.length; i++){
            System.out.print(iArray[i] + " ");
        }
        System.out.println();
        int temp;
        for (int i = 0; i < iArray.length; i++) {
            for (int j = i + 1; j < iArray.length; j++) {
                if (iArray[i] > iArray[j]) {
                    temp = iArray[i];
                    iArray[i] = iArray[j];
                    iArray[j] = temp;
                }
            }
        }
        System.out.println("SMALLEST TO LARGEST:");
        for (int i = 0; i<iArray.length; i++){
            System.out.print(iArray[i] + " ");
            if (i >= iLength - 3) {
                sReturn += iArray[i] + " ";
            }
        }
        System.out.println();
        System.out.println("HIGHEST FOUR NUMBERS:");
        return sReturn;
    }
}




