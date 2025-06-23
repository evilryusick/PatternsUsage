package Adapter;

public class Computer
{
    public void usbRead(IInputType type)
    {
        type.set();
        System.out.println("USB connected.");
    }
}
