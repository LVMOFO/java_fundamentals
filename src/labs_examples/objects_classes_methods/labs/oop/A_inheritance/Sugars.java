package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

public class Sugars extends Carbohydrate{

    protected boolean isCandy;
    protected boolean isDessert;
    protected boolean isProcessedFood;
    protected boolean isSoda;


    public boolean isCandy() {
        return isCandy;
    }

    public void setCandy(boolean candy) {
        isCandy = candy;
    }

    public boolean isDessert() {
        return isDessert;
    }

    public void setDessert(boolean dessert) {
        isDessert = dessert;
    }

    public boolean isProcessedFood() {
        return isProcessedFood;
    }

    public void setProcessedFood(boolean processedFood) {
        isProcessedFood = processedFood;
    }

    public boolean isSoda() {
        return isSoda;
    }

    public void setSoda(boolean soda) {
        isSoda = soda;
    }

    public Sugars(char carbFatProtein, boolean isVegetable, boolean isFruit, boolean isGrain, boolean isMeat, String color, String origin, int caloricValuePerGram, char simpleComplexFiber, boolean isCandy, boolean isDessert, boolean isProcessedFood, boolean isSoda) {
        super(carbFatProtein, isVegetable, isFruit, isGrain, isMeat, color, origin, caloricValuePerGram, simpleComplexFiber);
        this.isCandy = isCandy;
        this.isDessert = isDessert;
        this.isProcessedFood = isProcessedFood;
        this.isSoda = isSoda;

    }

    @Override
    public String getColor() {
        return "OVERRIDE - Color is irrelevant for this item";
    }

    @Override
    public String toString() {
        return "Sugars{" +
                "isSoda=" + isSoda +
                ", simpleComplexFiber=" + simpleComplexFiber +
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
