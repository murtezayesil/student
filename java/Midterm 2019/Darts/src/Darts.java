//     ______          ____             _             __
//     \ \ \ \        |  _ \  __ _ _ __| |_ ___       \ \
//      \ \ \ \_____  | | | |/ _` | '__| __/ __|  _____\ \
//      / / / /_____| | |_| | (_| | |  | |_\__ \ |_____/ /
//     /_/_/_/        |____/ \__,_|_|   \__|___/      /_/
//

/* * Instructions: **********************************************************************************************
 *                                                                                                              *
 *   Write a function score that returns the earned points in a single toss of a Darts game.                    *
 *                                                                                                              *
 *   Darts is a game where players throw darts to a target.                                                     *
 *                                                                                                              *
 *   In our particular instance of the game, the target rewards with 4 different amounts of points,             *
 *    depending on where the dart lands:                                                                        *
 *     If the dart lands outside the target, the player earns no points (0 points).                             *
 *     If the dart lands in the outer circle of the target, the player earns 1 point.                           *
 *     If the dart lands in the middle circle of the target, the player earns 5 points.                         *
 *     If the dart lands in the inner circle of the target, the player earns 10 points.                         *
 *                                                                                                              *
 *   The outer circle has a radius of 10 units (This is equivalent to the total radius for the entire target)   *
 *    , the middle-circle a radius of 5 units, and the inner circle a radius of 1. Of course, they are all      *
 *    central to the same point (That is, the circles are concentric) defined by the coordinates (0, 0).        *
 *                                                                                                              *
 *   Write a function that given a point in the target (defined by its real cartesian coordinates x and y)      *
 *    , returns the correct amount earned by a dart landing in that point.                                      *
 *                                                                                                              *
 ****************************************************************************************************************/

import java.util.Scanner;

public class Darts
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner( System.in );
        int xCoordinate = input.nextInt();
        int yCoordinate = input.nextInt();

        int point = score( xCoordinate, yCoordinate );

        System.out.print( point );
    }

    private static int score( int x, int y)
    {
        double distance = Math.sqrt( ( Math.pow( x , 2 ) + Math.pow( y , 2 ) ) );

        if ( distance >= 10 )
        {
            return 0;
        }
        else if ( distance >= 5 )
        {
            return 1;
        }
        else if ( distance >= 1)
        {
            return 5;
        }
        else
        {
            return 10;
        }
    }
}
