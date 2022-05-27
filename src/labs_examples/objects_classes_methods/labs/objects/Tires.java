package labs_examples.objects_classes_methods.labs.objects;
/**
 * Created by Bo Bender 220525@1930
 */
public class Tires {
    private int tirePressure;
    private String brand;
    public Tires(int tirePressure, String brand) {
        this.tirePressure = tirePressure;
        this.brand = brand;
    }

    public int getTirePressure() {
        return tirePressure;
    }

    public void setTirePressure(int tirePressure) {
        this.tirePressure = tirePressure;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Tires{" +
                "tirePressure=" + tirePressure +
                ", brand='" + brand + '\'' +
                '}';
    }
}
