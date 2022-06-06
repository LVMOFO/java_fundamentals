package labs_examples.objects_classes_methods.labs.oop.B_polymorphism;
/**
 * Created by Bo Bender 220605@1020
 */
public class Navy extends Military{

    protected boolean hasNuclear;

    public Navy(String branch, String mobileMethod, String vehicle, String nickname, boolean hasNuclear) {
        super(branch, mobileMethod, vehicle, nickname);
        this.hasNuclear = hasNuclear;
    }

    @Override
    public String motto() {
        System.out.println(this.getBranch() + "Motto - Non sibi sed patriae --> Not self but country");
        return null;
    }

    @Override
    public String song() {
        System.out.println(this.getBranch() + "Song --> Anchors Aweigh");
        return null;
    }

    @Override
    public String lowestRank() {
        System.out.println(this.getBranch() + "Lowest Rank --> Seaman Recruit");
        return null;
    }

    @Override
    public void goToWar(){
        System.out.println(this.nickname + " go to war by boating");
    }
    public boolean isHasNuclear() {
        return hasNuclear;
    }

    public void setHasNuclear(boolean hasNuclear) {
        this.hasNuclear = hasNuclear;
    }


    @Override
    public String toString() {
        return "Navy{" +
                "hasNuclear=" + hasNuclear +
                ", branch='" + branch + '\'' +
                ", mobileMethod='" + mobileMethod + '\'' +
                ", vehicle='" + vehicle + '\'' +
                ", nickname='" + nickname + '\'' +
                '}';
    }
}
