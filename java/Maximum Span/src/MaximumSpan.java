/**   Instructions:
        Consider the leftmost and rightmost appearances of some value in an array. Span is the count of all the elements between two repeating elements including the repeated elements.

        The return type is an integer.

        A single value has a span of 1. Returns the largest span found in the given array.
        Sample Input / Output:
        1 2 1 1 3
        4
        Sample Input / Output:
        1 4 2 1 4 1 4
        6
        Sample Input / Output:
        1 2 3 4 1
        5
*/

/*
 *
 * Same Program with a challenge
 *
 * Input is single line and no array size is given
 *
 */

import java.util.ArrayList;
import java.util.Scanner;

public class MaximumSpan
{
    public static void main( String[] args )
    {

        Scanner input = new Scanner( System.in );

//        int arraySize = input.nextInt();                        // Learn arraySize
//        int[] numberArray = new int[ arraySize ];               //
//        for ( int index = 0 ; index < arraySize ; index++ )     //  // Learn arrayElements
//        {                                                       //  //
//            numberArray[index] = input.nextInt();               //  //
//        }                                                       //  //

        ArrayList<Integer> myArray = new ArrayList ();      // Learn myArray
        while ( input.isNextLine() )                        //
        {                                                   //
            myArray.add ( input.nextInt() );                //
        }                                                   //

        int[] numberArray = new int[ myArray.size() ];              // Create numberArray (int[]) and
        for ( int index = 0 ; index < myArray.size() ; index++ )    //  // Move myArray (ArrayList) elements
        {                                                           //  //  to numberArray
            numberArray[ index ] = myArray.get( index );            //  //
        }                                                           //  //

        int span = 1;

        for ( int index = 0 ; index < arraySize ; index++ )                                     // For all the elements in numberArray
        {                                                                                       //
            int reappearingNumberIndex = index ;                                                //
                                                                                                //
            for ( int innerIndex = index ; innerIndex < arraySize ; innerIndex++ )              //
            {                                                                                   //
                if ( numberArray[ reappearingNumberIndex ] == numberArray[ innerIndex ] )       //  // If element reappears
                {                                                                               //  //
                    if ( (innerIndex - reappearingNumberIndex) > span )                         //  //  // and if span between reappearing elements is larger than before
                    {                                                                           //  //  //
                        span = innerIndex - reappearingNumberIndex;                             //  //  //  // update span
                    }                                                                           //  //  //
                }                                                                               //  //
            }                                                                                   //
        }                                                                                       //

        System.out.print( span + 1 );

    }
}
