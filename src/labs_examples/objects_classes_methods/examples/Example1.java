package labs_examples.objects_classes_methods.examples;
/* A program that uses the Vehicle class.
   Call this file VehicleDemo.java
*/
class Vehicle4 {
    private double interestRate = .05;
    // notice that the variables below are private
    //private int passengers; // number of passengers
    protected int passengers; //**BO- changed to protected as private was only avalilable in this class
    //private int fuelcap;    // fuel capacity in gallons
    protected int fuelcap;    //**BO- changed to protected as private was only available in this class
    //private int mpg;        // fuel consumption in miles per gallon
    protected int mpg;        //**BO- changed to protected as private was only available in this class
    Vehicle4(int passengers, int fuelcap, int mpg){
        this.passengers = passengers;
        this.fuelcap = fuelcap;
        this.mpg = mpg;
    }
    public double getInterestRate(){
        return this.interestRate;
    }
}

// This class declares an object of type Vehicle.
class VehicleDemo {
    public static void main(String args[]) {
        int range;
        // assign values to fields in minivan
        Vehicle4 minivan = new Vehicle4(8, 20, 20);
        double i = minivan.getInterestRate();
        // UNCOMMENT THE LINES BELOW - WHY DO WE SEE ERRORS?
        // /*
        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 22;
        //Vehicle4 corvette = new Vehicle4();    //**BO- This needed 3 int parms in parenthesis
        Vehicle4 corvette = new Vehicle4(0,0,0);
        corvette.passengers = 2;
        corvette.fuelcap = 15;
        corvette.mpg = 12;
        range = minivan.mpg * minivan.fuelcap;
        System.out.println("Minivan can carry " + minivan.passengers +
                " with a range of " + range);
        range = corvette.mpg * corvette.fuelcap;
        System.out.println("Mr. Corvette can carry " + corvette.passengers +
                " with a range of " + range);
       // */
        int val = sum(10,12);
    }

    public static int intMethod(){
        int number = 10;
        return number;
    }
    public static double doubleMethod(){
        double number = 10.0;
        return number;
    }
    public static int sum(int a, int b){
        return a + b;
    }
}