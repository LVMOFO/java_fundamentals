package zPractice.CH14;
/**
 * Created by Bo Bender 220529@1244
 */
public class Truck {
    private String make;
    private String model;
    private double miles;
    private double bedCapacity;

    public Truck() {

    }

    public Truck(String make, String model, double miles, double bedCapacity) {
        this.make = make;
        this.model = model;
        this.miles = miles;
        this.bedCapacity = bedCapacity;
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

    public double getBedCapacity() {
        return bedCapacity;
    }

    public void setBedCapacity(double bedCapacity) {
        this.bedCapacity = bedCapacity;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", miles=" + miles +
                ", bedCapacity=" + bedCapacity +
                '}';
    }
}
