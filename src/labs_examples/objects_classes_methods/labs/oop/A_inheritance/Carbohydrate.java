package labs_examples.objects_classes_methods.labs.oop.A_inheritance;
/**
 * Created by Bo Bender 220531@0111
 */
public class Carbohydrate extends Food{
    protected char simpleComplexFiber;



    public Carbohydrate(char carbFatProtein, boolean isVegetable, boolean isFruit, boolean isGrain, boolean isMeat, String color, String origin, int caloricValuePerGram, char simpleComplexFiber) {
        super(carbFatProtein, isVegetable, isFruit, isGrain, isMeat, color, origin, caloricValuePerGram);
        this.simpleComplexFiber = simpleComplexFiber;
    }




    public char getSimpleComplexFiber() {
        return simpleComplexFiber;
    }

    public void setSimpleComplexFiber(char simpleComplexFiber) {
        this.simpleComplexFiber = simpleComplexFiber;
    }

    @Override
    public String toString() {
        return "Carbohydrate{" +
                "simpleComplexFiber=" + simpleComplexFiber +
                ", carbFatProtein=" + carbFatProtein +
                ", isVegetable=" + isVegetable +
                ", isFruit=" + isFruit +
                ", isGrain=" + isGrain +
                ", color='" + color + '\'' +
                ", origin='" + name + '\'' +
                ", caloricValuePerGram=" + caloricValuePerGram +
                '}';
    }


}
