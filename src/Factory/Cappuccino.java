package Factory;

public class Cappuccino extends Coffee
{
    final protected int temperature = 65;
    final protected boolean hasMilk = true;
    final protected long amount = 165;

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

    public Cappuccino() {}

}
