package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

public class FoodDemo {
    public static void main(String[] args) {
        Carbohydrate rootBeerBarrel = new Carbohydrate('C', false, false, false, false, "brown", "Rootbeer Barrel", 5, 'S');
        Sugars  rootBeerBarrel2 = new Sugars('C', false, false, false, false, "brown", "Rootbeer Barrel", 5, 'S', true, false, false, false);
        Protein chicken = new Protein('P', false, false, false, true, "Red", "Chicken", 4, 'F');
        int totalCaloricValue = chicken.theCaloricValue(8);
        Fat avocado = new Fat('F', false, true, false, false, "green", "Avocado", 9, 'U');
        System.out.println(rootBeerBarrel);
        System.out.println();
        System.out.println(rootBeerBarrel2);
        System.out.println();
        System.out.println(chicken);
        System.out.println();
        System.out.println(avocado);
        System.out.println();
        System.out.println(chicken.getName());
        System.out.println();
        System.out.println(avocado.getColor());
        System.out.println();
        System.out.println(rootBeerBarrel.getColor());
        System.out.println(rootBeerBarrel.toString());
        System.out.println();
        System.out.println(rootBeerBarrel2.getColor());
        System.out.println(rootBeerBarrel2.toString());
    }
}
