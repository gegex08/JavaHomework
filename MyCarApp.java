package mycarapp;

import java.util.Scanner;


public class MyCarApp {

    /****************************************************
 * Programmer: Geneiva Ocampo
 * Course CSCI 1471
 * Date 02/9/2024
 * Assignment: Homework #3: MyCarApp
 * Environment Java with Netbeans
 * Files Included: MyCarApp & BuildCar
 * Purpose: create 2 car objects and specify requirements towards a trip
 * Input: Integers
 * Preconditions/ Assumptions: That program starts at zero
 * Equations: Speed = Speed + accelerate, Speed = Speed - decrement, 1*degrees 
Direction = Direction - degrees; if (degrees <= 0), if (degrees >= 0) 
Direction = Direction + degrees, Odometer = Odometer + miles, Fuel_gauge = Fuel_gauge + gas, Fuel_pumped = Fuel_gauge - Odometer/20;
 * Output: Speed, Fuel, Direction, Odometer, Fuel Used
 * Postconditions/Assumptions: Type of Integer Variable 
 * Contraints: 2 class objects
 * Algorithm: 
 * Prompt User to enter a Speeds
 * Prompt user to enter Miles Traveled
 * Prompt User to enter Fuel Used
 * Prompt user to enter direction used in positive degrees for right and negative degrees for left
 *
 * Output the initial Speed, Fuel, Direction, Odometer, Fuel Used at 0
 * Output the new values after user input and use equations for output
 * Output final results after adding each value together
 ****************************************************/
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
        testCar1.gasUsed(10);
        testCar1.endTest();
        
        System.out.println("Car 2 Status at Start\n");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the acceleration speed: ");
        int increment = input.nextInt();
        System.out.print("Enter the direction moved in degrees: if right enter positive number, if left use negative number: ");
        int degrees = input.nextInt();
        System.out.print("Enter the fuel pumped: ");
        int gas = input.nextInt();
        System.out.print("Enter the miles traveled: ");
        int miles = input.nextInt();
        
        testCar2.hitGas(increment);
        testCar2.changeDirection(degrees);
        testCar2.checkFuel_gauge(gas);
        testCar2.addMiles(miles);
        testCar2.gasUsed(miles);
        testCar2.endTest();
    }
}
