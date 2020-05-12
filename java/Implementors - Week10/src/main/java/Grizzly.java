public class Grizzly extends Bear
{
    public int GRIZZLY_SPEED = 12 ;

    Grizzly()
    {}

    @Override
    public String toString()
    {
        return "GRIZZLY_SPEED is " + GRIZZLY_SPEED + '\n';
    }

    @Override
    public int getSpeed()
    {
        return GRIZZLY_SPEED;
    }
}
