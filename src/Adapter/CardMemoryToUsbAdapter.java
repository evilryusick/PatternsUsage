package Adapter;

public class CardMemoryToUsbAdapter implements IInputType
{
    private CardMemory cardMemory;

    public CardMemoryToUsbAdapter(CardMemory cardMemory)
    {
        this.cardMemory = cardMemory;
    }

    @Override
    public void set()
    {
        cardMemory.set();
    }
}
