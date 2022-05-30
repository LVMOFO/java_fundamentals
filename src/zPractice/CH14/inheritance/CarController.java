package zPractice.CH14.inheritance;

public class CarController {
    public static void main(String[] args) {
        Truck truck = new Truck("Ford", "F350", 25000, 500);
        Sedan sedan = new Sedan("Pontiac", "Grand Am", 200000, 80);
        Motorcycle moto = new Motorcycle("Honda", "CR250R", 2000, 250, false );

        //truck.setMake("Ford");
        //sedan.setMake("Honda");

        System.out.println(truck.getMake() + " " + truck.getModel() + " " + truck.getMiles() + " " + truck.getBedCapacity());
        truck.accelerate(100);
        System.out.println(sedan.getMake() + " " + sedan.getModel() + " " + sedan.getMiles() + " " + sedan.getTrunkCapacity());
        sedan.accelerate(55);
        System.out.println(moto.getMake() + " " + moto.getModel() + " " + moto.getMiles() + " " + moto.getCc() + " " + moto.isTwoSeat());
        moto.accelerate(70);
    }
}
