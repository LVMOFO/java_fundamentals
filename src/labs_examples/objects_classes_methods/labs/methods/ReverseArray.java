package labs_examples.objects_classes_methods.labs.methods;
/**
 * Modified by Bo Bender 220524@1430
 */
public class ReverseArray {
    public static void main(String[] args) {

    }
    public static int[] reverseAnArray(int[] incomingArray){
        System.out.println("#8.--------------------REVERSE AN ARRAY--------------------");
        System.out.println("---INITIAL ARRAY---");
        int iLen = incomingArray.length;
        for(int i : incomingArray){
            System.out.print(i + ", ");
        }
        int temp;

        for(int i = 0; i < incomingArray.length / 2; i++){
            temp = incomingArray[i];
            incomingArray[i] = incomingArray[incomingArray.length - i - 1];
            incomingArray[incomingArray.length - i - 1] = temp;
        }
//        int[] returnArray = new int[iLen];
//        for (int r = 0; r<iLen; r++){
//            returnArray[r] = incomingArray[r];
//        }
        System.out.println();
        System.out.println("---RETURN ARRAY---");
        for(int i : incomingArray){
            System.out.print(i + ", ");
        }
        return incomingArray;
    }
}

