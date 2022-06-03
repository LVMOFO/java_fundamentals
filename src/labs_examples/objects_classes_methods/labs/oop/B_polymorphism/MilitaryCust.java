package labs_examples.objects_classes_methods.labs.oop.B_polymorphism;
/**
 * Created by Bo Bender 220602@2254
 */
public class MilitaryCust extends Customer {
    float militarydicount;

    public MilitaryCust(String name, float discount, int phone, float militarydicount) {
        super(name, discount, phone);
        this.militarydicount = militarydicount;
    }

    public float getMilitarydicount() {
        return militarydicount;
    }

    public void setMilitarydicount(float militarydicount) {
        this.militarydicount = militarydicount;
    }

    @Override
    public String toString() {
        return "MilitaryCust{" +
                "militarydicount=" + militarydicount +
                ", name='" + name + '\'' +
                ", discount=" + discount +
                ", phone=" + phone +
                '}';
    }
}
