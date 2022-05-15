package labs_examples.datatypes_operators.labs;

/**
 * Please demonstrate the use of all logical operators below. These include:
 * <p>
 * AND, short-circuit AND, OR, short-circuit OR, XOR, NOT
 */
class LogicalOperators {

    public static void main(String[] args) {

        // example of "OR"
        boolean a = true;
        boolean b = false;
        if (a | b) {
            System.out.println("a or b is true");
        }

        // write your code below
        System.out.println("write your code below");
        if (a & b) {
            System.out.println("1. a and b are true");
        }
        if (a && b) {
            System.out.println("2. a and b are true");
        }
        if (a | b) {
            System.out.println("3. a or b is true");
        }
        if (a || b) {
            System.out.println("4. a or b is true");
        }
        if (a ^ b) {
            System.out.println("5. either a or b is true; but not both");
        }
        if (a != b) {
            System.out.println("6. a does not equal b");
        }
//AND, short-circuit AND, OR, short-circuit OR, XOR, NOT
    }

}