package Proxy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbCon implements IDbConnection
{
    private final String dbName = "sakila";
    private final String dbpass = System.getenv("DB_PASS");
    private final String dbuser = System.getenv("DB_USER");
    private Connection instance;

    String getDbName()
    {
        return dbName;
    }

    String getDbpass()
    {
        return dbpass;
    }

    String getDbuser()
    {
        return dbuser;
    }

    @Override
    public void connectDb()
    {
        if (instance == null)
        {
            try
            {
                instance = DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila", dbuser, dbpass);
                System.out.println("Connected to sakila");
            } catch (SQLException ex)
            {
                System.out.println("Connection failed.\n" + ex);
            }
        }
        else
        {
            System.out.println("Already connected.");
        }
    }
}
