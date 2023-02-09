package com.firstjdbc.studentJDBC;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class method {
 static Scanner sc=new Scanner(System.in);
 //-----------------method for inserting value into the database--------------------------------
 public static void insertData() throws SQLException
 {
 Connection con=Connection_JDBC.ConnectionJDBC();
 String q="insert into customer(id,name,age,DOB) values(?,?,?,?)";
 PreparedStatement pstmt=con.prepareStatement(q);
 System.out.println("Enter the ID");
 int id=sc.nextInt();
 System.out.println("\n Enter Name");
 String name=sc.next();
 System.out.println("\n Enter the Age");
 int age=sc.nextInt();
 System.out.println("\n Enter the DOB(yyyy-mm-dd)");
 Date DOB=Date.valueOf(sc.next());
 pstmt.setInt(1, id);
 pstmt.setString(2, name);
 pstmt.setInt(3, age); 
 pstmt.setDate(4, DOB);
 pstmt.executeUpdate();
 System.out.println("Data inserted Succesfully");
 }

 //-----------------------Updating data into the database--------------------------------------
public static void updateData() throws SQLException
{
	Connection con=Connection_JDBC.ConnectionJDBC();
	String q="update customer set name=? where id=?";
	PreparedStatement pstmt=con.prepareStatement(q);
	System.out.println("Enter Nmae");
	String name=sc.next();
	System.out.println("Enter Id");
	int id=sc.nextInt();
	pstmt.setString(1, name);
	pstmt.setInt(2, id);
	pstmt.executeUpdate();
	System.out.println("Data updated Successfully");
	
}
//-------------------------Deleting data from the existing tables-----------------------------
public static void deleteData() throws SQLException
{
	Connection con=Connection_JDBC.ConnectionJDBC();
	String q="delete from customer where id=?";
	PreparedStatement pstmt=con.prepareStatement(q);
	System.out.println("Enter id You have to Delete");
	int id=sc.nextInt();
	pstmt.setInt(1, id);
    pstmt.executeUpdate();
    System.out.println("Data deleted ....");
}
//--------------------------Displaying the data that exists in a table------------------------
public static void showData() throws SQLException
{
	Connection con=Connection_JDBC.ConnectionJDBC();
	String q="select*from customer";
	PreparedStatement pstmt=con.prepareStatement(q);
	ResultSet rset=pstmt.executeQuery();
	while(rset.next())
	{
		int id=rset.getInt(1);
        String name=rset.getString(2);
		int age=rset.getInt(3);
		Date DOB=rset.getDate(4); 
		System.out.println("Id "+" "+id+" "+"Name "+" " +name+ " Age "+" "+age+" DOB"+" "+DOB);
	}
}
}