package labs_examples.objects_classes_methods.labs.oop.B_polymorphism;
/**
 * Created by Bo Bender 220602@2244
 */
public class BusinessCust extends Customer{
    protected float businessDiscount;

    public BusinessCust(String name, float discount, long phone, float businessDiscount) {
        super(name, discount, phone);
        this.businessDiscount = businessDiscount;
    }

    @Override
    public String printCustomerNameDiscount() {
        System.out.println("Customer name at Company (Company Name) discount is: " + this.name);
        System.out.println("Customer discount is: " + this.discount);
        return null;
    }

    @Override
    public String printCustomerLabel() {
        return null;
    }

    @Override
    public String callCustomer() {
        System.out.println("Calling Customer at Company (Company Name)");
        return null;
    }

    @Override
    public String printCustomerCreditCard() {
        return null;
    }

    @Override
    public void displayDiscount(float discount){
        System.out.println("As a Business Customer, you will receive a " + discount + " discount on all purchase!");
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
