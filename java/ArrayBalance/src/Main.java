/*
 *      0   1   2   3   4   5   6   7   8   9
 *      /\                                 /\
 *      leftPointer              rightpointer
 *
 *      2 pointers from both ends move towards each other depending on sum of values from pointer to end.
 *      After 2 pointers meet at the same location total of sum from location to their own end is compared
 *          to see if the array is balanced.
 *
 *      At least this is the intention but I couldn't get it working as expected.
 *
 */

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input       = new Scanner(System.in);
        int[] numberArray   = new int[10];

//  Read array elements
        for ( int index = 0 ; index < 10 ; index++ )
        {
            numberArray[index] = input.nextInt();
        }

        int leftPointer     = 0;
        int leftTotal       = numberArray[leftPointer];
        int rightPointer    = 9;
        int rightTotal      = numberArray[rightPointer];

        while ( leftPointer != rightPointer )
        {
            if ( leftTotal == rightTotal )
            {
                if ( leftPointer < (9 - rightPointer) )
                {
                    leftPointer++;
                    leftTotal += numberArray[ leftPointer ];
                }
                else
                {
                    rightPointer--;
                    rightTotal += numberArray[ rightPointer ];
                }
            }
            else if ( leftTotal < rightTotal )
            {
                System.out.print( "leftPointer = " + leftPointer + "\n" );      // Debug only
                System.out.print( "leftTotal = " + leftTotal + "\n" );         // Debug only
                leftPointer++;
                leftTotal += numberArray[ leftPointer ];
            }
            else
            {
                System.out.print( "rightPointer = " + rightPointer + "\n" );   // Debug only
                System.out.print( "rightTotal = "+ rightTotal + "\n" );        // Debug only
                rightPointer--;
                rightTotal += numberArray[ rightPointer ];
            }
        }

        if ( leftTotal < rightTotal)
        {
            leftTotal += numberArray[ leftPointer + 1 ];
        }
        else
        {
            rightTotal += numberArray[ rightPointer - 1 ];
        }

        System.out.print( leftTotal + "\n" );      // Debug only
        System.out.print( rightTotal + "\n" );     // Debug only

        if ( leftTotal == rightTotal)
        {
            System.out.print( "Can be balanced" );
        }
        else
        {
            System.out.print( "Can not be balanced" );
        }
    }
}
