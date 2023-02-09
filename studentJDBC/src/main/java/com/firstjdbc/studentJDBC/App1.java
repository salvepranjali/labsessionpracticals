package com.firstjdbc.studentJDBC;

import java.util.Scanner;

public class App1 {
	Scanner sc=new Scanner(System.in);
	public int m1()
	{
		System.out.println("Enter the a id ");
		int cid=sc.nextInt();
		return cid;
	}
	public String m2()
	{
		System.out.println("Enter the Name ");
		String cname=sc.next();
		return cname;
	}
	public int m3()
	{
		System.out.println("Enter the age ");
		int age=sc.nextInt();
		return age;
	}
	public String m4()
	{
		System.out.println("Enter the Country ");
		String country=sc.next();
		return country;
	}
	

}
