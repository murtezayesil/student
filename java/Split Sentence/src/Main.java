
//      mmmm         ""#      "      m            mmmm                  m
//     #"   " mmmm     #    mmm    mm#mm         #"   "  mmm   m mm   mm#mm   mmm  m mm    mmm    mmm
//     "#mmm  #" "#    #      #      #           "#mmm  #"  #  #"  #    #    #"  # #"  #  #"  "  #"  #
//         "# #   #    #      #      #               "# #""""  #   #    #    #"""" #   #  #      #""""
//     "mmm#" ##m#"    "mm  mm#mm    "mm         "mmm#" "#mm"  #   #    "mm  "#mm" #   #  "#mm"  "#mm"
//            #
//            "

/* Instructions: ********************************************************************
 *                                                                                  *
 *  Write a program that reads one line of input text and breaks it up into words.  *
 *   The words should be output one per line.                                       *
 *   A word is defined to be a sequence of letters.                                 *
 *   Any characters in the input that are not letters should be discarded.          *
 *                                                                                  *
 *  Input:                                                                          *
 *  He said, "That's not a good idea."                                              *
 *                                                                                  *
 *  Output:                                                                         *
 *  He                                                                              *
 *  said                                                                            *
 *  Thats                                                                           *
 *  not                                                                             *
 *  a                                                                               *
 *  good                                                                            *
 *  idea                                                                            *
 *                                                                                  *
 ************************************************************************************/

import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner( System.in );

        String sentence = input.nextLine();
        ArrayList< String > words = new ArrayList<>(  );

        words.add( "" );

        for ( char currentChar : sentence.toCharArray() )
        {
            if ( currentChar == ' ' )
            {
                words.add( "" );
            }
            else if ( currentChar == ',' || currentChar == '.' || currentChar == '\'' || currentChar == '\"' || currentChar == '?' || currentChar == '!' )
            {
                continue;
            }
            else
            {
                words.set( words.size()-1 , words.get( words.size()-1 ) + currentChar );
            }
        }

        for ( String currentWord : words )
        {
            System.out.print( currentWord + '\n' );
        }
    }
}
