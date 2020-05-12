//        _
//       / \   ___ _ __ ___  _ __  _   _ _ __ ___
//      / _ \ / __| '__/ _ \| '_ \| | | | '_ ` _ \
//     / ___ \ (__| | | (_) | | | | |_| | | | | | |
//    /_/   \_\___|_|  \___/|_| |_|\__, |_| |_| |_|
//                                 |___/

/* Instructions: ********************************************************************************************************************
 *                                                                                                                                  *
 *   Convert a phrase to its acronym.                                                                                               *
 *                                                                                                                                  *
 *   Techies love their -> TLA (Three Letter Acronyms)!                                                                             *
 *   Help generate some jargon by writing a program that converts a long name like Portable Network Graphics to its acronym (PNG).  *
 *                                                                                                                                  *
 ************************************************************************************************************************************/

class Acronym
{

    String phrase ;
    Acronym(String phrase)
    {
        this.phrase = phrase;
    }

    String get()
    {
        String acronym = "" + Character.toUpperCase( phrase.charAt( 0 ) );

        for ( int index = 0 ; index < phrase.length() ; index++ )
        {
            if ( phrase.charAt( index ) == ' ' || phrase.charAt( index ) == '-' || phrase.charAt( index ) == '_' )
            {
                if ( Character.isLetter( phrase.charAt( index+1 ) ) )
                {
                    acronym += Character.toUpperCase( phrase.charAt( index + 1 ) );
                }
            }
        }

        return acronym;
    }

}