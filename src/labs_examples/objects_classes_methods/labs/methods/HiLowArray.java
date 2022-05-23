package labs_examples.objects_classes_methods.labs.methods;

public class HiLowArray {
    public static void main(String[] args) {

    }
    public static int[] HiLowNums(int... args) {
        System.out.println("#6.--------------------RETURNING HI-LOW ARRAY--------------------");
        //String sReturn = "";
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
        for (int j : iArray) {
            System.out.print(j + " ");
//            if (i >= iLength - 3) {
//                sReturn += iArray[i] + " ";
//            }
        }
        System.out.println();
        System.out.println("ARRAY WITH LOW and HIGH NUMBERS:");
        int[] returnArray = new int[2];
        returnArray[0] = iArray[0];
        returnArray[1] = iArray[iArray.length - 1];
        return returnArray;
    }
}
