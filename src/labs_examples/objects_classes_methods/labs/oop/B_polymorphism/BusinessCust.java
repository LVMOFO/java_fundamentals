package labs_examples.objects_classes_methods.labs.oop.B_polymorphism;
/**
 * Created by Bo Bender 220602@2244
 */
public class BusinessCust extends Customer{
    float businessDiscount;

    public BusinessCust(String name, float discount, int phone, float businessDiscount) {
        super(name, discount, phone);
        this.businessDiscount = businessDiscount;
    }


    public float getBusinessDiscount() {
        return businessDiscount;
    }

    public void setBusinessDiscount(float businessDiscount) {
        this.businessDiscount = businessDiscount;
    }

    @Override
    public String toString() {
        return "BusinessCust{" +
                "businessDiscount=" + businessDiscount +
                ", name='" + name + '\'' +
                ", discount=" + discount +
                ", phone=" + phone +
                '}';
    }
}
