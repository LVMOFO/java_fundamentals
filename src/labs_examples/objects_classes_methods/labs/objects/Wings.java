package labs_examples.objects_classes_methods.labs.objects;
/**
 * Created by Bo Bender 220525@1930
 */
public class Wings {
    private int wingSpan;
    private String maker;

    public Wings(int wingSpan, String maker){
        this.wingSpan = wingSpan;
        this.maker = maker;

    }

    public int getWingSpan() {
        return wingSpan;
    }

    public void setWingSpan(int wingSpan) {
        this.wingSpan = wingSpan;
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    @Override
    public String toString() {
        return "Wings{" +
                "wingSpan=" + wingSpan +
                ", maker='" + maker + '\'' +
                '}';
    }
}
