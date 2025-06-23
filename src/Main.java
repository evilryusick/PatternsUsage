import Adapter.*;
import Factory.*;
import Proxy.*;
import Singleton.Logging;

import java.io.*;

public class Main
{
    public static void main(String[] args)
    {
        //First task
        {
            String file = "src/importants";
            try
            {
                FileReader fileReader = new FileReader(file);
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                System.out.println(bufferedReader.readLine());
            } catch (IOException exc)
            {
                Logging.classLogg(file, String.valueOf(exc));
            }
            System.out.println("\n");
        }
        //Second task
        {
            Coffee coffee = new Coffee();
            coffee.start(CoffeeTypes.BLACK);
            System.out.println("\n");
        }
        //Third task
        {
            Computer computer = new Computer();
            CardMemory cardMemory = new CardMemory();
            CardMemoryToUsbAdapter adapter = new CardMemoryToUsbAdapter(cardMemory);
            computer.usbRead(adapter);
            System.out.println("\n");
        }
        //Fourth task
        {
            DbCon dbConnection = new DbCon();
            DbProxyCon dbProxyCon = new DbProxyCon(dbConnection);
            dbProxyCon.connectDb();
        }
    }
}