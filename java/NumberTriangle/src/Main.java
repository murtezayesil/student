// package com.ps06;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        for ( int index = 1  ; index <= number ; index++ )
        {
            //  Put spaces
            for ( int spaces = number - index ; spaces > 0 ; spaces-- )
            {
                System.out.print(' ');
            }

            //  Put numbers
            for ( int numberToPrint = 1 ; numberToPrint <= index ; numberToPrint++ )
            {
                System.out.print( numberToPrint );
            }

            //  End line
            System.out.println("");

        }
    }

}
