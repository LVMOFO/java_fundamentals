package labs_examples.objects_classes_methods.labs.objects;

import java.util.Arrays;

public class Pilot {
    int height;
    float weight;
    float yearExperience;
    boolean multiLingual;
    String[] languages;
    float salary;

    public Pilot(int height, float weight, float yearExperience, boolean multiLingual, String[] languages, float salary) {
        this.height = height;
        this.weight = weight;
        this.yearExperience = yearExperience;
        this.multiLingual = multiLingual;
        this.languages = languages;
        this.salary = salary;
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

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Pilot{" +
                "height=" + height +
                ", weight=" + weight +
                ", yearExperience=" + yearExperience +
                ", multiLingual=" + multiLingual +
                ", languages=" + Arrays.toString(languages) +
                ", salary=" + salary +
                '}';
    }
}
