package examplecollection;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		for(int i=1;i<=10;i++)
		{
			al.add(i);
		}
		    System.out.println(al);
			Iterator <Integer> itr=al.iterator(); // it is a universal travelser moving with only forward direction
			while(itr.hasNext())
			{
				Integer i1=(Integer) itr.next();
				if(i1%2==0)
				{
					System.out.println(i1);
				}
				else
				{
					itr.remove();
				}
			}
		
		System.out.println(al);

	}

}
