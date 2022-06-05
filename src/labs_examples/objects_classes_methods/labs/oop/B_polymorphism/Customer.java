package labs_examples.objects_classes_methods.labs.oop.B_polymorphism;

import java.sql.SQLOutput;

/**
 * Created by Bo Bender 220602@2244
 */
public class Customer implements CustInterface {
    protected String name;
    protected float discount;
    protected long phone;

    public Customer(String name, float discount, long phone) {
        this.name = name;
        this.discount = discount;
        this.phone = phone;
    }

    @Override
    public String printCustomerNameDiscount() {
        System.out.println("Customer name is: " + this.name);
        System.out.println("Customer discount is: " + this.discount);
        return null;
    }

    @Override
    public String printCustomerLabel() {
        System.out.println("Printing customer label");
        return null;
    }

    @Override
    public String callCustomer() {
        System.out.println("Calling Customer");
        return null;
    }

    @Override
    public String printCustomerCreditCard() {
        System.out.println("Printing Customer Credit Care");
        return null;
    }


    public void displayDiscount(float discount){
        System.out.println("As a regular customer there is no discount");
    }
    public void sendCarePackage(String name){
        System.out.println("Regular Care Package sent");
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

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
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
