public class Wolf implements Runner
{
    private final int WOLF_SPEED = 10;

    public Wolf()
    {
    }

    @Override
    public String toString()
    {
        return "WOLF_SPEED is " + WOLF_SPEED + '\n';
    }

    @Override
    public int getSpeed()
    {
        return WOLF_SPEED;
    }
}
