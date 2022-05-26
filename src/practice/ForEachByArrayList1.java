package practice;

import java.util.ArrayList;

public class ForEachByArrayList1 {
	
	public static void main(String aa[])
	
	{
		ArrayList<String> fruits = new ArrayList<String>() ;
		fruits.add("Apple");
		fruits.add("banana");
		fruits.add("Litchi");
		fruits.add("Mango");
		
		for(String test : fruits)
			
		{
			System.out.println(test);
		}
		
	}

}
