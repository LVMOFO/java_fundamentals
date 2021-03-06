package labs_examples.objects_classes_methods.labs.objects;
/**
 * Created by Bo Bender 220526@2130
 */
public class SampleAirplane {
    public static void main(String[] args) {
        PowerPlant myPowerPlant = new PowerPlant(702, 7000);
        Weapons myWeapons = new Weapons(true, 8, "40mm", 10000);
        CounterMeasures myCounterMeasures = new CounterMeasures(true, true, true);
        Wings myWings = new Wings(70, "Boeng");
        Tires myTires = new Tires(120, "Goodyear");
        GIJoe myGIJoe = new GIJoe("Maximus Bender", "Brigadier General");
        Airplane myAirplane = new Airplane(myPowerPlant, myWeapons, myCounterMeasures,  myWings, myTires, "A-10",400d, 0.88d, myGIJoe);

        System.out.println("My plane is an " + myAirplane.getPlaneType() + " it has a bullet count of " + myAirplane.getWeapons().getBulletCount() + " and has CounterMeasures of : " + myAirplane.getCounterMeasures());
        System.out.println();
        System.out.println("My Airplane : " + myAirplane.toString());
        System.out.println("Set Method Here:");
        myAirplane.setPlaneType("OA10-A");
        System.out.println("Get Method Here:");
        String zPlane = myAirplane.getPlaneType();
        System.out.println(zPlane);
        System.out.println("myAirplane toString here: ");
        System.out.println("My Airplane : " + myAirplane.toString());
        System.out.println();
        System.out.println("My pilot is : " + myGIJoe.name + " his plane is : " + myAirplane.getPlaneType() + " " +
                "his plane has bullets that are " + myAirplane.getWeapons().getBulletSize() + " and there are " +
                myAirplane.getWeapons().getBulletCount() + " bullets loaded.");
        System.out.println();
        System.out.println("toStrings:");
        System.out.println(myGIJoe.toString());
        System.out.println(myAirplane.toString());
        System.out.println(myWeapons.toString());
        System.out.println(myCounterMeasures.toString());
        System.out.println(myWings.toString());
        System.out.println(myTires.toString());
    }
}
