package examplecollection;

import java.util.TreeSet;

class SortedSetEx
{
public static void main(String args[])
{
 TreeSet<String> t=new TreeSet<String>();
  t.add("D");
  t.add("A");
  t.add("C");
  t.add("B");
  t.add("F");
  //System.out.println(t);
  System.out.println(t.headSet("c")); // Display Element From [D,F]
  System.out.println(t.tailSet("D"));// Display element upto [A,B,C,D]
  System.out.println(t.subSet("B", "F"));
}
}


