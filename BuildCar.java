
package mycarapp;

/**
 *
 * @author geneivaocampo
 */
public class BuildCar {

    private int Speed = 0;
    private int Odometer = 0;
    private int Direction = 0; 
    private int Fuel_gauge = 0;
        
    public void hitGas(int accelerate){
        System.out.println("Speed increased by " + accelerate + " mph.");
        Speed = Speed + accelerate;
    }
    public void hitBreak(int decrement){
        System.out.println("Speed decreased by " + decrement + " mph.");
        Speed = Speed - decrement;
    }
    public void changeDirection(int increment){
        System.out.println("I just turned " + increment + " degrees.");
        Direction = Direction + increment;
    }
    public void addMiles(int miles){
        System.out.println("I added " + miles + " more miles to the trip.");
        Odometer = Odometer + miles;
    }
    public void checkFuel_gauge(int gas){
        System.out.println("Just added " + gas + " gallons of fuel."); 
        Fuel_gauge = Odometer / 20;
    }
    public void startTest(){
        System.out.println("Status at Start");
        System.out.println("");
        System.out.println("Speed = 0");
        System.out.println("");
        System.out.println("Fuel = 0");
        System.out.println("");
        System.out.println("Direction = 0");
        System.out.println("");
        System.out.println("Odometer = 0");
        
    }
    public void endTest(){
        System.out.println("Status at Finish");
        System.out.println("");
        System.out.println("Speed = " + Speed);
        System.out.println("");
        System.out.println("Fuel = " + Fuel_gauge);
        System.out.println("");
        System.out.println("Direction = " + Direction);
        System.out.println("");
        System.out.println("Odometer = " + Odometer);
        System.out.println("I traveled " + Odometer + " and used " + Fuel_gauge + " gallons of fuel");
    }
}

