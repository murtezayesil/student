import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

    // learn Queen locations
        int[] queenLocations = new int[8];
        for (int index = 0 ; index < 8 ; index++ )
        {
            queenLocations[index] = input.nextInt();
        }

    // Print board
        for ( int rowIndex = 0 ; rowIndex < 8 ; rowIndex++ )
        {
            int colomnIndex = 0;
            while ( colomnIndex != queenLocations[rowIndex] )
            {
                System.out.print("|_");
                colomnIndex++;
            }
            System.out.print("|Q|");
            colomnIndex++;
            while ( colomnIndex < 8 )
            {
                System.out.print("_|");
                colomnIndex++;
            }
            System.out.print("\n");
        }
    }
}
