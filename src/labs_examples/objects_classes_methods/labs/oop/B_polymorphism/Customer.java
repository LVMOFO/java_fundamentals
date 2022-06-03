package labs_examples.objects_classes_methods.labs.oop.B_polymorphism;
/**
 * Created by Bo Bender 220602@2244
 */
public class Customer {
    String name;
    float discount;
    int phone;

    public Customer(String name, float discount, int phone) {
        this.name = name;
        this.discount = discount;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getDiscount() {
        return discount;
    }

    public void setDiscount(float discount) {
        this.discount = discount;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", discount=" + discount +
                ", phone=" + phone +
                '}';
    }
}
