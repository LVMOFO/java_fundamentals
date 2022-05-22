package labs_examples.objects_classes_methods.labs.methods;

import java.util.Arrays;

public class Largest4Numbers {
    public static void main(String[] args) {
        //int[] nums = new int[10];
        String iElements = highest4Numbers(26, 33, 3, 12, 5, 17, 15, 8, 1);
        System.out.println(iElements);


    }

    public static String highest4Numbers(int... args) {
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
//        int iLength = iArray.length - 1;
//        int iReturn = iLength;
//        return iReturn;


//        int count = 0;
//        for (int nums : args){
//            count++;
//            System.out.println(count);
//        }
//        int[] iArray = new int[count];
//        int iCount = 0;
//        for (int nums : args){
//            iArray(iCount) = nums(iCount);
//            iCount++;
//            System.out.println(count);
//        }
        //Arrays.sort()




