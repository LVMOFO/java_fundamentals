package zPractice.CH14.inheritance;

public class Boat extends Vehicle{
    private boolean isInboard;
    private boolean isSpeedBoat;


    public Boat(String make, String model, double miles, boolean isInboard, boolean isSpeedBoat) {
        super(make, model, miles);
        this.isInboard = isInboard;
        this.isSpeedBoat = isSpeedBoat;
    }

    public boolean isInboard() {
        return isInboard;
    }

    public void setInboard(boolean inboard) {
        isInboard = inboard;
    }

    public boolean isSpeedBoat() {
        return isSpeedBoat;
    }

    public void setSpeedBoat(boolean speedBoat) {
        isSpeedBoat = speedBoat;
    }

    @Override
    public String toString() {
        return "Boat{" +
                "isInboard=" + isInboard +
                ", isSpeedBoat=" + isSpeedBoat +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", miles=" + miles +
                '}';
    }
}
