package labs_examples.objects_classes_methods.labs.oop.B_polymorphism;
/**
 * Created by Bo Bender 220603@532
 */
public class DemoCustomer {
    public static void main(String[] args) {
        MilitaryCust airmen = new MilitaryCust("Private Benjamin", 0.25f, 5137028912L, 0.25f);
        System.out.println(airmen.toString());
        Customer basic = new Customer("Jesse Adkins", 0.04f, 7247322141L);
        basic.callCustomer();
        basic.printCustomerCreditCard();
        basic.printCustomerLabel();
        basic.printCustomerNameDiscount();
        airmen.printCustomerNameDiscount();
        BusinessCust Chase = new BusinessCust("Jason Mann", 0.15f, 6140001234L,0.15f);
        Chase.printCustomerNameDiscount();
        Chase.callCustomer();

    }
}
