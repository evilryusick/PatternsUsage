package Singleton;


import java.time.LocalDate;

public class Logging
{
    private static Logging log;

    private Logging(){}

    public static void classLogg(Object object, String information)
    {
        if (log == null)
        {
            log = new Logging();
        }
        System.out.println("Log information: "
                + LocalDate.now()
                + " - "
                + object.getClass()
                + " - "
                + information);
    }
}
