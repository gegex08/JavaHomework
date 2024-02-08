
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
        System.out.println("Speed increased by " + accelerate + " mph");
    }
    public void hitBreak(int decrement){
        System.out.println("Speed decreased by " + decrement + " mph");
    }
    public void changeDirection(int increment){
        System.out.println("I added " + Direction + " more miles to the trip");
    }
    public void addMiles(int miles){
        System.out.println("I added " + miles + " more miles to the trip");
    }
    public void checkFuel_gauge(int miles){
        Fuel_gauge = miles / 20;
        System.out.println("I traveled" + Fuel_gauge + "and used" + Odometer + "gallons of fuel.");  
    }
    public void testCar(){
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
}

