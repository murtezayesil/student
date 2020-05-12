//     _   _                           _
//    | | | | __ _ _ __ ___  _ __ ___ (_)_ __   __ _
//    | |_| |/ _` | '_ ` _ \| '_ ` _ \| | '_ \ / _` |
//    |  _  | (_| | | | | | | | | | | | | | | | (_| |
//    |_| |_|\__,_|_| |_| |_|_| |_| |_|_|_| |_|\__, |
//                                             |___/


/* Instructions: ********************************************************
 *                                                                      *
 *  Calculate the Hamming Distance between two DNA strands.             *
 *                                                                      *
 *  Your body is made up of cells that contain DNA. Those cells         *
 *   regularly wear out and need replacing, which they achieve by       *
 *   dividing into daughter cells. In fact, the average human body      *
 *   experiences about 10 quadrillion cell divisions in a lifetime!     *
 *   When cells divide, their DNA replicates too. Sometimes during      *
 *   this process mistakes happen and single pieces of DNA get          *
 *   encoded with the incorrect information. If we compare two          *
 *   strands of DNA and count the differences between them we can       *
 *   see how many mistakes occurred. This is known as the               *
 *   "Hamming Distance".                                                *
 *                                                                      *
 *  We read DNA using the letters C,A,G and T.                          *
 *  Two strands might look like this:                                   *
 *   GAGCCTACTAACGGGAT                                                  *
 *   CATCGTAATGACGGCCT                                                  *
 *   ^ ^ ^  ^ ^    ^^                                                   *
 *   They have 7 differences, and therefore the Hamming Distance is 7.  *
 *                                                                      *
 *  The Hamming Distance is useful for lots of things in science,       *
 *  not just biology, so it's a nice phrase to be familiar with :)      *
 *                                                                      *
 *  Implementation notes:                                               *
 *  The Hamming distance is only defined for sequences of equal         *
 *    length, so an attempt to calculate it between sequences of        *
 *    different lengths should not work. The general handling of this   *
 *    situation (e.g., raising an exception vs returning a special      *
 *    value) may differ between languages.                              *
 *                                                                      *
 ************************************************************************/



class Hamming
{
    String leftStrand;
    String rightStrand;

    Hamming(String leftStrand, String rightStrand)
    {
        this.leftStrand = leftStrand;
        this.rightStrand = rightStrand;

        if ( leftStrand.length() != rightStrand.length() )
        {
            throw new IllegalArgumentException( "leftStrand and rightStrand must be of equal length." );
        }
    }

    int getHammingDistance()
    {
        int hammingNumber = 0;

        for ( int index = 0 ; index < leftStrand.length() ; index++ )
        {
            if ( leftStrand.charAt( index ) != rightStrand.charAt( index ) )
            {
                hammingNumber++;
            }
        }

        return hammingNumber;
    }
}