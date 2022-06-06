package labs_examples.objects_classes_methods.labs.oop.B_polymorphism;
/**
 * Created by Bo Bender 220605@1643
 */
public class InterfaceAsInstanceVariable {
    Military coastGuard;

    public InterfaceAsInstanceVariable(Military coastGuard) {
        this.coastGuard = coastGuard;
    }

    public void partMilitaryMethods(){
        coastGuard.motto();
        coastGuard.song();
    }

    public Military getCoastGuard() {
        return coastGuard;
    }

    public void setCoastGuard(Military coastGuard) {
        this.coastGuard = coastGuard;
    }
}
