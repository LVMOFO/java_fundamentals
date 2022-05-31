package labs_examples.objects_classes_methods.labs.oop.A_inheritance;
/**
 * Created by Bo Bender 220531@0111
 */
public class Protein extends Food{
    protected char fibrousGlobularMembrane;


    public Protein(char carbFatProtein, boolean isVegetable, boolean isFruit, boolean isGrain, boolean isMeat, String color, String origin, int caloricValuePerGram, char fibrousGlobularMembrane) {
        super(carbFatProtein, isVegetable, isFruit, isGrain, isMeat, color, origin, caloricValuePerGram);
        this.fibrousGlobularMembrane = fibrousGlobularMembrane;
    }


    public char getFibrousGlobularMembrane() {
        return fibrousGlobularMembrane;
    }

    public void setFibrousGlobularMembrane(char fibrousGlobularMembrane) {
        this.fibrousGlobularMembrane = fibrousGlobularMembrane;
    }

    @Override
    public String getName() {
        return "OVERRIDE - Meats origin could is hard to substantiate due to farms worldwide";
    }
    @Override
    public String toString() {
        return "Protein{" +
                "fibrousGlobularMembrane=" + fibrousGlobularMembrane +
                ", carbFatProtein=" + carbFatProtein +
                ", color='" + color + '\'' +
                ", origin='" + name + '\'' +
                ", caloricValuePerGram=" + caloricValuePerGram +
                '}';
    }
}
