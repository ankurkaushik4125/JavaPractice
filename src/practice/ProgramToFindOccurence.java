package practice;

public class ProgramToFindOccurence {
	
	public static void main(String[] args)
	
	{
	
		
		String text = "my name is ankur sharma";
		
		int res=0;
		char a ='a';
		
		for(int i=0;i<text.length();i++)
		{
			if(text.charAt(i) == a)
			{
				res++;
			}
			
		}
		System.out.println(res);
		
	}

}
