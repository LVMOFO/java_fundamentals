package labs_examples.objects_classes_methods.labs.objects;
/**
 * Created by Bo Bender 220525@1930
 */
public class PowerPlant {
    private double maxSpeed;
    private double thrust;

    public PowerPlant(double maxSpeed, double thrust) {
        this.maxSpeed = maxSpeed;
        this.thrust = thrust;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public double getThrust() {
        return thrust;
    }

    public void setThrust(double thrust) {
        this.thrust = thrust;
    }

    @Override
    public String toString() {
        return "PowerPlant{" +
                "maxSpeed=" + maxSpeed +
                ", thrust=" + thrust +
                '}';
    }
}
