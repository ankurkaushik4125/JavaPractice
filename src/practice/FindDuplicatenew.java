package practice;

public class FindDuplicatenew {
	
	public static void main (String [] aa)
	{
		String text ="My name is ankur sharma";
		
		char[] textArray=text.toCharArray();
		int counter;
		
		for(int i=0;i<textArray.length;i++)
		{
			counter = 1;
			
			for(int j=i+1;j<textArray.length;j++)
			{
				if(textArray[i]==textArray[j] && textArray[i] != ' ')
{
					
					counter++;
					textArray[j]='0';
				}
				
			}
			
		if(counter>1 && textArray[i] != '0')
			
		{
			System.out.println(textArray[i]);
		}
			
		}
		
		
	}

}
