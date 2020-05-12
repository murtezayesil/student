class ArmstrongNumbers
{
    // implement the below function
    static boolean isArmstrongNumber( int input )
    {
        String inputAsString = Integer.toString( input );
        int significantFigures = inputAsString.length();
        int newNumber = 0;

        for ( char number : inputAsString.toCharArray() )
        {
            newNumber += Math.pow( number -48 , significantFigures );
        }

        if ( newNumber == input )
        {
            return true;
        }
        else
        {
            return false;
        }
    }

}