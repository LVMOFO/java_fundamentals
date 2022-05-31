package labs_examples.objects_classes_methods.labs.oop.A_inheritance;
/**
 * Created by Bo Bender 220531@0111
 */
class Food {

    protected char carbFatProtein;
    protected boolean isVegetable;
    protected boolean isFruit;
    protected boolean isGrain;
    protected boolean isMeat;
    protected String color;
    protected String name;
    protected int caloricValuePerGram;

    public Food(char carbFatProtein, boolean isVegetable, boolean isFruit, boolean isGrain, boolean isMeat, String color, String origin, int caloricValuePerGram) {
        this.carbFatProtein = carbFatProtein;
        this.isVegetable = isVegetable;
        this.isFruit = isFruit;
        this.isGrain = isGrain;
        this.isMeat = isMeat;
        this.color = color;
        this.name = origin;
        this.caloricValuePerGram = caloricValuePerGram;
    }

        int theCaloricValue(int ounces){
            return ounces * caloricValuePerGram;
        }
//    double fuelneeded(int miles) {
//        return (double) miles / mpg;
//    }

    public char getCarbFatProtein() {
        return carbFatProtein;
    }

    public void setCarbFatProtein(char carbFatProtein) {
        this.carbFatProtein = carbFatProtein;
    }

    public boolean isVegetable() {
        return isVegetable;
    }

    public void setVegetable(boolean vegetable) {
        isVegetable = vegetable;
    }

    public boolean isFruit() {
        return isFruit;
    }

    public void setFruit(boolean fruit) {
        isFruit = fruit;
    }

    public boolean isGrain() {
        return isGrain;
    }

    public void setGrain(boolean grain) {
        isGrain = grain;
    }

    public boolean isMeat() {
        return isMeat;
    }

    public void setMeat(boolean meat) {
        isMeat = meat;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCaloricValuePerGram() {
        return caloricValuePerGram;
    }

    public void setCaloricValuePerGram(int caloricValuePerGram) {
        this.caloricValuePerGram = caloricValuePerGram;
    }


    @Override
    public String toString() {
        return "Food{" +
                "carbFatProtein=" + carbFatProtein +
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

