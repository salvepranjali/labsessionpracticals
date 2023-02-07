package examplecollection;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorEx {

	public static void main(String[] args) {
	LinkedList<String> l=new LinkedList<String>();
	l.add("Pranjali");
	l.add("Shraddha");
	l.add("Mayuri");
	System.out.println(l);
	ListIterator<String> li=l.listIterator(); // creating listiterator has moving with both directions i.e forward and backword
	while(li.hasNext())
	{
		String s=(String) li.next();
		if(s.equals("Pranjali"))
		{
		li.remove(); // removing element from list
		}
		else if(s.equals("Shraddha")) // comparing string are equals or not
		{
			li.add("Manjusha"); // adding new element
		}
		else if(s.equals("Mayuri"))
		{
			li.set("Jayshri"); // replacing existing value
		}
	}
	System.out.println(l);
	

	}

}
