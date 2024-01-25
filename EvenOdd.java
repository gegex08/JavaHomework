package evenodd;

import java.util.Scanner;

/**
 *
 * @author ocampog4446
 */

public class EvenOdd {
    public static void main(String[] args) {
    
    Scanner input = new Scanner( System.in );
    
    System.out.print( "Enter an integer: " ); // prompt for input
    int number = input.nextInt(); 


    if(number%2==0)
        {
        System.out.println("Number is Even");
    }
    if(number%2==1)
    {
        System.out.println("Number is Odd");
    }
    }
    
}
