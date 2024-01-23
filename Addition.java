/****************************************************
 * Programmer: Geneiva Ocampo
 * Course CSCI 1471
 * Date 01/24/2024
 * Assignment: Homework #1: Problem 2
 * Environment Java with Netbeans
 * Files Included: JavaApplication2
 * Purpose: Find the letter Grade
 * Input: Integer between 1-100
 * Preconditions/ Assumptions: All numbers have the same value
 * Equations: 
 * Output: Letter Grade
 * Postconditions/Assumptions: Type of Integer Variable 
 * Contraints: Scale
 * Algorithm: 
 * Prompt User to enter a number 
 * Calculate number to match letter grade
 * Output letter grade
 ****************************************************/
//*********** Addition ***********
// Fig. 2.7: Addition.java
// Addition program that displays the sum of two numbers.
import java.util.Scanner; // program uses class Scanner
public class Addition
{
// main method begins execution of Java application
    public static void main( String[] args )
    {
        // create a Scanner to obtain input from the command window
        Scanner input = new Scanner( System.in );
        int number1; // first number to add
        int number2; // second number to add
        int sum; // sum of number1 and number2
        System.out.print( "Enter first integer: " ); // prompt
        number1 = input.nextInt(); // read first number from user
        System.out.print( "Enter second integer: " ); // prompt
        number2 = input.nextInt(); // read second number from user
        sum = number1 + number2; // add numbers, then store total in sum
        System.out.printf( "Sum is %d\n", sum ); // display sum
    } // end method main
} // end class Addition
