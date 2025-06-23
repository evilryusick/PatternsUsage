package Adapter;

public class Usb implements IInputType
{

    @Override
    public void set()
    {
        System.out.println("This is a USB input type.");
    }
}
