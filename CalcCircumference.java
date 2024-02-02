package calccircumference;

import java.util.Scanner;

/****************************************************
 * Programmer: Geneiva Ocampo
 * Course CSCI 1471
 * Date 01/31/2024
 * Assignment: Homework #2: CalcCircumference
 * Environment Java with Netbeans
 * Files Included: CalcCircumference
 * Purpose: To write an app that allows user too input radius and the program 
 * calculates the diameter, circumference, and area of a circle.
 * Input: radius
 * Preconditions/ Assumptions: Integer data type
 * Equations: circumference = 2*pi*radius, diameter =2 *radius, area= pi*radius^2
 * Output: 
 * Enter radius: 3
`* Diameter is 6
`* Area is 28.274334
`* Circumference is 18.849556
 * Postconditions/Assumptions: Data Type of Double Variables 
 * Contraints: variable data type is double
 * Algorithm: 
 * Prompt user to input number for the radius
 * Calculate and output diameter, area, and circumference
 ****************************************************/

public class CalcCircumference {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Scanner class
        Scanner input = new Scanner( System.in );
        
        //Ask user for radius
        System.out.print( "Enter the radius of the circle: " );
        
        //Declares input and variables as double data types to give broader range
        float radius = input.nextInt();

        //prints diameter
        System.out.printf("Diameter is %.0f\n", (radius * 2));
        //prints circumference formatted with 6 digits after the decimal
        System.out.printf("Circumference is %.6f\n", (Math.PI * radius * 2));
        //prints area with 6 digit after decimal point
        System.out.printf("Area is %.6f\n", Math.PI * Math.pow(radius, 2));

    }
    
}
