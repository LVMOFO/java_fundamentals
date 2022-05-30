package zPractice.CH14.inheritance;

/**
 * Created by Bo Bender 220529@1000
 */
public class Motorcycle extends Vehicle {
        private int cc;
        private boolean twoSeat;

    public Motorcycle(int cc, boolean twoSeat) {
        this.cc = cc;
        this.twoSeat = twoSeat;
    }

    public Motorcycle(String make, String model, double miles, int cc, boolean twoSeat) {
        super(make, model, miles);
        this.cc = cc;
        this.twoSeat = twoSeat;
    }
    // @Override is not required, but will stop people from changing the method signatures
    //     as it will not compile and we will know something is wrong
    @Override
    public void accelerate(double mph){
        System.out.println("motorcyle accelerating");
        //steps to accelerate motorcycle
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public boolean isTwoSeat() {
        return twoSeat;
    }

    public void setTwoSeat(boolean twoSeat) {
        this.twoSeat = twoSeat;
    }
}

//    // THIS IS ILLEGAL - you cannot override a final method in a parent class
//    @Override
//    public final void start(){
//
//    }
//    {
