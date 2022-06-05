package labs_examples.objects_classes_methods.labs.oop.B_polymorphism;
/**
 * Created by Bo Bender 220602@2254
 */
public class MilitaryCust extends Customer {
    protected float militaryDiscount;

    public MilitaryCust(String name, float discount, long phone, float militarydicount) {
        super(name, discount, phone);
        this.militaryDiscount = militarydicount;
    }

    @Override
    public String printCustomerNameDiscount() {
        System.out.println("Customer name and rank is: " + this.name);
        System.out.println("Customer discount is: " + this.discount);
        return null;
    }

    @Override
    public String printCustomerLabel() {
        return null;
    }

    @Override
    public String callCustomer() {
        return null;
    }

    @Override
    public String printCustomerCreditCard() {
        return null;
    }

    @Override
    public void displayDiscount(float discount){
        System.out.println("As a Military Customer, you will receive a " + discount + " discount on all purchase!!");
    }
    public float getMilitarydicount() {
        return militaryDiscount;
    }

    public void setMilitarydicount(float militarydicount) {
        this.militaryDiscount = militarydicount;
    }

    @Override
    public String toString() {
        return "MilitaryCust{" +
                "militarydiscount=" + militaryDiscount +
                ", name='" + name + '\'' +
                ", discount=" + discount +
                ", phone=" + phone +
                '}';
    }
}
