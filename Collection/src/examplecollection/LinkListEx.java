package examplecollection;

import java.util.LinkedList;

public class LinkListEx {

	public static void main(String[] args) {
		// crate a linkedlist with only String value
		LinkedList<String> ll=new LinkedList<String>();
		ll.add("Pritish"); // adding element in the Linkedlist 
		ll.add("Pranjali");
		ll.add("Prajakta");
		ll.add("Pritika");
		ll.addFirst("Aniket"); // adding the element at first index location
		ll.addLast("Yash");// adding the element at last index location
		System.out.println(ll);
		System.out.println(ll.getFirst());// retriving the element at first index location
        System.out.println(ll.getLast()); // retriving the element at last index location
        ll.removeFirst();// Removing the element at first index location
        ll.removeLast(); // removing the element at last index location
        ll.add(4, "Pranjali");// adding the element at Particular index location
        ll.removeLastOccurrence("Pranjali"); // Removing the element at last occurance in the list
        System.out.println(ll);
	}

}
