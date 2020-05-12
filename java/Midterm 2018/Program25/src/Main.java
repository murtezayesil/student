//    Write a Java program that accepts an integer (n) and computes the value of n+nn+nnn.
//    In case of wrong input, you must print out text "error".
//
//            Input:
//            5
//            Output:
//            5 + 55 + 555 = 615

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {

        Scanner input = new Scanner( System.in );

        try
        {
            int number = input.nextInt();
            if ( number < 10 )
            {
                int number2 = number + number * 10;
                int number3 = number2 + number * 100;
                int result  = number + number2 + number3;

                System.out.print(number + " + " + number2 + " + " + number3 + " = " + result);
            }
            else
            {
                int number2 = number + number*100;
                int number3 = number2 + number*10000;
                int result  = number + number2 + number3;

                System.out.print(number + " + " + number2 + " + " + number3 + " = " + result);
            }

        }
        catch ( InputMismatchException exception )
        {
            System.out.print( "error" );
        }
    }
}
