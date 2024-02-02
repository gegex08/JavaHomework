package spacethedigits;

/****************************************************
 * Programmer: Geneiva Ocampo
 * Course CSCI 1471
 * Date 01/31/2024
 * Assignment: Homework #2: Space The Digits
 * Environment Java with Netbeans
 * Files Included: SpaceTheDigits   
 * Purpose: Allows user to input a number consisting of 5 digits to be separate
 * Input: 5 digit number
 * Preconditions/Assumptions: that it is a 5 digit number
 * Equations: /10000, /1000, /100, /10, /1,  number - (10000 * digit1);,
 * number - (1000 * digit1);, number - (100 * digit1);,number - (10 * digit1);
 * Output: a line of integers separated by a space in between
 * Postconditions/Assumptions: Type of Variable
 * Contraints: Number of digits
 * Algorithm: 
 * Prompt user to enter a 5 digit number
 * After each number in between insert a space by the following:
 * Divide the number by a 10000 
 * 
 * 
 ****************************************************/


import java.util.Scanner;

public class SpaceTheDigits {

    public static void main(String[] args) {
        // create a Scanner to obtain input from the command window
        Scanner input = new Scanner( System.in );
        
        //Ask user to input 5 digit long number
        System.out.print("Enter a 5 digit number: ");
        
        //Declare input as integer to use the format specifier %d
        int number = input.nextInt();
        int number2 = number;
        //First separate
        int digit1 = number / 10000;// will get the first whole number
        number = number - (10000 * digit1);//used to break number apart
        //second separate
        int digit2 = number / 1000;// will get two integers infront of decimal
        number = number - (1000 * digit2);// breaks apart numbers
        //third separate
        int digit3 = number / 100;//gets the first 3 numbers infron of decimal
        number = number - (100 * digit3);// breaks apart numbers
        //fourth separate
        int digit4 = number / 10;//gets the first 4 numbers infront of decimal
        number = number - (10 * digit4);// breaks apart numbers
        //fifth separate
        int digit5 = number / 1;// breaks apart numbers
        number = number - (1 * digit5);
        
        
        
        //use the %d to print the assignd value to that decimal 
        System.out.printf("Digits in %d are %d %d %d %d %d \n", number2, digit1, digit2, digit3, digit4, digit5); // will get the first number next to the decimal
        
    }
    
}
