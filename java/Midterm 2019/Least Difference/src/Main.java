/* Instructions:
 *
    Find the least difference between any two elements of an integer array.
    The first line contains N (1 \le T \le 201000), the size of the array.
    The second line contains the N integers.
    Output must be a single integer.
    Input:
    8
    64 57 2 78 43 73 53 86
    Output:
    4
                                                                               */

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner( System.in );
        int arraySize = input.nextInt();
        int[] numbers = new int[ arraySize ];
        for ( int index = 0 ; index < arraySize ; index++ )
        {
            numbers[ index ] = input.nextInt();
        }
        int leastDifference = 1000 ;

        for ( int index = 0 ; index < arraySize ; index++ )
        {
            for ( int innerIndex = 0 ; innerIndex < arraySize ; innerIndex++ )
            {

                if ( innerIndex == index )
                {
                    continue;
                }

                if ( Math.abs( numbers[ index ] - numbers[ innerIndex ] ) < leastDifference )
                {
                    leastDifference = Math.abs( numbers[ index ] - numbers[ innerIndex ] );
                }

            }
        }

        System.out.print( leastDifference );
    }
}
