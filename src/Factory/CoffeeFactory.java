package Factory;

public class CoffeeFactory
{
    private CoffeeFactory(){}

    public static Coffee getCoffee(CoffeeTypes type)
    {
        Coffee coffee = null;
        switch (type)
        {
            case BLACK:
                coffee = new Black();
                break;
            case CAPPUCINO:
                coffee = new Cappuccino();
                break;
            default:
                throw new IllegalArgumentException("Coffee type not found.");
        }
        return coffee;
    }
}
