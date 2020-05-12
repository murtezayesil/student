/*
 *  Write a program that takes input 10 integer numbers and stores in an array.
 *  Afterwards, count the series of 2 or more adjacent elements in an array and output that number.
 *
 */
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);

        try
        {
            int[] numberArray = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
            for (int index = 0; index < 10; index++) {
                numberArray[index] = input.nextInt();
            }



            int numberGroups = 0;
            boolean isCounted = false;
            for ( int index = 0 ; index < 9 ; index++ )
            {

                if ( numberArray[ index ] == numberArray[ index + 1 ] )
                {
                    if ( !isCounted )
                    {
                        numberGroups++;
                        isCounted = true;
                    }
                }
                else
                {
                    isCounted = false;
                }
            }

            System.out.print( numberGroups );

        }
        catch ( InputMismatchException expection )
        {

            {

            }
            else
            {
                System.out.print("Error");
            }
        }
        catch ( NoSuchElementException exception )
        {
            System.out.print( "error" );
        }

    }
}