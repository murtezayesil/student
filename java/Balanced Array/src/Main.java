import java.util.InputMismatchException;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);
        int[] numberArray = new int[10];

        try
        {
            for ( int index = 0 ; index < 10 ; index++ )
            {
                numberArray[index] = input.nextInt();
            }


            int leftPointer     = 0;
            int rightPointer    = 9;

            while ( leftPointer < rightPointer - 1 )
            {
                if ( numberArray[leftPointer] < numberArray[rightPointer] )
                {
                    numberArray[leftPointer + 1] = numberArray[leftPointer] + numberArray[leftPointer + 1];
                    leftPointer++;
                }
                else
                {
                    numberArray[rightPointer - 1] = numberArray[rightPointer] + numberArray[rightPointer - 1];
                    rightPointer--;
                }
            }

            if ( numberArray[leftPointer] == numberArray[rightPointer] )
            {
                System.out.print( "Can be balanced" );
            }
            else
            {
                System.out.print( "Can not be balanced" );
            }

        }
        catch(InputMismatchException exception)
        {
            System.out.print("Error");
        }

    }

}
