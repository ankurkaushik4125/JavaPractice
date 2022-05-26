package practice;

public class CountingWithoutLoop {
	
	
	public void get_count(int number)
	{
		if( number > 0)
		{
			get_count( number-1);
		System.out.println(number);

		}
	}
	
	
	public static void main(String aa[])
	
	{

		CountingWithoutLoop aa1 = new CountingWithoutLoop();
	
		aa1.get_count(100);
		
		
	}

}
