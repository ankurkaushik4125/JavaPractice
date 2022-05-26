package practice;
import java.util.Scanner;

public class SwapTwoNumbers {
	public static void main(String[] args)
	{
		int a,b,temp;
		Scanner in= new Scanner(System.in);
		
		System.out.println("Enter value of first number");
		a=in.nextInt();
		System.out.println("Enter value of second number");
		b=in.nextInt();
		temp=a;
		a=b;
		b=temp;
		
		System.out.println("new value of first : "+a+" new value of second : "+b);


		
		
	}
	
}
