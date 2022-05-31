package zPractice.CH14.inheritance;
/**
 * Created by Bo Bender 220529@1000
 */
public class Vehicle {
    protected String make;
    protected String model;
    protected double miles;

    public Vehicle(){
        // stuff we have to do here
    }
    public void accelerate(double mph){
        System.out.println("vehicle accelerating by " + " " + mph + " miles per hour.");
        //all steps required to accelerate... clutch, gas, gear
    }
    public Vehicle(String make, String model, double miles) {
        this.make = make;
        this.model = model;
        this.miles = miles;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getMiles() {
        return miles;
    }

    public void setMiles(double miles) {
        this.miles = miles;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", miles=" + miles +
                '}';
    }
}
