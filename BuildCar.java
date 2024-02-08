
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
        System.out.println("Speed increased by " + accelerate + " mph.\n");
        Speed = Speed + accelerate;
    }
    public void hitBreak(int decrement){
        System.out.println("Speed decreased by " + decrement + " mph.\n");
        Speed = Speed - decrement;
    }
    public void changeDirection(int increment){
        System.out.println("I just turned " + increment + " degrees.\n");
        Direction = Direction + increment;
    }
    public void addMiles(int miles){
        System.out.println("I added " + miles + " more miles to the trip.\n");
        Odometer = Odometer + miles;
    }
    public void checkFuel_gauge(int gas){
        System.out.println("Just added " + gas + " gallons of fuel.\n"); 
        Fuel_gauge = Fuel_gauge + gas;
    }
    public void startTest(){
        System.out.println("Status at Start\n");
        System.out.println("Speed = 0\n");
        System.out.println("Fuel = 0\n");
        System.out.println("Direction = 0\n");
        System.out.println("Odometer = 0\n");
        
    }
    public void endTest(){
        System.out.println("Status at Finish\n");
        System.out.println("Speed = " + Speed +"\n");
        System.out.println("Fuel = " + Fuel_gauge +"\n");
        System.out.println("Direction = " + Direction +"\n");
        System.out.println("Odometer = " + Odometer +"\n");
        System.out.printf("%s %d %s %.2f %s" , "I traveled " , Odometer , " and used " , Odometer/20.00 , " gallons of fuel\n");
    }
}

