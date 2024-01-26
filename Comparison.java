package comparison;

/****************************************************
 * Programmer: Geneiva Ocampo
 * Course CSCI 1471
 * Date 01/24/2024
 * Assignment: Homework #1 : Comparison
 * Environment Java with Netbeans
 * Files Included: Comparison
 * Purpose: Understanding the Problem - to write a java app that outputs the inequalities of two integer numbers
 * Input: Integers
 * Preconditions/ Assumptions: 2 integers
 * Equations: inequalities 
 * Output: total result of 3 inequalities between two integers
 * Postconditions/Assumptions: All numbers are whole numbers
 * Algorithm:
 * Prompt user to enter integer
 * Prompt user to enter second integer
 * Compare if first integer is equal to second integer
 * Compare if first integer is not equal to second integer
 * Compare if first integer is less than second integer
 * Compare if first integer is greater to second integer
 * Compare if first integer is less than or equal to second integer
 * Compare if first integer is greater than or equal to second integer
 * Output corresponding message/s if comparison matches the equality or inequality
 ****************************************************/

// Fig. 2.15: Comparison.java Compare integers using if statements, relational operators and equality operators.
import java.util.Scanner; // program uses class Scanner
public class Comparison
{
public static void main( String[] args ) // main method begins execution of Java application
    {
// create Scanner to obtain input from command line
    Scanner input = new Scanner( System.in );
        int number1; // first number to compare
        int number2; // second number to compare
    System.out.print( "Enter first integer: " ); // prompt
        number1 = input.nextInt(); // read first number from user
    System.out.print( "Enter second integer: " ); // prompt
        number2 = input.nextInt(); // read second number from user
        if ( number1 == number2 )
    System.out.printf( "%d == %d\n", number1, number2 );
        if ( number1 != number2 )
    System.out.printf( "%d != %d\n", number1, number2 );
        if ( number1 < number2 )
    System.out.printf( "%d < %d\n", number1, number2 );
        if ( number1 > number2 )
    System.out.printf( "%d > %d\n", number1, number2 );
        if ( number1 <= number2 )
    System.out.printf( "%d <= %d\n", number1, number2 );
        if ( number1 >= number2 )
    System.out.printf( "%d >= %d\n", number1, number2 );
    } // end method main
} // end class Comparison
