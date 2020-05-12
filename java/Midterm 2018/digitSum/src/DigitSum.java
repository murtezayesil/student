
//         #    "             "      m     mmmm
//      mmm#  mmm     mmmm  mmm    mm#mm  #"   " m   m  mmmmm
//     #" "#    #    #" "#    #      #    "#mmm  #   #  # # #
//     #   #    #    #   #    #      #        "# #   #  # # #
//     "#m##  mm#mm  "#m"#  mm#mm    "mm  "mmm#" "mm"#  # # #
//                    m  #
//                     ""

/* Instructions: *********************************************************************************************
*    Write a method named digitSum that accepts an integer as a parameter                                    *
*      and returns the sum of the digits of that number.                                                     *
*      For example, digitSum(29107) returns 2+9+1+0+7 or 19.                                                 *
*      For negative numbers, return the same value that would result if the number were positive.            *
*      For example, digitSum(-456) returns 4+5+6 or 15. Assume that maximum length of an input number is 10. *
*      In case of wrong input, you must print out text "error".                                              *
*                                                                                                            *
*    Input:                                                                                                  *
*    25                                                                                                      *
*    Output:                                                                                                 *
*    7                                                                                                       *
*************************************************************************************************************/

import java.util.InputMismatchException;
import java.util.Scanner;

public class DigitSum
{
    public static void main(String[] args)
    {

        Scanner input = new Scanner( System.in );
        long userNumber = 0;

        try
        {
            userNumber = input.nextLong();
        }
        catch ( InputMismatchException exception )
        {
            giveError();
            System.exit( 0 );
        }

        int sum = digitSum( userNumber );

        if ( sum >= 0 )
        {
            System.out.print( sum );
        }
        else
        {
            giveError();
        }

    }

    private static int digitSum( long number )
    {
        number = Math.abs( number );
        int length = String.valueOf( number ).length();
        int sum = 0;

        if ( length > 10 )
        {
            return -1;
        }

        while ( number > 0 )
        {
            sum     += number % 10;
            number  /= 10;
        }

        return sum;
    }

    private static void giveError()
    {
        System.out.print( "error" );
    }
}
