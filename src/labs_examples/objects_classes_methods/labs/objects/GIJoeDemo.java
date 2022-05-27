package labs_examples.objects_classes_methods.labs.objects;

public class GIJoeDemo {
    public static void main(String[] args) {
        GIJoe bo = new GIJoe("Bo Bender");
        GIJoe michele = new GIJoe("Michele Kelly", "Captain");
        GIJoe snakeEyes = new GIJoe("Colonel", 100000);

        System.out.println(bo.toString());
        System.out.println(michele.toString());
        System.out.println(snakeEyes.toString());
    }
}
