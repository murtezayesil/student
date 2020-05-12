//    Write a Java program to merge two given sorted array of integers and create a new sorted array.
//            Input: N (size of array1), array1, M (size of array2), array2. 1 ≤ N, M ≤ 100.
//            Output: New array of size N + M.
//
//            Input:
//            4
//            1 2 3 4
//            4
//            2 5 7 8
//            Output:
//            1 2 2 3 4 5 7 8

import java.util.Arrays;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {

        Scanner input   = new Scanner( System.in );

        int array1Size  = input.nextInt();                      // array1
        int[] array1    = new int[ array1Size ];                //
        for ( int index = 0 ; index < array1Size ; index++ )    //
        {                                                       //
            array1[ index ] = input.nextInt();                  //
        }                                                       //

        int array2Size  = input.nextInt();                      // array2
        int[] array2    = new int[ array2Size ];                //
        for ( int index = 0 ; index < array2Size ; index++ )    //
        {                                                       //
            array2[ index ] = input.nextInt();                  //
        }                                                       //

        int[] bigArray = new int[ array1Size + array2Size ];    // bigArray
        for ( int index = 0 ; index < array1Size ; index++ )    //
        {                                                       //
            bigArray[ index ] = array1[ index ] ;               //
        }                                                       //
        for ( int index = 0 ; index < array2Size ; index++ )    //
        {                                                       //
            bigArray[ index + array1Size ] = array2[ index ];   //
        }                                                       //

        Arrays.sort( bigArray );

        for ( int index = 0 ; index < array1Size + array2Size ; index++ )
        {
            System.out.print( bigArray[ index ] + " " );
        }
    }
}
