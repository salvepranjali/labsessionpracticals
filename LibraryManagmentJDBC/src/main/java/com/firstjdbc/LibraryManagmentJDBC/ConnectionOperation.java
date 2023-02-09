/*package com.firstjdbc.LibraryManagmentJDBC;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionOperation {
	static Connection con;
    public static Connection createCon() 
    {
        try
    {
	con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Library", "root", "Pranjali");

if(con.isClosed())
{
	System.out.println("Connection is Closed");
}
else
{
	System.out.println("Connection Established Successfully");
}

   }
        catch(Exception e)
        {
        	System.out.println(e);
        }
      

return con;
    } 
    public static void main(String args[])
    {
    	ConnectionOperation.createCon();
    	
    }

}
*/

package com.firstjdbc.LibraryManagmentJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionOperation {
	//----------------------Establishing the connection between java application with mysql Database------------------
	static Connection con;
	public static Connection createCon() throws SQLException
	{
	
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/customer", "root", "Pranjali");
		if(con.isClosed())
		{
			System.out.println("Connection is Close");
		}
		else
		{
			System.out.println("Connection is Established ");
		}
	
	return con;
	}
}

