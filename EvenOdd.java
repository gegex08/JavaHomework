package evenodd;

import java.util.Scanner;

/****************************************************
 * Programmer: Geneiva Ocampo
 * Course CSCI 1471
 * Date 01/31/2024
 * Assignment: Homework #2: Even or Odd
 * Environment Java with Netbeans
 * Files Included: EvenOdd
 * Purpose: To write an app that distinguishes if integer input is odd or even
 * Input: Integers
 * Preconditions/ Assumptions: All numbers are whole numbers
 * Equations: input%2==0 input%2==1;
 * Output: odd or even
 * Postconditions/Assumptions: Type of Integer Variable 
 * Contraints: negative numbers 
 * Algorithm: 
 * Prompt user to input number
 * If number is divisible by two and does not have remainder, the output is even
 * If number is divisible by two and has remainder, the output is odd
 ****************************************************/

public class EvenOdd {
    public static void main(String[] args) {
    
        //Scanner class input allows user to input object
        Scanner input = new Scanner( System.in );

        //Prints "enter an integer"
        System.out.print( "Enter an integer: " ); // prompt for input

        //declares input as an integer data type
        int number = input.nextInt(); 

        //If statement to determine that if input is divided by 2 and 
        //remainder equals to zero
        //then the system will print number is even
        if(number % 2 == 0)
        {
            System.out.println("Number is Even");
        }

        //If statement to determine that if input is divided by 2 and 
        //remainder does not equal to zero
        //then the system will print number is even
        if(number % 2 == 1)
        {
            System.out.println("Number is Odd");
        }
    
    }
    
}