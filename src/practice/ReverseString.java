package practice;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String text= "i am ankur sharma";
		String reversetext="";
		
		
		for (int i=text.length()-1;i>=0;i--)
			
		{
			reversetext=reversetext+text.charAt(i);
			
			
			
		}

		System.out.println(text);
		System.out.println(reversetext);
	}

}
