package labs_examples.objects_classes_methods.labs.oop.B_polymorphism;

import java.sql.SQLOutput;

/**
 * Created by Bo Bender 220605@1025
 */
public class ADemoMilitary {
    public static void main(String[] args) {
        Military marine = new Military("Marine", "air, land, sea", "feet", "jarheads");
        System.out.println(marine.toString());
        System.out.println();
        System.out.println("Overriding Military toString() with other branches toStrings");
        USAF A10 = new USAF("USAF", "air", "Airplane", "zoomies", "OA10 Warthog");
        System.out.println(A10);
        System.out.println(        );
        Army tank = new Army("Army", "land", "Tanks", "grunts", true);
        System.out.println(tank.toString());
        System.out.println(        );
        Navy bigBoat = new Navy("Navy", "water", "Battleshipts", "seamen", true);
        System.out.println(bigBoat.toString());
        System.out.println(        );
        System.out.println(        );
        System.out.println("Overriding Parent Method:"        );
        marine.goToWar();
        A10.goToWar();
        tank.goToWar();
        bigBoat.goToWar();
        System.out.println(        );
        System.out.println( "Overriding Parent Methods in Interface:"       );
        bigBoat.motto();
        bigBoat.song();
        bigBoat.lowestRank();
        System.out.println(        );
        System.out.println(        );
        marine.motto();
        marine.song();
        marine.lowestRank();
        System.out.println(        );
        System.out.println(        );
        tank.motto();
        tank.song();
        tank.lowestRank();
        System.out.println(        );
        System.out.println(        );
        A10.motto();
        A10.song();
        A10.lowestRank();
        System.out.println("______________Injection_____________");
        InterfaceAsInstanceVariable newBranch = new InterfaceAsInstanceVariable(A10);
        newBranch.partMilitaryMethods();
        System.out.println("___________________________");
        newBranch.setCoastGuard(marine);
        newBranch.partMilitaryMethods();
        System.out.println("__  __ ___ ___ ___ ___ ___ ___ __  __");
        System.out.println(newBranch.getCoastGuard());
        System.out.println("__  __ ___ ___ ___ ___ ___ ___ __  __");
    }
}
