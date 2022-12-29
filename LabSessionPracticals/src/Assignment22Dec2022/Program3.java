package Assignment22Dec2022;

interface Printable
{
int Square(int a);

}

interface Calculate
{
int Cube(int a);

}

class CalSquare implements Printable 
{
public int Square(int a)  
     {
	int b=a*a;
	return b;
     }

}
class CalCube implements Calculate
{
public int Cube(int a) 
        {
	int c=a*a*a;
	return c;
    }
	
}
public class Program3 
   {
public static void main(String[] args)
     {
	CalSquare s=new CalSquare();
	System.out.println(s.Square(3));
	CalCube c=new CalCube();
	System.out.println(c.Cube(4));
}

}
