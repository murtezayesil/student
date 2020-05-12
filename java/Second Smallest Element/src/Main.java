import java.util.Arrays;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

    //  Learn array size
        int arraySize;
        System.out.print("Enter N: ");
        arraySize = input.nextInt();

    //  Create array with learned size
        double[] doubleArray = new double[arraySize];
        for ( int index = 0 ; index < arraySize ; index++ )
        {
            doubleArray[index] = input.nextDouble();
        }

    //  Sort array
        Arrays.sort(doubleArray);

    //  Print 2nd element
        System.out.print( doubleArray[1] );
    }
}
