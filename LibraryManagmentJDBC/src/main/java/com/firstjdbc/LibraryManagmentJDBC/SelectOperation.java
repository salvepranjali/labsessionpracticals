package com.firstjdbc.LibraryManagmentJDBC;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;


public class SelectOperation {
	static Scanner sc=new Scanner(System.in);
	//-----------------------Displaying overall Information from tables--------------------------------------------
	public static void showData() throws SQLException
	{
	//-----------------------Establish Connection------------------------------------------------------------------
		Connection con=ConnectionOperation.createCon();
		String q="select*from library1";
		PreparedStatement pstmt=con.prepareStatement(q);
		ResultSet rset=pstmt.executeQuery();
		while(rset.next())
		{
			int stud_id=rset.getInt(1);
	        String stud_name=rset.getString(2);
			int Book_id=rset.getInt(3);
			Date issue_date=rset.getDate(4); 
			Date return_date=rset.getDate(4); 
			System.out.println("Id "+" "+stud_id+" "+"Name "+" " +stud_name+ " Book_id "+" "+Book_id+" Issue_date"+" "+issue_date+" Return_date"+" "+return_date);
		}
	}


}
