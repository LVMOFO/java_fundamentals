package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

/**
 * Run the class below and study the output. What prints and why?
 *
 * Your answer:  The answer is 10.  Object a is of Type A; as written it could use methods from B but there are none.
 * So as it works its way up to A and finds public variable i; it sets it and skips past B as there are no methods.
 *
 */
class A {
    int i = 10;
}

class B extends A{
    int i = 20;
}

public class Exercise_02 {

    public static void main(String[] args) {
        A a = new B();

        System.out.println(a.i);
    }
}