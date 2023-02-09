package com.firstjdbc.LibraryManagmentJDBC;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
public class InsertOperation {
	 static Scanner sc=new Scanner(System.in);
	 //-----------------method for inserting value into the database--------------------------------
	 public static void insertData() throws SQLException
	 {
     //-----------------Establishing Connection-----------------------------------------------------
		 Connection con=ConnectionOperation.createCon();
	 String s="insert into library1(stud_id,stud_name,Book_id,issue_date,return_date) values(?,?,?,?,?)";
	 PreparedStatement pstmt=con.prepareStatement(s);
	 System.out.println("Enter the ID");
	 int stud_id=sc.nextInt();
	 System.out.println("\n Enter Name");
	 String stud_name=sc.next();
	 System.out.println("\n Enter the Book id");
	 int Book_id=sc.nextInt();
	 System.out.println("\n Enter the Issue Date (yyyy-mm-dd)");
	 Date issue_date=Date.valueOf(sc.next());
	 System.out.println("\n Enter the Return Date (yyyy-mm-dd)");
	 Date return_date=Date.valueOf(sc.next());
	 pstmt.setInt(1, stud_id);
	 pstmt.setString(2, stud_name);
	 pstmt.setInt(3, Book_id); 
	 pstmt.setDate(4, issue_date);
	 pstmt.setDate(5, return_date);
     pstmt.executeUpdate();
	 System.out.println("Data inserted Succesfully");
	 }

}
