package labs_examples.objects_classes_methods.labs.oop.B_polymorphism;
/**
 * Created by Bo Bender 220605@1005
 */
public class Military implements InterfaceMilitary{
    protected String branch;
    protected String mobileMethod;
    protected String vehicle;
    protected String nickname;

    public Military(String branch, String mobileMethod, String vehicle, String nickname) {
        this.branch = branch;
        this.mobileMethod = mobileMethod;
        this.vehicle = vehicle;
        this.nickname = nickname;
    }

    @Override
    public String motto() {
        System.out.println(this.getBranch() + "Motto - Semper Fidelis -->Always Faithful");
        return null;
    }

    @Override
    public String song() {
        System.out.println(this.getBranch() + "Song --> Marines' Hymn");
        return null;
    }

    @Override
    public String lowestRank() {
        System.out.println(this.getBranch() + "Lowest Rank --> Private");
        return null;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getMobileMethod() {
        return mobileMethod;
    }

    public void setMobileMethod(String mobileMethod) {
        this.mobileMethod = mobileMethod;
    }

    public String getVehicle() {
        return vehicle;
    }

    public void setVehicle(String vehicle) {
        this.vehicle = vehicle;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
    public void goToWar(){
        System.out.println(this.nickname + " go to war by marching");
    }
    @Override
    public String toString() {
        return "Military{" +
                "branch='" + branch + '\'' +
                ", mobileMethod='" + mobileMethod + '\'' +
                ", vehicle='" + vehicle + '\'' +
                ", nickname='" + nickname + '\'' +
                '}';
    }
}
