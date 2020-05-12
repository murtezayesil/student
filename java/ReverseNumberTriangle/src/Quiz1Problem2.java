// package com.ps06;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Quiz1Problem2 {

    public static void main(String[] args) {
        // write your code here

        Scanner input = new Scanner(System.in);
        int number = 0;

        try
        {
            number = input.nextInt();
        }
        catch (InputMismatchException ex)
        {
            System.out.println( "Incorrect input" );
        }

        for ( int index = number ; index > 0 ; index-- )
        {
            //  Put numbers
            for ( int numberToPrint = 1 ; numberToPrint <= index ; numberToPrint++ )
            {
                System.out.print( " " + numberToPrint );
//                System.out.printf( ' ' );
            }

            //  End line
            System.out.println("");

        }

    }

}
