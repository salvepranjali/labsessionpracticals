package com.firstjdbc.LibraryManagmentJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteOperation {
	static Scanner sc=new Scanner(System.in);
	//------------------------------Deleting Records from Existing table--------------------------------------------------
	public static void deleteData() throws SQLException
	{
	//------------------------------Establish Connection-------------------------------------------------------------------
		Connection con=ConnectionOperation.createCon();
		String q="delete from library1 where stud_id=?";
		PreparedStatement pstmt=con.prepareStatement(q);
		System.out.println("Enter id You have to Delete");
		int stud_id=sc.nextInt();
		pstmt.setInt(1, stud_id);
	    pstmt.executeUpdate();
	    System.out.println("Data deleted ....");
	}

}
