package com.firstjdbc.studentJDBC;

import java.sql.SQLException;
import java.util.Scanner;

public class App2 {

	public static void main(String[] args) throws SQLException
	{
//------------------------------calling Different method of method class--------------------------
		System.out.println("1.Insert Data \n 2.Update Data \n 3.Delete Data \n 4.Show all Data" );
		Scanner sc=new Scanner(System.in);
		System.out.println("Choose Any one Operation");
		int choose=sc.nextInt();
		switch(choose)
		{
		case 1:method.insertData();
		      break;
		case 2:method.updateData();
		      break;
		case 3:method.deleteData();
		      break;
		case 4:method.showData();
		      break;
		default:
			System.out.println("Something Wrong");
		}

	}

}
