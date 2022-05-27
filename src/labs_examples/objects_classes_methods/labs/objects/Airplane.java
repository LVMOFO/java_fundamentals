package labs_examples.objects_classes_methods.labs.objects;
/**
 * Created by Bo Bender 220525@1930
 */

class AirplaneExample {
    public static void main(String[] args) {

    }
}





class Airplane {
    double fuelCapacity;
    double currentFuelLevel;
    public Airplane(double fuelCapacity, double currentFuelLevel){
        this.fuelCapacity = fuelCapacity;
        this.currentFuelLevel = currentFuelLevel;
    }
}




class Weapons{
    boolean hasMissiles;
    int bulletSize;
    public Weapons(boolean hasMissiles, int bulletSize){
        this.hasMissiles = hasMissiles;
        this.bulletSize = bulletSize;
    }
}




class PowerPlant{
    double maxSpeed;
    double thrust;

    public PowerPlant(double maxSpeed, double thrust) {
        this.maxSpeed = maxSpeed;
        this.thrust = thrust;
    }
}




class Wings{
    int wingSpan;
    String maker;

    public Wings(int wingSpan, String maker){
        this.wingSpan = wingSpan;
        this.maker = maker;

    }
}




class Tires{
    int tirePressure;
    int brand;
    public Tires(int tirePressure, int brand){
        this.tirePressure = tirePressure;
        this.brand = brand;
    }

    public int getTirePressure() {
        return tirePressure;
    }

    public void setTirePressure(int tirePressure) {
        this.tirePressure = tirePressure;
    }

    public int getBrand() {
        return brand;
    }

    public void setBrand(int brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Tires{" +
                "tirePressure=" + tirePressure +
                ", brand=" + brand +
                '}';
    }
}