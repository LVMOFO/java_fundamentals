package labs_examples.objects_classes_methods.labs.methods;
/**
 * Modified by Bo Bender 220522@1204
 */
/**
 * Created by ryandesmond - https://codingnomads.co
 */
public class DoWhileExample {

    public static void main(String[] args) {
        int x = doWhileExample();
        System.out.println(x);
    }

    public static int doWhileExample() {

        int count = 0;
        int val = 0;

        do  {
            val += count;
            count++;
        } while (count < 51);
        count--;
        System.out.println("The sum of the numbers from 1 to " + count + " = " + val);
        return val;

    }

}
