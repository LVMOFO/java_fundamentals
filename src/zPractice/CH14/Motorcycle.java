package zPractice.CH14;
/**
 * Created by Bo Bender 220529@1000
 */
public class Motorcycle extends Vehicle {
        int cubicLiters;
        Motorcycle(int cubicLiters){
            mpg = 30;
            fuel_capacity = 10;
            type = "Motorcycle";
            this.cubicLiters = cubicLiters;
        }

//    // THIS IS ILLEGAL - you cannot override a final method in a parent class
//    @Override
//    public final void start(){
//
//    }
//    {
}
