package labs_examples.objects_classes_methods.labs.methods;
/**
 * Modified by Bo Bender 220524@1430
 */
public class CountConsonants {
    public static void main(String[] args) {

    }
    public static int iCountConsonants(String sIn){
        System.out.println();
        System.out.println("#4.--------------------THIS IS COUNT ALL CONSONANTS--------------------");
        String sInToUpper = sIn.toUpperCase();
        int iCons = sInToUpper.length();
        int iCntCons = 0;
        for (int i=0; i<iCons; i++){
            char cha = sInToUpper.charAt(i);
            if (cha == 'A' | cha == 'E' | cha == 'I' | cha == 'O' | cha == 'U'){
                iCntCons += 0;
            } else {
                iCntCons += 1;
            }
        }
        return iCntCons;
    }
}
