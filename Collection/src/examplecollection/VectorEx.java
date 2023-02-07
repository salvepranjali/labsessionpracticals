package examplecollection;

import java.util.Enumeration;
import java.util.Vector;

public class VectorEx {

	public static  <E> void main(String[] args) {
	Vector<Integer> v=new Vector<Integer>(); // creating a vector class object
	System.out.println(v.capacity()); // it return the maximum capacity of vector
	for(int i=0;i<=10;i++)
	{
		v.addElement(i);
	}
	System.out.println(v);
//	v.add(100);
//	System.out.println(v);
//	System.out.println(v.size()); //it shows length of vector
	Enumeration<E> e=(Enumeration<E>) v.elements();
	while(e.hasMoreElements())
	{
		Integer i=(Integer)e.nextElement();
		if(i%2==0)
		{
			System.out.println();// Printing the even number from vector
		}
		else
		{
		v.remove(i);
			
		}
		v.remove(i);
	}
	System.out.println(v);
	}

}
