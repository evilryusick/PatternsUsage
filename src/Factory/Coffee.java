package Factory;

public class Coffee
{
    protected int temperature;
    protected boolean hasMilk;
    protected long amount;

    public Coffee(){}

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

    public void start (CoffeeTypes type)
    {
        run();
        Coffee coffee = CoffeeFactory.getCoffee(type);
        setCoffee(type);
        coffeeOptions(coffee);
        System.out.println("\nCoffee is ready. Enjoy!");
    }

    private void run ()
    {
        System.out.println("\nCoffee machine starts:");
    }

    private void setCoffee(CoffeeTypes type)
    {
        System.out.println("Coffee type settled to " + type + ".");
    }

    private void coffeeOptions(Coffee coffee)
    {
        System.out.println("\nCoffee's temperature: " + coffee.getTemperature() + ";");
        System.out.println("Adding milk: " + coffee.isHasMilk() + ";");
        System.out.println("Output amount: " + coffee.getAmount() + ".");
    }
}
