package labs_examples.objects_classes_methods.labs.oop.B_polymorphism;
/**
 * Created by Bo Bender 220605@1015
 */
public class Army extends Military{
    protected boolean hasWeapons;

    public Army(String branch, String mobileMethod, String vehicle, String nickname, boolean hasWeapons) {
        super(branch, mobileMethod, vehicle, nickname);
        this.hasWeapons = hasWeapons;
    }

    @Override
    public String motto() {
        System.out.println(this.getBranch() + "Motto - This We'll Defend");
        return null;
    }

    @Override
    public String song() {
        System.out.println(this.getBranch() + "Song --> The Army Goes Rolling Along");
        return null;
    }

    @Override
    public String lowestRank() {
        System.out.println(this.getBranch() + "Lowest Rank --> Private");
        return null;
    }

    public boolean isHasWeapons() {
        return hasWeapons;
    }

    public void setHasWeapons(boolean hasWeapons) {
        this.hasWeapons = hasWeapons;
    }

    @Override
    public String toString() {
        return "Army{" +
                "hasWeapons=" + hasWeapons +
                ", branch='" + branch + '\'' +
                ", mobileMethod='" + mobileMethod + '\'' +
                ", vehicle='" + vehicle + '\'' +
                ", nickname='" + nickname + '\'' +
                '}';
    }
}
