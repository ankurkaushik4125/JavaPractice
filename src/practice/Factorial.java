package practice;

public class Factorial {

	public static int  factorial (int n)
	{
		
		if(n==0)
		{
		return 1;
		}
		else    
		{
			return(n * factorial(n-1));    
		}
	}
	
	public static void main (String aa[])
	{
		int fac_result;
		int number=5;
		fac_result=factorial(number);
		System.out.println("factorial of number is : "  +fac_result);
	}
}
