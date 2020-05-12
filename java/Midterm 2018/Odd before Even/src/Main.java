
//      mmmm      #      #         mmmmmm   "                    m
//     m"  "m  mmm#   mmm#         #      mmm     m mm   mmm   mm#mm
//     #    # #" "#  #" "#         #mmmmm   #     #"  " #   "    #
//     #    # #   #  #   #         #        #     #      """m    #
//      #mm#  "#m##  "#m##         #      mm#mm   #     "mmm"    "mm

/* Instructions: ************************************************************
*                                                                           *
*  Write a Java program to rearrange all the elements of a given array of   *
*  integers so that all the odd numbers come before all the even numbers.   *
*                                                                           *
*  Input: N (size of an array, where 1 ≤ N ≤ 1000), an array.               *
*                                                                           *
*  Input:                                                                   *
*    5                                                                      *
*    3 8 47 5 0                                                             *
*  Output:                                                                  *
*    3 47 5 8 0                                                             *
*                                                                           *
****************************************************************************/

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner( System.in );

        int arraySize = input.nextInt();                        // Learn arraySize
        int[] intArray = new int[ arraySize ];                  //
        for ( int index = 0 ; index < arraySize ; index++ )     //  //  learn intArray
        {                                                       //  //
            intArray[ index ] = input.nextInt();                //  //
        }                                                       //  //

        for ( int index = 0 ; index < arraySize ; index++ )     // For all the numbers in intArray
        {                                                       //
            if ( intArray[ index ] % 2 != 0 )                   //  // print odd numbers
            {                                                   //  //
                System.out.print( intArray[ index ] + " ");     //  //
            }                                                   //  //
        }                                                       //
        for ( int index = 0 ; index < arraySize ; index++ )     // then
        {                                                       //
            if ( intArray[ index ] % 2 == 0 )                   //  //  print even numbers
            {                                                   //  //
                System.out.print( intArray[ index ] + " " );    //  //
            }                                                   //  //
        }                                                       //

    }
}