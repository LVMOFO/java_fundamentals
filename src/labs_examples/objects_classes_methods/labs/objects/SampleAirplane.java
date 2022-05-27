package labs_examples.objects_classes_methods.labs.objects;

import java.nio.file.Watchable;

public class SampleAirplane {
    public static void main(String[] args) {
        PowerPlant myPowerPlant = new PowerPlant(702, 7000);
        Weapons myWeapons = new Weapons(true, 8, "40mm", 10000);
        CounterMeasures myCounterMeasures = new CounterMeasures(true, true, true);
        Wings myWings = new Wings(70, "Boeng");
        Tires myTires = new Tires(120, "Goodyear");
        Airplane myAirplane = new Airplane(myPowerPlant, myWeapons, myCounterMeasures,  myWings, myTires, "A-10",400d, 0.88d);

        //System.out.println("My plane is an " + myAirplane.planeType + " it has a bullet count of " + myWeapons.bulletCount);
    }
}
