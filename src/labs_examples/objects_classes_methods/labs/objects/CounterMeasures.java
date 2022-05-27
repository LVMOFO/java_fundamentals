package labs_examples.objects_classes_methods.labs.objects;

public class CounterMeasures {
    private boolean hasChaff;
    private boolean hasFlare;
    private boolean hasPod;

    public CounterMeasures(boolean hasChaff, boolean hasFlare, boolean hasPod){
        this.hasChaff = true;
        this.hasFlare = true;
        this.hasPod = true;
    }

    public boolean isHasChaff() {
        return hasChaff;
    }

    public void setHasChaff(boolean hasChaff) {
        this.hasChaff = hasChaff;
    }

    public boolean isHasFlare() {
        return hasFlare;
    }

    public void setHasFlare(boolean hasFlare) {
        this.hasFlare = hasFlare;
    }

    public boolean isHasPod() {
        return hasPod;
    }

    public void setHasPod(boolean hasPod) {
        this.hasPod = hasPod;
    }

    @Override
    public String toString() {
        return "CounterMeasures{" +
                "hasChaff=" + hasChaff +
                ", hasFlare=" + hasFlare +
                ", hasPod=" + hasPod +
                '}';
    }
}
