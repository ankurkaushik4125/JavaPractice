package practice;

public class FindLargestByLoop {
	
	public static void main(String []aa)
	{
		
		
		int [] demo_array = {19,78,45,24,100};
		int max = demo_array[0];
		for(int i=1;i<demo_array.length;i++)
		{
			if(max<demo_array[i] )
			{
				max=demo_array[i];				
			}			
		}
		System.out.println(max);
		
		
		
	}

}
