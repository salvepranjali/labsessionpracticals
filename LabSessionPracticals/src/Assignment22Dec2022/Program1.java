package Assignment22Dec2022;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Program1 {
	  public static void main(String args[]) throws Exception
	    {
	      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	      System.out.println("Enter Some Text....");
	      String s=br.readLine();
	      System.out.println("Enter Same Text Again....");
	      String s1=br.readLine();
	      System.out.println("String Enter By You: "+s);
	      System.out.println("ReEnter String By You: "+s1);
	      if(s.equals(s1))
	       {
	         System.out.println("Both String are Equals");
	       }
	      else
	       {
	         System.out.println("Both String are not Equals");
	       } 
	    }

	}
