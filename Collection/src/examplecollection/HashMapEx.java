package examplecollection;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx {

	public static void main(String[] args) {
		HashMap<Integer, String> hp=new HashMap<Integer, String>();
		hp.put(101, "Rani");
		hp.put(102, "Puja");
		hp.put(103, "Saurabh");
		hp.put(104, "Neha");
		for(Map.Entry m: hp.entrySet())
		{
			System.out.println(m.getKey()+ " "+ m.getValue());
		}

	}

}
