package Proxy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbProxyCon implements IDbConnection
{
    private final String connectionUrl = "jdbc:mysql://localhost:3306/";
    private DbCon dbCon;
    private static Connection instance;

    public DbProxyCon(DbCon dbCon)
    {
        this.dbCon = dbCon;
    }

    @Override
    public void connectDb()
    {
        if (instance == null)
        {
            try
            {
                instance = DriverManager.getConnection(connectionUrl + dbCon.getDbName(), dbCon.getDbuser(), dbCon.getDbpass());
                System.out.println("Connected to " + connectionUrl + dbCon.getDbName());
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
