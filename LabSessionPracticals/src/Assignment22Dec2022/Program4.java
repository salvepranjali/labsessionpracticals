package Assignment22Dec2022;

import java.util.*;
public class Program4
{
  public static void main(String args[])
   {
     String str="Welcome";
     Scanner sc=new Scanner(System.in);
     System.out.println("Please Enter String value");
     String s=sc.next();
     String s1=s.substring(3,8);
     System.out.println("Substring of Enter text is:"+s1);
     System.out.println("Subsequense of Enter text is:"+str.subSequence(2,5));
     sc.close();
   }
}
