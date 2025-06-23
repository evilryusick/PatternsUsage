package Factory;

public class Black extends Coffee
{
    final protected int temperature = 70;
    final protected boolean hasMilk = false;
    final protected long amount = 150;

    public int getTemperature()
    {
        return temperature;
    }

    public boolean isHasMilk()
    {
        return hasMilk;
    }

    public long getAmount()
    {
        return amount;
    }

    protected Black () {}
}
