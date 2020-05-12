//    d8b          888b     d888                   d8b           .d8888b.
//    Y8P          8888b   d8888                   Y8P          d88P  Y88b
//                 88888b.d88888                                Y88b.
//    888 .d8888b  888Y88888P888  8888b.   .d88b.  888  .d8888b  "Y888b.    .d88888 888  888  8888b.  888d888  .d88b.
//    888 88K      888 Y888P 888     "88b d88P"88b 888 d88P"        "Y88b. d88" 888 888  888     "88b 888P"   d8P  Y8b
//    888 "Y8888b. 888  Y8P  888 .d888888 888  888 888 888            "888 888  888 888  888 .d888888 888     88888888
//    888      X88 888   "   888 888  888 Y88b 888 888 Y88b.    Y88b  d88P Y88b 888 Y88b 888 888  888 888     Y8b.
//    888  88888P' 888       888 "Y888888  "Y88888 888  "Y8888P  "Y8888P"   "Y88888  "Y88888 "Y888888 888      "Y8888
//                                             888                              888
//                                        Y8b d88P                              888
//                                         "Y88P"                               888

/*  Instructions:  *********************************************************************************************************
 *                                                                                                                          *
 *   Write a method called isMagicSquare that accepts a two-dimensional array of integers as a parameter and returns true   *
 *      if it is a magic square. A square matrix is a magic square if it is square in shape                                 *
 *      (same number of rows as columns, and every row the same length),                                                    *
 *      and all of its row, column, and diagonal sums are equal.                                                            *
 *      For example, [[2, 7, 6], [9, 5, 1], [4, 3, 8]]                                                                      *
 *      is a magic square because all eight of the sums are exactly 15                                                      *
 *      (2 + 7 + 6 = 15, 9 + 5 + 1 = 15, 4 + 3 + 8 = 15).                                                                   *
 *                                                                                                                          *
 *   Input details: The first line contains two integers N, M                                                               *
 *      (dimensions of a two-dimensional array) where 1 ≤ N ≤ M ≤ 15.                                                       *
 *      Then comes the array itself.                                                                                        *
 *                                                                                                                          *
 *   Input:                                                                                                                 *
 *   3 3                                                                                                                    *
 *   2 7 6                                                                                                                  *
 *   9 5 1                                                                                                                  *
 *   4 3 8                                                                                                                  *
 *   Output:                                                                                                                *
 *   true                                                                                                                   *
 *                                                                                                                          *
 ***************************************************************************************************************************/

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {

        Scanner input = new Scanner( System.in );

        int matrixRows = input.nextInt();
        int matrixColumns = input.nextInt();
        int[][] matrix = new int[ matrixRows ][ matrixColumns ];

        for ( int rowIndex = 0 ; rowIndex < matrixRows ; rowIndex++ )                   // Read matrix
        {                                                                               //
            for ( int columnIndex = 0 ; columnIndex < matrixColumns ; columnIndex++ )   //
            {                                                                           //
                matrix[ rowIndex ][ columnIndex ] = input.nextInt();                    //
            }                                                                           //
        }                                                                               //

//        for ( int rowIndex = 0 ; rowIndex < matrixRows ; rowIndex++ )                   // TODO DEBUG
//        {                                                                               //    Visualizes matrix as in Example above
//            for ( int columnIndex = 0 ; columnIndex < matrixColumns ; columnIndex++ )   //
//            {                                                                           //
//                System.out.print( "|" );                                                //
//                System.out.print( matrix[ rowIndex ][ columnIndex ] );                  //
//            }                                                                           //
//            System.out.print( "|" );                                                    //
//            System.out.print( "\n" );                                                   //
//        }                                                                               //

        boolean isMagicMatrix = isMagicSquare( matrixRows, matrixColumns, matrix );

        System.out.print( isMagicMatrix );

    }

    private static boolean isMagicSquare ( int rows, int columns, int[][] matrix )
    {
        boolean isMagicSquareSoFar = true;

        if ( rows == columns )
        {
            System.out.print( "DEBUG: Matrix is square\n" );

            int[] rowSum = new int[ rows ];
            int[] columnSum = new int[ columns ];
            int diagonalSum1 = 0;
            int diagonalSum2 = 0;

            for ( int rowIndex = 0; rowIndex < rows; rowIndex++ )                           // Calculate sum for rows
            {                                                                               //
                for ( int columnIndex = 0; columnIndex < columns; columnIndex++ )           //
                {                                                                           //
                    rowSum[rowIndex] = rowSum[rowIndex] + matrix[rowIndex][columnIndex];    //
                }                                                                           //
            }                                                                               //

            for ( int columnIndex = 0; columnIndex < columns; columnIndex++ )       // Calculate sum for columns
            {                                                                       //
                for ( int rowIndex = 0; rowIndex < columns; rowIndex++ )            //
                {                                                                   //
                    columnSum[columnIndex] += matrix[rowIndex][columnIndex];        //
                }                                                                   //
            }                                                                       //

            for ( int rowIndex = 0; rowIndex < rows; rowIndex++ )                   // Calculate sum for diagonals
            {                                                                       //
                diagonalSum1 += matrix[ rowIndex ][ rowIndex ];                     //
                diagonalSum2 += matrix[ (columns-1) - rowIndex ][ columns - 1 ];    //
            }                                                                       //

//    /* TODO DEBUG: Displays calculation results */
//                for ( int rowIndex = 0; rowIndex < rows; rowIndex++ )                           // Display sum for rows
//                {                                                                               //
//                    for ( int columnIndex = 0; columnIndex < columns; columnIndex++ )           //
//                    {                                                                           //
//                        System.out.print( rowSum[rowIndex] + " " );                             //
//                    }                                                                           //
//                }
//                System.out.print( "\n" );
//                for ( int columnIndex = 0; columnIndex < columns; columnIndex++ )       // Calculate sum for columns
//                {                                                                       //
//                    for ( int rowIndex = 0; rowIndex < columns; rowIndex++ )            //
//                    {                                                                   //
//                        System.out.print( columnSum[columnIndex] + " " );               //
//                    }                                                                   //
//                }
//                System.out.print( "\n" );
//                System.out.print( "diagonalSum1 " + diagonalSum1 + "\n" );
//                System.out.print( "diagonalSum2 " + diagonalSum2 + "\n" );
//    /* END OF DEBUG */

            for ( int rowIndex = 0 ; rowIndex < rows-1 ; rowIndex++ )
            {
                if ( rowSum[ rowIndex ] != rowSum[ rowIndex + 1 ] )
                {
                    isMagicSquareSoFar = false;
                }
            }

            for ( int columnIndex = 0 ; columnIndex < columns - 1 ; columnIndex++ )
            {
                if ( columnSum[ columnIndex ] != columnSum[ columnIndex + 1 ] )
                {
                    isMagicSquareSoFar = false;
                }
            }

            if ( rowSum[0] != columnSum[0] || columnSum[0] != diagonalSum1 ||  diagonalSum1 != diagonalSum2 )
            {
                isMagicSquareSoFar = false;
            }

        }
        else
        {
            isMagicSquareSoFar = false;
        }

        return isMagicSquareSoFar;

    }
}
