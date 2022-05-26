package practice;

import java.util.Arrays;

public class CheckAnolgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "Grab";
		String str2 = "Brae";
		
		if(str1.length() != str2.length())
		{
		System.out.println("length mismatch");
		}
		else {
		str1=str1.toLowerCase();
		str2=str2.toLowerCase();
		
char[] charstr1 = str1.toCharArray();  
char[] charstr2 = str2.toCharArray();  

Arrays.sort(charstr1);
Arrays.sort(charstr2);
if(Arrays.equals(charstr1, charstr2) == true) {  
	System.out.println("array are same");
}
	else {
		System.out.println("mismatch");
	
}
		}
	}
}
