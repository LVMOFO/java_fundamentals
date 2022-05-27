package labs_examples.objects_classes_methods.labs.objects;
/**
 * Created by Bo Bender 220526@2330
 */
public class GIJoe {
    String name;
    String rank;
    int salary;


    public GIJoe(String name) {
        this.name = name;
    }

    public GIJoe(String name, String rank) {
        this.name = name;
        this.rank = rank;
    }

    public GIJoe(String rank, int salary) {
        this.rank = rank;
        this.salary = salary;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "GIJoe{" +
                "name='" + name + '\'' +
                ", rank='" + rank + '\'' +
                ", salary=" + salary +
                '}';
    }
}
