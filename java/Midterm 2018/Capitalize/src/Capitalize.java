
//     mmmm                  "      m           ""#      "
//    m"  "m  mmm   mmmm   mmm    mm#mm   mmm     #    mmm    mmmmm   mmm
//    #    # "   #  #" "#    #      #    "   #    #      #       m"  #"  #
//    #    # m"""#  #   #    #      #    m"""#    #      #     m"    #""""
//     #mm#" "mm"#  ##m#"  mm#mm    "mm  "mm"#    "mm  mm#mm  #mmmm  "#mm"
//        #         #
//                  "

 /* Instructions: ***********************************************************************
 *                                                                                      *
 *   Write a Java program to capitalize the first letter of each word in a sentence.    *
 *                                                                                      *
 *   Input:                                                                             *
 *     the quick brown fox jumps over the lazy dog.                                     *
 *   Output:                                                                            *
 *     The Quick Brown Fox Jumps Over The Lazy Dog.                                     *
 *                                                                                      *
 *   Note: Be aware of spaces in the beginning and end of the input.                    *
 *                                                                                      *
 ***************************************************************************************/

import java.util.Scanner;

public class Capitalize
{
    public static void main(String[] args)
    {

        Scanner input   = new Scanner( System.in );
        String sentence = input.nextLine();
        int sentenceLength = sentence.length();
        char[] sentenceArray = sentence.toCharArray() ;

        sentenceArray[ 0 ] = capitalize( sentenceArray[ 0 ] );
        for ( int index = 0 ; index < sentenceLength - 1 ; index++ )
        {
            if ( sentenceArray[ index ] == ' ' )
            {
                sentenceArray[ index + 1 ] = capitalize(sentenceArray[ index + 1 ]);
            }
        }

        sentence = "";
        for ( int index = 0; index < sentenceLength ; index++ )
        {
            sentence = sentence + sentenceArray[index];
        }

        System.out.print( sentence );

    }

    private static char capitalize( char letter )
    {
        char[] lowercase = { 'q' , 'w' , 'e' , 'r' , 't' , 'y' , 'u' , 'i' , 'o' , 'p' , 'a' , 's' , 'd' , 'f' , 'g' , 'h' , 'j' , 'k' , 'l' , 'z' , 'x' , 'c' , 'v' , 'b' , 'n' , 'm'};
        char[] uppercase = { 'Q' , 'W' , 'E' , 'R' , 'T' , 'Y' , 'U' , 'I' , 'O' , 'P' , 'A' , 'S' , 'D' , 'F' , 'G' , 'H' , 'J' , 'K' , 'L' , 'Z' , 'X' , 'C' , 'V' , 'B' , 'N' , 'M'};

        int foundAt = -1;

        for ( int letterIndex = 0 ; letterIndex < lowercase.length ; letterIndex++ )
        {
            if ( letter == lowercase[ letterIndex ] )
            {
                foundAt = letterIndex;
            }
        }

        if ( foundAt >= 0 )
        {
            return uppercase[foundAt];
        }
        else
        {
            return letter;
        }
    }
}
