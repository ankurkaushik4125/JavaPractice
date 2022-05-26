package practice;

public class FindOccurance {

	
	public static void main (String []  args)
	
	{
		
		String text = "I am ankur sharma";
		
		char tofind='a';
		int k=0;
		for(int i=1;i<text.length();i++)
		{
			if(text.charAt(i)==tofind)
			{
				k++;
				
			}
			
		}
		
		System.out.println(k);
		
		
	}
}
