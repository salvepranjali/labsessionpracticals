
// Program No 3 : Method Overriding

package Assignment15dec2022;

  class Shape
	{
	   public void shape()
	    {
	      System.out.println(" This is Shape");
	    }
	  
	}
	class Rectangle extends Shape
	{
	  
	   public void shape()
	    {
	      System.out.println(" This is Rectangle Shape");
	    }
	}
	class Circle extends Shape
	{
	  
	   public void shape()
	    {
	      System.out.println(" This is Circle Shape");
	    }
	}
	public class Program3 {

	 public static void main(String args[])
	  {
		 Rectangle r=new Rectangle();
	    r.shape();
	    Circle  c=new Circle();
	    c.shape();
	   
	  }
	}
	