package labs_examples.objects_classes_methods.labs.objects;

import java.util.Arrays;

public class Pilot{
    int height;
    float weight;
    float yearExperience;
    boolean multiLingual;
    String[] languages;

    public Pilot(int height, float weight, float yearExperience, boolean multiLingual, String[] languages) {
        this.height = height;
        this.weight = weight;
        this.yearExperience = yearExperience;
        this.multiLingual = multiLingual;
        this.languages = languages;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getYearExperience() {
        return yearExperience;
    }

    public void setYearExperience(float yearExperience) {
        this.yearExperience = yearExperience;
    }

    public boolean isMultiLingual() {
        return multiLingual;
    }

    public void setMultiLingual(boolean multiLingual) {
        this.multiLingual = multiLingual;
    }

    public String[] getLanguages() {
        return languages;
    }

    public void setLanguages(String[] languages) {
        this.languages = languages;
    }

    @Override
    public String toString() {
        return "Pilot{" +
                "height=" + height +
                ", weight=" + weight +
                ", yearExperience=" + yearExperience +
                ", multiLingual=" + multiLingual +
                ", languages=" + Arrays.toString(languages) +
                '}';
    }
}
