package examplecollection;
import java.util.ArrayList;
import java.util.List;
public class ArrayListEx {

	public static void main(String[] args) {
		ArrayList al=new ArrayList(); // Adding different Types of the data like string ,integer
		System.out.println("Top 5 Programming Languages Are:");
        al.add("JAVA");  // Adding element in the Arraylist
        al.add("Python");
        al.add(1000);
        al.add("Perl");
        al.add("C++");
        System.out.println(al);
        System.out.println(al.remove(2)); // Removing the element from list
        System.out.println(al);
        List l=new ArrayList();
        l.add("Machine Learning");
        l.add("Data Science");
        l.set(1,"Artificial Intelligence"); // Replacing the value of element
        al.addAll(l); // Adding another collection in the list
        System.out.println(al);
        al.removeAll(l); // Removing all element from the list
        System.out.println(al);
        l.add(2, "BlockChain Technology"); // Adding element at particular index location
        System.out.println(l);
	}

}
