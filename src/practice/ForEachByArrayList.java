package practice;
import java.util.*;  


	public class ForEachByArrayList{ 
		
	  public static void main(String args[]){  
	   //Creating a list of elements  
	   ArrayList<String> list=new ArrayList<String>();  
	   list.add("ankur");  
	   list.add("rishab");  
	   list.add("juhi");  
	   //traversing the list of elements using for-each loop  
	   for(String s:list){  
	     System.out.println(s);  
	   }  
	  
	 }   
	}  


