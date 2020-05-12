class RnaTranscription
{
    String transcribe(String dnaStrand)
    {

        String rnaString = "";
        for ( char molecule : dnaStrand.toCharArray() )
        {
            if ( molecule == 'G' )
            {
                rnaString += 'C';
            }
            else if ( molecule == 'C' )
            {
                rnaString += 'G';
            }
            else if ( molecule == 'T' )
                {
                    rnaString += 'A';
                }
                else
                {
                    rnaString += 'U';
                }
        }

        return rnaString;
    }

}