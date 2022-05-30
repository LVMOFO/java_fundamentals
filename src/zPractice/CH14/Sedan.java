package zPractice.CH14;

public class Sedan {
    private String make;
    private String model;
    private double miles;
    private double trunkCapacity;

    public Sedan() {

    }

    public Sedan(String make, String model, double miles, double trunkCapacity) {
        this.make = make;
        this.model = model;
        this.miles = miles;
        this.trunkCapacity = trunkCapacity;
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

    public double getTrunkCapacity() {
        return trunkCapacity;
    }

    public void setTrunkCapacity(double trunkCapacity) {
        this.trunkCapacity = trunkCapacity;
    }

    @Override
    public String toString() {
        return "Sedan{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", miles=" + miles +
                ", trunkCapacity=" + trunkCapacity +
                '}';
    }
}
