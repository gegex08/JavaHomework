/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buildcar;

/**
 *
 * @author OcampoG4446
 */
public class MyCarApp {
      public static void main(String[] args) {
        // TODO code application logic here
        private int Speed = 0;
        private int Odometer = 0;
        private int Direction = 0; 
        private int Fuel_gauge = 0;
        
    }
    public static void main(String[] args)
    {
    public void testCar1(){
        System.out.println("Status at Finish");
        System.out.println("");
        System.out.println("Speed = " Speed);
        System.out.println("");
        System.out.println("Fuel = " Fuel);
        System.out.println("");
        System.out.println("Direction = " Direction);
        System.out.println("");
        System.out.println("Odometer = " Odometer);
        System.out.println("I traveled" Speed/Fuel_gauge "and used" Odometer "gallons of fuel."); 
    }
    public void changeCadence(int newValue)
    {
    cadence = newValue;
    }
    public void changeGear(int newValue)
    {
    gear = newValue;
    }
    public void speedUp(int increment)
    {
    speed = speed + increment;
    }
    public void applyBrakes(int decrement)
    {
    speed = speed - decrement;
    }
    public void printStates()
    {
    System.out.println("cadence:" +
    cadence + " speed:" +
    speed + " gear:" + gear);
    }
}
}
