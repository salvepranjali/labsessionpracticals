package com.firstjdbc.studentJDBC;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connection_JDBC {
	//----------------------Establishing the connection between java application with mysql Database------------------
	static Connection con;
	public static Connection ConnectionJDBC()
	{
	try
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
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	return con;
	}
}
