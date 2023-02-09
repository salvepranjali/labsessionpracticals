package com.firstjdbc.LibraryManagmentJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;


public class UpdateOperation {
	static Scanner sc=new Scanner(System.in);
	//-------------------------------Updating Data in existing table-------------------------------------------------------
	public static void updateData() throws SQLException
	{
    //-------------------------------Establish Connection------------------------------------------------------------------
		Connection con=ConnectionOperation.createCon();
		String q="update library1 set stud_name=? where stud_id=?";
		PreparedStatement pstmt=con.prepareStatement(q);
		System.out.println("Enter Nmae");
		String stud_name=sc.next();
		System.out.println("Enter Id");
		int stud_id=sc.nextInt();
		pstmt.setString(1, stud_name);
		pstmt.setInt(2, stud_id);
		pstmt.executeUpdate();
		System.out.println("Data updated Successfully");
		
	}

}
