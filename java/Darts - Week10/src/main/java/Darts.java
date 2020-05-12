public class Darts {

    double x;
    double y;

    Darts( double x , double y )
    {
        this.x = x;
        this.y = y;
    }

    int score()
    {
        double distance = Math.sqrt( ( Math.pow( this.x , 2 ) + Math.pow( this.y , 2 ) ) );

        if ( distance > 10 )
        {
            return 0;
        }
        else if ( distance > 5 )
        {
            return 1;
        }
        else if ( distance > 1)
            {
                return 5;
            }
            else
            {
                return 10;
            }
    }

    // // implement below function
    // int score() {
    //     return 0;
    // }
}