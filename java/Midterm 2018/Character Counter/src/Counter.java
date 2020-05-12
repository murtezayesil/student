
//       mmm  #                                    m                           mmm                         m
//     m"   " # mm    mmm    m mm   mmm    mmm   mm#mm   mmm    m mm         m"   "  mmm   m   m  m mm   mm#mm   mmm    m mm
//     #      #"  #  "   #   #"  " "   #  #"  "    #    #"  #   #"  "        #      #" "#  #   #  #"  #    #    #"  #   #"  "
//     #      #   #  m"""#   #     m"""#  #        #    #""""   #            #      #   #  #   #  #   #    #    #""""   #
//      "mmm" #   #  "mm"#   #     "mm"#  "#mm"    "mm  "#mm"   #             "mmm" "#m#"  "mm"#  #   #    "mm  "#mm"   #

/* Instructions: *******************************************************************************************
 *                                                                                                          *
 *   Write a Java program to count the letters, spaces, numbers and other characters of an input string.    *
 *                                                                                                          *
 *   Input:                                                                                                 *
 *     The string is : Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33                                     *
 *   Output:                                                                                                *
 *     letter: 34                                                                                           *
 *     space: 14                                                                                            *
 *     number: 10                                                                                           *
 *     other: 7                                                                                             *
 *                                                                                                          *
 ***********************************************************************************************************/

import java.util.Scanner;

public class Counter
{
    public static void main(String[] args)
    {

        Scanner input = new Scanner( System.in );

        String sentence = input.nextLine();
        int letterCount = 0;
        int numberCount = 0;
        int spaceCount  = 0;
        int otherCount  = 0;

        for ( int index = 0 ; index < sentence.length() ; index++ )
        {
            int charCode = getCharCode( sentence, index );       // 0 = letter, 1 = number, 2 = space, 3 = other

            switch ( charCode )
            {
                case 0 : letterCount++;
                         break;
                case 1 : numberCount++;
                         break;
                case 2 : spaceCount++;
                         break;
                case 3 : otherCount++;
                         break;
                default : System.exit( 1 );
            }
        }

        System.out.print( "letter: " + letterCount + "\n");
        System.out.print( "space: " + spaceCount + "\n" );
        System.out.print( "number: " + numberCount + "\n" );
        System.out.print( "other: " + otherCount + "\n" );

    }

    private static int getCharCode( String sentence, int index )
    {
        char[] lowercase = { 'q' , 'w' , 'e' , 'r' , 't' , 'y' , 'u' , 'i' , 'o' , 'p' , 'a' , 's' , 'd' , 'f' , 'g' , 'h' , 'j' , 'k' , 'l' , 'z' , 'x' , 'c' , 'v' , 'b' , 'n' , 'm' };
        char[] uppercase = { 'Q' , 'W' , 'E' , 'R' , 'T' , 'Y' , 'U' , 'I' , 'O' , 'P' , 'A' , 'S' , 'D' , 'F' , 'G' , 'H' , 'J' , 'K' , 'L' , 'Z' , 'X' , 'C' , 'V' , 'B' , 'N' , 'M' };
        char[] number    = { '0' , '1' , '2' , '3' , '4' , '5' , '6' , '7' , '8' , '9' };

        for ( int arrayIndex = 0 ; arrayIndex < lowercase.length ; arrayIndex++ )
        {
            if ( sentence.charAt( index ) == ' ' )
            {
                return 2;
            }

            if ( sentence.charAt( index ) == lowercase[ arrayIndex ] )
            {
                return 0;
            }

            if ( sentence.charAt( index ) == uppercase[ arrayIndex ] )
            {
                return 0;
            }

            if ( arrayIndex < 10 )
            {
                if ( sentence.charAt( index ) == number[arrayIndex] )
                {
                    return 1;
                }
            }
        }

        return 3;
    }
}
