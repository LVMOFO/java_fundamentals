package labs_examples.objects_classes_methods.labs.methods;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class MaxDivisibleByTwoOtherNumbers {
    public static void main(String[] args) {

    }
    //could create an array for each of all possible divisors
    //then run through array and pull matches
    //or run through array and check both at same time
    public static int[] isDivisibleByBoth(int m, int d1, int d2){
        System.out.println();
        System.out.println("#7.--------------------FACTORS OF BOTH PARMS ("+ d1 + ", " + d2 + ") IN A NUMBER (" + m + ")--------------------");
        int iAdd = 0;
        int iCntFactorsArray = 0;
        String sAdd;
        ArrayList<String> factorsArray = new ArrayList<String>();
        for (int i=1; i<=m; i++){
            if (i >= d1){
                if (i % d1 == 0){
                        if (i >= d2) {
                            if (i % d2 == 0) {
                                iAdd = i;
                                sAdd = Integer.toString(iAdd);
                                factorsArray.add(sAdd);
                                iCntFactorsArray++;
                            }
                        }
                }
            }
        }

        int[] returnArray = new int[iCntFactorsArray];
        iAdd = 0;
        for (String sElement : factorsArray){
            returnArray[iAdd] = Integer.valueOf(sElement);
            System.out.print(Integer.valueOf(sElement) + ", ");
            iAdd++;
        }
        System.out.println();
        System.out.println();
        return returnArray;
    }
}