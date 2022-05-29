package zPractice;

public class Phone {
    String brand;
    String type;
    String color;
    int gbStoreage;

    public Phone(String brand, String type, String color, int gbStoreage) {
        this.brand = brand;
        this.type = type;
        this.color = color;
        this.gbStoreage = gbStoreage;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getGbStoreage() {
        return gbStoreage;
    }

    public void setGbStoreage(int gbStoreage) {
        this.gbStoreage = gbStoreage;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", type='" + type + '\'' +
                ", color='" + color + '\'' +
                ", gbStoreage=" + gbStoreage +
                '}';
    }
}
