package labs_examples.objects_classes_methods.labs.methods;

import java.util.ArrayList;

public class MaxDivisibleByTwoOtherNumbers {
    public static void main(String[] args) {

    }
    //could create an array for each of all possible divisors
    //then run through array and pull matches
    //or run through array and check both at same time
    public static int[] isDivisibleByBoth(int m, int d1, int d2){
        System.out.println();
        System.out.println("#7.--------------------FACTORS OF BOTH PARMS IN A NUMBER--------------------");
        int iAdd = 0;
        String sAdd;
        ArrayList<String> factorsArray = new ArrayList<String>();
        for (int i=1; i<=m; i++){
            if (i >= d1){
                if (i % d1 == 0){
                    iAdd = i;
                    sAdd = Integer.toString(iAdd);
                    factorsArray.add(sAdd);
                }
            }
        }
        int[] bo = new int[3];
        bo[0] = 31;
        bo[1] = 24;
        bo[2] = 13;

        int iAdd2 = 0;

        ArrayList<String> d1Array = new ArrayList<String>();
        int id1Cnt = 0;
        ArrayList<String> d2Array = new ArrayList<String>();

        for (int i=1; i<=m; i++){
            if (i >= d1){
                if (i % d1 == 0){
                    iAdd = i;
                    sAdd = Integer.toString(iAdd);
                    d1Array.add(sAdd);
                }
            }
        }
        System.out.println();
        for (int j=1; j<=m; j++){
            if (j >= d2){
                if (j % d2 == 0){
                    iAdd2 = j;
                    String sAdd2 = Integer.toString(iAdd2);
                    d2Array.add(sAdd2);
                }
            }
        }
        int iLend1Array = 0;
        for (String iCountd1Array : d1Array){
            iLend1Array++;
        }
        System.out.println("Cound of d1Array = " + iLend1Array);
        int iLend2Array = 0;
        for (String iCountd2Array : d2Array){
            iLend2Array++;
        }
        System.out.println("Cound of d2Array = " + iLend2Array);
        System.out.println("BEFORE - i3 and j3 : ");
//        for (int i3 = 0; i3 < iLend1Array; i3++){
//            for (int j3=0; j3<iLend2Array; j3++){
//                String sOfD1 = d1Array[i3];
//                String sOfD2 = d2Array[j3];
//                if (d1Array.equals() == d2Array.indexOf(j3)){
//                    iAdd = d1Array[i3].
//                            String sAdd = Integer.toString(iAdd);
//                    factorsArray.add(sAdd);
//                }
//            }
//        }
        System.out.println(d1Array);
        System.out.println(d2Array);
        System.out.println(factorsArray);
        return bo;
    }
}