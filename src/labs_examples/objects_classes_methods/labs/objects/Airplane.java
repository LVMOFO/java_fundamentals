package labs_examples.objects_classes_methods.labs.objects;
/**
 * Created by Bo Bender 220525@1930
 */
public class Airplane {
        PowerPlant powerPlant;
        Weapons weapons;
        CounterMeasures counterMeasures;
        Wings wings;
        Tires tires;
        private String planeType;
        private double fuelCapacity;
        private double currentFuelLevel;
        public Airplane(PowerPlant powerPlant, Weapons weapons, CounterMeasures counterMeasures, Wings wings, Tires tires, String planeType, double fuelCapacity, double currentFuelLevel){
            this.powerPlant = powerPlant;
            this.weapons = weapons;
            this.counterMeasures = counterMeasures;
            this.wings = wings;
            this.tires = tires;
            this.planeType = planeType;
            this.fuelCapacity = fuelCapacity;
            this.currentFuelLevel = currentFuelLevel;
        }

    public PowerPlant getPowerPlant() {
        return powerPlant;
    }

    public void setPowerPlant(PowerPlant powerPlant) {
        this.powerPlant = powerPlant;
    }

    public Weapons getWeapons() {
        return weapons;
    }

    public void setWeapons(Weapons weapons) {
        this.weapons = weapons;
    }

    public CounterMeasures getCounterMeasures() {
        return counterMeasures;
    }

    public void setCounterMeasures(CounterMeasures counterMeasures) {
        this.counterMeasures = counterMeasures;
    }

    public Wings getWings() {
        return wings;
    }

    public void setWings(Wings wings) {
        this.wings = wings;
    }

    public Tires getTires() {
        return tires;
    }

    public void setTires(Tires tires) {
        this.tires = tires;
    }

    public String getPlaneType() {
        return planeType;
    }

    public void setPlaneType(String planeType) {
        this.planeType = planeType;
    }

    public double getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(double fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public double getCurrentFuelLevel() {
        return currentFuelLevel;
    }

    public void setCurrentFuelLevel(double currentFuelLevel) {
        this.currentFuelLevel = currentFuelLevel;
    }

    @Override
    public String toString() {
        return "Airplane{" +
                "powerPlant=" + powerPlant + '\n' +
                ", weapons=" + weapons + '\n' +
                ", counterMeasures=" + counterMeasures + '\n' +
                ", wings=" + wings + '\n' +
                ", tires=" + tires + '\n' +
                ", planeType='" + planeType + '\n' +
                ", fuelCapacity=" + fuelCapacity + '\n' +
                ", currentFuelLevel=" + currentFuelLevel + '\n' +
                '}';
    }
}
