public class PolarBear extends Bear
{

    public int POLAR_BEAR_SPEED = 15;

    PolarBear ()
    {
    }

    @Override
    public String toString()
    {
        return "POLAR_BEAR_SPEED is " + POLAR_BEAR_SPEED + '\n';
    }

    @Override
    public int getSpeed()
    {
        return POLAR_BEAR_SPEED;
    }
}
