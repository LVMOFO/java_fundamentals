package labs_examples.objects_classes_methods.labs.objects;
/**
 * Created by Bo Bender 220525@1930
 */
public class Weapons {
    private boolean hasMissiles;
    private int missileCount;
    private String bulletSize;
    private int bulletCount;
    public Weapons(boolean hasMissiles, int missileCount, String bulletSize, int bulletCount){
        this.hasMissiles = hasMissiles;
        this.missileCount = missileCount;
        this.bulletSize = bulletSize;
        this.bulletCount = bulletCount;
    }

    public boolean isHasMissiles() {
        return hasMissiles;
    }

    public void setHasMissiles(boolean hasMissiles) {
        this.hasMissiles = hasMissiles;
    }

    public int getMissileCount() {
        return missileCount;
    }

    public void setMissileCount(int missileCount) {
        this.missileCount = missileCount;
    }

    public String getBulletSize() {
        return bulletSize;
    }

    public void setBulletSize(String bulletSize) {
        this.bulletSize = bulletSize;
    }

    public int getBulletCount() {
        return bulletCount;
    }

    public void setBulletCount(int bulletCount) {
        this.bulletCount = bulletCount;
    }

    @Override
    public String toString() {
        return "Weapons{" +
                "hasMissiles=" + hasMissiles +
                ", missileCount=" + missileCount +
                ", bulletSize='" + bulletSize + '\'' +
                ", bulletCount=" + bulletCount +
                '}';
    }
}
