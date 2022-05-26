package practice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExampleString {

	
	public static void main  (String [] args)
	
	{
		Set<String> hashset = new HashSet<String>();

		hashset.add("ankur");
		hashset.add("juhi");
		hashset.add("juhi");
		hashset.add("banana");

		Iterator<String> nameiterator = hashset.iterator();


		System.out.println(nameiterator.next());
		System.out.println(nameiterator.next());
		System.out.println(nameiterator.next());
		
		HashMap<Integer,String> hashmap=new HashMap<Integer,String>();
		
		hashmap.put(1, "ankur");
		hashmap.put(2, "juhi");
		hashmap.put(3, "juhi");
		System.out.println(hashmap);
	}
}