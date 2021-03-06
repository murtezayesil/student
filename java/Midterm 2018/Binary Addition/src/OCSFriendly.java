
//    mmmmm    "                                         mm       #      #    "     m      "
//    #    # mmm    m mm    mmm    m mm  m   m           ##    mmm#   mmm#  mmm   mm#mm  mmm     mmm   m mm
//    #mmmm"   #    #"  #  "   #   #"  " "m m"          #  #  #" "#  #" "#    #     #      #    #" "#  #"  #
//    #    #   #    #   #  m"""#   #      #m#           #mm#  #   #  #   #    #     #      #    #   #  #   #
//    #mmmm" mm#mm  #   #  "mm"#   #      "#           #    # "#m##  "#m##  mm#mm   "mm  mm#mm  "#m#"  #   #
//                                        m"
//                                       ""

/* Instructions: ************************************************
 *                                                              *
 *   Write a Java program to add two binary numbers.            *
 *   Assume that the maximum length of a binary number is 8.    *
 *                                                              *
 *   Input:                                                     *
 *     Input first binary number: 10                            *
 *     Input second binary number: 11                           *
 *   Output:                                                    *
 *     Sum of two binary numbers: 101                           *
 *                                                              *
 ****************************************************************/

// Resources: https://stackoverflow.com/questions/8548586/adding-binary-numbers

import java.util.Scanner;

public class OCSFriendly
{

    public static void main(String[] args)
    {

        Scanner input = new Scanner( System.in );

        System.out.print( "Input first binary number: " );
        int number1 = input.nextInt();
        System.out.print( "Input second binary number: " );
        int number2 = input.nextInt();

        int binary1 = Integer.parseInt( Integer.toString( number1 ) , 2 );
        int binary2 = Integer.parseInt( Integer.toString( number2 ) , 2 );

        int sum = binary1 + binary2;
        System.out.print( "Sum of two binary numbers: " + Integer.toBinaryString( sum ) );

    }

}
