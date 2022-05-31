package labs_examples.objects_classes_methods.labs.oop.A_inheritance;
/**
 * Created by Bo Bender 220531@0111
 */
public class Fat extends Food{
    protected char saturatedUnsaturated;


    public Fat(char carbFatProtein, boolean isVegetable, boolean isFruit, boolean isGrain, boolean isMeat, String color, String origin, int caloricValuePerGram, char saturatedUnsaturated) {
        super(carbFatProtein, isVegetable, isFruit, isGrain, isMeat, color, origin, caloricValuePerGram);
        this.saturatedUnsaturated = saturatedUnsaturated;
    }


    public char getSaturatedUnsaturated() {
        return saturatedUnsaturated;
    }

    public void setSaturatedUnsaturated(char saturatedUnsaturated) {
        this.saturatedUnsaturated = saturatedUnsaturated;
    }


    @Override
    public String toString() {
        return "Protein{" +
                "saturatedUnsaturated=" + saturatedUnsaturated +
                ", carbFatProtein=" + carbFatProtein +
                ", isVegetable=" + isVegetable +
                ", isFruit=" + isFruit +
                ", isGrain=" + isGrain +
                ", isMeat=" + isMeat +
                ", color='" + color + '\'' +
                ", origin='" + name + '\'' +
                ", caloricValuePerGram=" + caloricValuePerGram +
                '}';
    }
}
