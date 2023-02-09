package com.firstjdbc.studentJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws SQLException
    {
       //---------------Create Connection with java program to the Mysql database------------------------------------
    	try
        {
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/customer", "root", "Pranjali");
        if(con.isClosed())
        {
        	System.out.println("Connection is Closed");
        }
        else
        {
        	System.out.println("Connection Established Successfully");
        }
       //---------------------Prepared Statement for Data Insertion to the database table--------------------------
        /*
        String s="insert into customer_info (cid,cname,age,country) values(?,?,?,?)";
        PreparedStatement pstmt=con.prepareStatement(s);
        */
       // --------------------Insert data into a table using by default value set by user---------------------------
        /*  pstmt.setInt(1, 1);
        pstmt.setString(2, "Swati");
        pstmt.setInt(3, 30);
        pstmt.setString(4, "India");
        pstmt.executeUpdate();
        System.out.println("The data is inserted");
        */
        
      //------------------Insert data into table using runtime value enter by the user---------------------------
       /*
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the customer id here...");
       int cid=sc.nextInt();
       pstmt.setInt(1, cid);
       System.out.println("Enter the customer name here...");
       String cname=sc.next();
       pstmt.setString(2, cname);        
       System.out.println("Enter the customer age here...");  
       int age=sc.nextInt();
       pstmt.setInt(3, age);
       System.out.println("Enter the country here...");
       String country=sc.next();
       pstmt.setString(4, country);
       pstmt.executeUpdate();
       System.out.println("The data is inserted");
       */
      //------------------------Creating the object of another class in which methods are define----------------------- 
        App1 a=new App1();
      //------------------------Calling method from App1 class---------------------------------------------------------
        /* int cid=a.m1();
        String cname=a.m2();
        int age=a.m3();
        String country=a.m4();
        System.out.println(cid+" "+cname+" "+age+" "+country);
        */
      //------------------------Passing  runtime value to the databse through the methods------------------------------
        /*
        pstmt.setInt(1,cid);
        pstmt.setString(2, cname);
        pstmt.setInt(3, age);
        pstmt.setString(4, country);
        System.out.println("Data inserted...");
        */

       /* pstmt.setInt(1,a.m1());
        pstmt.setString(2, a.m2());
        pstmt.setInt(3, a.m3());
        pstmt.setString(4, a.m4());
        pstmt.executeUpdate();
        System.out.println("Data inserted...");

        */
       //----------------------Update data into the database-----------------------------------------------------------
       /*
       String q="update customer_info set cname=?,age=?,country=? where cid=?";
       PreparedStatement pstmt=con.prepareStatement(q);
       */
       //----------------------Taking data from user-------------------------------------------------------------------
       /*
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter Updated Name");
       String cname=sc.next();
       System.out.println("Enter the Age");
       int age=sc.nextInt();
       System.out.println("Enter Updated Country");
       String country=sc.next();
       System.out.println("Enter the Where Data value updated Id");
       int cid=sc.nextInt();
       */
      //------------------------Setting that values in the Query------------------------------------------------------
       /*
       pstmt.setString(1,cname);
       pstmt.setInt(2, age);
       pstmt.setString(3, country);
       pstmt.setInt(4, cid);
       pstmt.executeUpdate();
       System.out.println("Update Data Successfully ");
       */
      //------------------------Deleting Record from the table--------------------------------------------------------
       /*
       String q="delete from customer_info where cid=?";
       PreparedStatement pstmt=con.prepareStatement(q);
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the id You want to delete");
       int cid=sc.nextInt();
       */
      //------------------------Setting the Value to the queries------------------------------------------------------
       /*
       pstmt.setInt(1, 103);
       System.out.println("Data Deleted Succesfully");
       */
      //------------------------Execute the PreparedStatement---------------------------------------------------------
       /*
        pstmt.executeUpdate();
       */
      //------------------------Retriving All the records from table--------------------------------------------------
        String q="select *from customer_info";
        PreparedStatement pstmt=con.prepareStatement(q);
        ResultSet rset=pstmt.executeQuery();
        while(rset.next())
        {
        	int id=rset.getInt(1);
        	String name=rset.getString(2);
        	int cage=rset.getInt(3);
        	String Country=rset.getString(4);
        	System.out.println("ID "+ id + "Name "+ name + "Age "+ cage + "Country "+ Country);
        }
        con.close();
       }
        catch(Exception e)
        {
        System.out.println(e);	
        }
        }
}
