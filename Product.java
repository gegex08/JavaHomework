
package product;

/****************************************************
 * Programmer: Geneiva Ocampo
 * Course CSCI 1471
 * Date 01/24/2024
 * Assignment: Homework #1 : Product
 * Environment Java with Netbeans
 * Files Included: Product
 * Purpose: Understanding the Problem - to write a java app that outputs the total product of 3 integers
 * Input: Integers
 * Preconditions/ Assumptions: 3 integers
 * Equations: result = x * y * z;
 * Output: total result of 3 numbers having been multiplied
 * Postconditions/Assumptions: All numbers are whole numbers
 * Algorithm:
 * Prompt user to enter integer
 * Prompt user to enter second integer
 * Prompt user to enter third integer
 * Calculate the total product of user inputs
 * Output total of product result
 ****************************************************/
import java.util.Scanner; // program uses Scanner
    public class Product
        {
        public static void main( String[] args )
        {
        // create Scanner to obtain input from command window
        Scanner input = new Scanner( System.in );
        int x; // first number input by user
        int y; // second number input by user
        int z; // third number input by user
        int result; // product of numbers
        System.out.print( "Enter first integer: " ); // prompt for input
        x = input.nextInt(); // read first integer
        System.out.print( "Enter second integer: " ); // prompt for input
        y = input.nextInt(); // read second integer
        System.out.print( "Enter third integer: " ); // prompt for input
        z = input.nextInt(); // read third integer
        result = x * y * z; // calculate product of numbers
        System.out.printf( "Product is %d\n", result );
        } // end method main
    }
