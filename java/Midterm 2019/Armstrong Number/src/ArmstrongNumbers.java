//        _                       _
//       / \   _ __ _ __ ___  ___| |_ _ __ ___  _ __   __ _
//      / _ \ | '__| '_ ` _ \/ __| __| '__/ _ \| '_ \ / _` |
//     / ___ \| |  | | | | | \__ \ |_| | | (_) | | | | (_| |
//    /_/   \_\_|  |_| |_| |_|___/\__|_|  \___/|_| |_|\__, |
//                                                    |___/
//     _   _                 _
//    | \ | |_   _ _ __ ___ | |__   ___ _ __
//    |  \| | | | | '_ ` _ \| '_ \ / _ \ '__|
//    | |\  | |_| | | | | | | |_) |  __/ |
//    |_| \_|\__,_|_| |_| |_|_.__/ \___|_|
//

/* Instructions: ****************************************************************************
 *                                                                                          *
 *  An Armstrong number is a number that is the sum of its own digits each raised to the    *
 *  power of the number of digits.                                                          *
 *                                                                                          *
 *  For example:                                                                            *
 *                                                                                          *
 *  9 is an Armstrong number, because 9 = 9^1 = 9                                           *
 *  10 is not an Armstrong number, because 10 != 1^2 + 0^2 = 1                              *
 *  153 is an Armstrong number, because: 153 = 1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153         *
 *  154 is not an Armstrong number, because: 154 != 1^3 + 5^3 + 4^3 = 1 + 125 + 64 = 190    *
 *  Write some code to determine whether a number is an Armstrong number.                   *
 *                                                                                          *
 ********************************************************************************************/

import java.util.Scanner;

public class ArmstrongNumbers
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner( System.in );
        int number = input.nextInt();
        System.out.print( isArmstrongNumber( number ) );
    }

    private static boolean isArmstrongNumber( int number )
    {

        String numberAsString = Integer.toString( number );                 // Turn number to String
        int[] numberAsArray = new int[ numberAsString.length() ];           //  // then
        for ( int index = 0 ; index < numberAsArray.length ; index++ )      //  //  turn String to int[]
        {                                                                   //  //
            numberAsArray[index] = numberAsString.charAt( index ) - 48 ;    //  // fix ASCII displacement ( 0 character is 48th ASCII character, so numbers are displaced by 48 )
        }                                                                   //  //  // As a result number is broken into array ex. 153 became [ 1, 5, 3]
        boolean isArmstrongNumber = false;
        int newNumber = 0;

        for ( int index : numberAsArray )                                   //  Foreach int in numberArray
        {                                                                   // calculate
            newNumber += Math.pow( index , numberAsArray.length );          //  ...
        }                                                                   //

        if ( newNumber == number )
        {
            isArmstrongNumber = true;
        }

        return isArmstrongNumber;

    }
}
