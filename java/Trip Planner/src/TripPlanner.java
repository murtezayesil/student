//     _____     _         ____  _
//    |_   _| __(_)_ __   |  _ \| | __ _ _ __  _ __   ___ _ __
//      | || '__| | '_ \  | |_) | |/ _` | '_ \| '_ \ / _ \ '__|
//      | || |  | | |_) | |  __/| | (_| | | | | | | |  __/ |
//      |_||_|  |_| .__/  |_|   |_|\__,_|_| |_|_| |_|\___|_|
//                |_|

/* Instructions *********************************************************************
 *                                                                                  *                                                                                 *
 *  def greetingPerson():                                                           *
 *      ''' None -> None                                                            *
 *      First you’ll want to greet your user and ask them their name.               *
 *      Once you have their name use it to greet your user, and then ask them       *
 *      where they would like to go. Finally tell you user their destination        *
 *      sounds like a great trip! All the code to accomplish Part 1 should be       *
 *      in its own method.                                                          *
 *      '''                                                                         *
 *      # write your code here                                                      *
 *                                                                                  *
 *  Sample output:                                                                  *
 *    student@lab4:~$                                                               *
 *    Welcome to Vacation Planner!                                                  *
 *    What is your name: Ernest Hemingway                                           *
 *    Nice to meet you Ernest Hemingway, where are you traveling to? Rome           *
 *    Great! Rome sounds like a great trip                                          *
 *    ***********                                                                   *
 *                                                                                  *
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * ********************
 *                                                                                                      *
 *  def travelTimeBudget():                                                                             *
 *      ''' None -> None                                                                                *
 *      You’ll want to ask the user about how much time and money they are                              *
 *      budgeting for their trip. Once you have all this info (stored in                                *
 *      the correct variables), use it to tell the user the information given in                        *
 *      sample output.                                                                                  *
 *      '''                                                                                             *
 *      # write your code here                                                                          *
 *                                                                                                      *
 *  Sample output:                                                                                      *
 *    student@lab4:~$                                                                                   *
 *    How many days are you going to spend traveling? 31                                                *
 *    How much money, in USD, are you planning to spend on your trip: 7000                              *
 *    What is the three letter currency symbol for your travel destination? EUR                         *
 *    How many EUR are there in 1 USD? 0.85                                                             *
 *                                                                                                      *
 *    If you are traveling for 31 days that is same as 744 hours or 44640 minus or 2678400 seconds.     *
 *    If you are going to spend $7000 USD that means per day you can spend up to $225.8 USD             *
 *    Your total budget in EUR is 5950.0 EUR, which per day is 191.93 EUR                               *
 *    ***********                                                                                       *
 *                                                                                                      *
 ********************************************************************************************************
 *  def timeDifference():                                                                               *
 *      ''' None -> None                                                                                *
 *      you’ll need to ask the user about the time difference between their home and                    *
 *      where they are going.                                                                           *
 *      '''                                                                                             *
 *      # write your code here                                                                          *
 *                                                                                                      *
 *  Sample output:                                                                                      *
 *    student@lab4:~$                                                                                   *
 *    What is the time difference, in hours, between your home and your destination? 4                  *
 *    That means that when it is midnight at home it will be 4:00 in your travel destination and when   *
 *    it's noon at home it will be 16:00                                                                *
 *    ***********                                                                                       *
 *                                                                                                      *
 ********************************************************************************************************/


import java.util.Scanner;

public class TripPlanner
{
    static private String customerName;
    static private String destination;

    public static void main(String[] args)
    {
        // Part 1: Greeting
        // greeting();

        // Part 2: Travel Time and Budget
        // travelTimeBudget();

        // Part 3: Time difference
        timeDifference();

        // Part 4: Country Area
        // countryArea();
    }

    private static void greeting()
    {
        Scanner input = new Scanner( System.in );
        String travellerName ;
        String travelLocation ;

        System.out.print( "Welcome to Vacation Planner!\n" );
        System.out.print( "What is your name: " );  travellerName = input.next();
        System.out.print( "Nice to meet you " + travellerName + ", where are you traveling to? " );  travelLocation = input.next();
        System.out.print( "Great! " + travelLocation + " sounds like a great trip\n" );
        System.out.print( "***********" );

        customerName = travellerName;
        destination = travelLocation;
    }

    private static void travelTimeBudget()
    {
        // write your code here
        Scanner input = new Scanner( System.in );
        int vacationTime ;
        int budget ;
        String currencySign ;
        double currencyRate ;

        System.out.print( "How many days are you going to spend traveling? " ); vacationTime = input.nextInt();
        System.out.print( "How much money, in USD, are you planning to spend on your trip: " ); budget = input.nextInt();
        System.out.print( "What is the three letter currency symbol for your travel destination? " ); currencySign = input.next();
        System.out.print( "How many EUR are there in 1 USD? " ); currencyRate = input.nextDouble();
        System.out.print( "\n" );
        System.out.print( "If you are traveling for " + vacationTime +" days that is same as " + ( vacationTime * 24 ) + " hours or " + ( vacationTime * 24 * 60 ) + " minus or " + ( vacationTime * 24 * 60 * 60 ) + " seconds.\n" );
        System.out.printf( "If you are going to spend $%d USD that means per day you can spend up to $%.1f USD\n" , budget, (double) budget / vacationTime );
        System.out.printf( "Your total budget in %s is %.1f %s, which per day is %.2f %s\n", currencySign, (double) ( budget * currencyRate ), currencySign, (double) ( ( budget * currencyRate ) / vacationTime ) , currencySign );
        System.out.print( "***********" );
    }

    public static void timeDifference()
    {
        // write your code here
        Scanner input = new Scanner( System.in );
        int timeDifference;
        System.out.print( "What is the time difference, in hours, between your home and your destination? " ); timeDifference = input.nextInt();

        if ( timeDifference >= 12 )
        {
            timeDifference -= 12;
        }

        System.out.printf( "That means that when it is midnight at home it will be %d:00 in your travel destination and when it's noon at home it will be %d:00\n", timeDifference, timeDifference + 12 );
        System.out.print( "***********" );
    }

    public static void countryArea()
    {
        // write your code here
    }
}
