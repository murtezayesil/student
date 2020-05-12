
//                              #  m                             m    #
//    m     m  mmm    m mm   mmm#  #       mmm   m mm    mmmm  mm#mm  # mm    mmm
//    "m m m" #" "#   #"  " #" "#  #      #"  #  #"  #  #" "#    #    #"  #  #   "
//     #m#m#  #   #   #     #   #  #      #""""  #   #  #   #    #    #   #   """m
//      # #   "#m#"   #     "#m##  #mmmmm "#mm"  #   #  "#m"#    "mm  #   #  "mmm"
//                                                       m  #
//                                                        ""

/* Instructions: ********************************************************************************
 *                                                                                              *
 *   Write a method called wordLengths that accepts a string.                                   *
 *     Your method should count the number of letters in each word in the string,               *
 *     and output a result diagram of how many letters contain each word.                       *
 *     Use tabs before the asterisks so that they'll line up.                                   *
 *                                                                                              *
 *  You may assume that no word in the string is more than 80 characters in length              *
 *  and all words are space separated.                                                          *
 *                                                                                              *
 *  Input:                                                                                      *
 *    Write a method called wordLengths that accepts a string                                   *
 *  Output:                                                                                     *
 *    Three columns.                                                                            *
 *      The first column contains the order of word in the string (1, 2, 3, etc.)               *
 *      followed by a colon (:) and space.                                                      *
 *      The second column contains the length of the word described by an integer.              *
 *      The 2nd and 3rd columns are separated by single tab (6 spaces).                         *
 *      The third column contains histogram representing the length of the corresponding word.  *
 *                                                                                              *
 *  1: 5	*****                                                                               *
 *  2: 1	*                                                                                   *
 *  3: 6	******                                                                              *
 *  4: 6	******                                                                              *
 *  5: 11	***********                                                                         *
 *  6: 4	****                                                                                *
 *  7: 7	*******                                                                             *
 *  8: 1	*                                                                                   *
 *  9: 6	*****                                                                               *
 *                                                                                              *
 ************************************************************************************************/

import java.util.Scanner;

public class WordLengths
{
    public static void main(String[] args)
    {

        Scanner input = new Scanner( System.in );
        String sentence = input.nextLine();

        wordCount( sentence );

    }

    private static void wordCount( String sentence )
    {

        int spaceCount = 1;

        for ( int index = 0 ; index < sentence.length() ; index++ )
        {
            if ( sentence.charAt( index ) == ' ' )
            {
                spaceCount++;
            }
        }

        String[] words = new String[ spaceCount ];
        int wordsIndex = 0;

        for ( int index = 0 ; index < sentence.length() ; index++ )
        {
            if ( sentence.charAt( index ) != ' ' )
            {
                words[ wordsIndex ] += sentence.charAt( index );
            }
            else
            {
                wordsIndex++;
            }
        }

        for ( int index = 0 ; index < spaceCount ; index++ )                        // For every word in array words
        {                                                                           //
            System.out.print( (index+1) + ": "  );                                  //  // print it index ("1: ")
                                                                                    //
            System.out.print( words[ index ].length() - 4 );                        //  // print its word's length
                                                                                    //
            System.out.print( "\t" );                                               //  // leave a tab space
                                                                                    //
            for ( int length = 4 ; length < words[ index ].length() ; length++ )    //  // print as many asterisks as word length
            {                                                                       //  //
                System.out.print( "*" );                                            //  //
            }                                                                       //  //
                                                                                    //
            System.out.print( '\n' );                                               //  // and finally '\n' word next word
        }
    }
}
