package mycarapp;

import java.util.Scanner;


public class MyCarApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        BuildCar testCar1 = new BuildCar();
        BuildCar testCar2 = new BuildCar();
        
        
        System.out.println("Car 1 Status at Start\n");
        testCar1.startTest();
        testCar1.hitGas(50);
        testCar1.hitBreak(10);
        testCar1.hitGas(20);
        testCar1.addMiles(100);
        testCar1.addMiles(20);
        testCar1.checkFuel_gauge(10);
        testCar1.changeDirection(90);
        testCar1.endTest();
        
        System.out.println("Car 2 Status at Start\n");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the acceleration speed: ");
        int increment = input.nextInt();
        System.out.print("Enter the direction moved in degrees if right positive if left use negative number: ");
        int degrees = input.nextInt();
        System.out.print("Enter the fuel pumped: ");
        int gas = input.nextInt();
        System.out.print("Enter the miles traveled: ");
        int miles = input.nextInt();
        
        testCar2.hitGas(increment);
        testCar2.changeDirection(degrees);
        testCar2.checkFuel_gauge(gas);
        testCar2.addMiles(miles);
        testCar2.endTest();
    }
}
