package labs_examples.objects_classes_methods.labs.oop.B_polymorphism;
/**
 * Created by Bo Bender 220605@1010
 */
public class USAF extends Military{
    protected String aircraft;

    public USAF(String branch, String mobileMethod, String vehicle, String nickname, String aircraft) {
        super(branch, mobileMethod, vehicle, nickname);
        this.aircraft = aircraft;
    }

    @Override
    public String motto() {
        System.out.println(this.getBranch() + "  Motto - Aim High … Fly-Fight-Win");
        return null;
    }

    @Override
    public String song() {
        System.out.println(this.getBranch() + "  Song --> The U.S. Air Force");
        System.out.println("Off we go into the wild blue yonder,\n" +
                "Climbing high into the sun;\n" +
                "Here they come zooming to meet our thunder,\n" +
                "At 'em boys, Give 'er the gun! (Give 'er the gun now!)\n" +
                "Down we dive, spouting our flame from under,\n" +
                "Off with one helluva roar!\n" +
                "We live in fame or go down in flame. Hey!\n" +
                "Nothing'll stop the U.S. Air Force!");
        return null;
    }

    @Override
    public String lowestRank() {
        System.out.println(this.getBranch() + "  Lowest Rank --> Airman Basic");
        return null;
    }

    @Override
    public void goToWar(){
        System.out.println(this.nickname + " go to war by flying");
    }
    public String getAircraft() {
        return aircraft;
    }

    public void setAircraft(String aircraft) {
        this.aircraft = aircraft;
    }

    @Override
    public String toString() {
        return "USAF{" +
                "aircraft='" + aircraft + '\'' +
                ", branch='" + branch + '\'' +
                ", mobileMethod='" + mobileMethod + '\'' +
                ", vehicle='" + vehicle + '\'' +
                ", nickname='" + nickname + '\'' +
                '}';
    }
}
