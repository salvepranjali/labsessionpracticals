
// Program No 2: create class for calculating area of rectangle && square
package Assignment15dec2022;

public class Program2 {
      int length,breadth,side;
	  public int recArea(int l,int b) //Area of Rectangle 
	   {
	     this.length=l;
	     this.breadth=b;
	     return  length*breadth;
	 
	   }
	  public int sqaArea(int s) // Area of Square
	   {
	    
	     this.side=s;
	     return side*side;
	   }
	
	
	  public static void main(String args[])
	   {
		  Program2 a=new Program2();
	     System.out.println("Area of Rectangle is: "+ a.recArea(10,3));
	     System.out.println("Area of Square is: "+ a.sqaArea(10));
	   }
	}

