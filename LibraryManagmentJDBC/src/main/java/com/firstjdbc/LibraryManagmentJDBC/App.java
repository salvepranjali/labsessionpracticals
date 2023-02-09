package com.firstjdbc.LibraryManagmentJDBC;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args ) throws SQLException
    {
    	       //------------------------------Performing Different operation on Tables-------------------------------------------- 
    	        System.out.println("1.Insert Data \n 2.Update Data \n 3.Delete Data \n 4.Show all Data" );
    			Scanner sc=new Scanner(System.in);
    			System.out.println("Choose Any one Operation");
    			int choose=sc.nextInt();
    			switch(choose)
    			{
    			case 1:InsertOperation.insertData();
    			      break;
    			case 2:UpdateOperation.updateData();
    			      break;
    			case 3:DeleteOperation.deleteData();
    			      break;
    			case 4:SelectOperation.showData();
    			      break;
    			default:
    				System.out.println("Something Wrong");
    			
    			}

    }
    
    }

