
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
    }
    public void addMiles(int miles){
        System.out.println("I added " + miles + " more miles to the trip.");
    }
    public void checkFuel_gauge(int gas){
        System.out.println("Just added " + gas + " gallons of fuel.");  
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
        System.out.println(Speed);
    }
}

