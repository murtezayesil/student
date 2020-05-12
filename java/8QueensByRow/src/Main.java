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

        for ( int rowIndex = 0 ; rowIndex < 8 ; rowIndex++ )        // For each row
        {                                                           //
            int colomnIndex = 0;                                    //
            while ( colomnIndex < queenLocations[rowIndex] )        //  // Print "|_"
            {                                                       //  //
                System.out.print("|_");                             //  //
                colomnIndex++;                                      //  //
            }                                                       //  //
                                                                    //      until
            System.out.print("|Q|");                                //  // Queen "|Q|"
            colomnIndex++;                                          //  //
                                                                    //      then
            while ( colomnIndex < 8 )                               //  // fill with "_|"
            {                                                       //  //  until row is 8 tile long
                System.out.print("_|");                             //  //
                colomnIndex++;                                      //  //
            }                                                       //  //
            System.out.print("\n");                                 //      then continue next line
        }
    }
}
