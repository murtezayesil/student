public class PangramChecker
{

    public boolean isPangram(String input)
    {
        char[] pangram = { 'q' , 'w' , 'e' , 'r' , 't' , 'y' , 'u' , 'i' , 'o' , 'p' , 'a' , 's' , 'd' , 'f' , 'g' , 'h' , 'j' , 'k' , 'l' , 'z' , 'x' , 'c' , 'v' , 'b' , 'n' , 'm' };
        boolean[] isUsed = new boolean[26] ;
        char[] inputString = input.toCharArray();
        String lowerCaseInput = "";

        for ( char letter : inputString )
        {
            lowerCaseInput += Character.toLowerCase( letter );
        }

        for ( char currentChar : lowerCaseInput.toCharArray() )
        {
            for ( int index = 0 ; index < 26 ; index++ )
            {
                if ( currentChar == pangram[index] )
                {
                    isUsed[index] = true;
                }
            }
        }

        int manyCharsUsed = 0;
        for ( boolean isTrue : isUsed )
        {
            if ( isTrue )
            {
                manyCharsUsed++;
            }
        }

        if ( manyCharsUsed == 26 )
        {
            return true;
        }
        else
        {
            return false;
        }
    }

}
