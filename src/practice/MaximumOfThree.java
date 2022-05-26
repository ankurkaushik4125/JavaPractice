package practice;
import java.util.Scanner;

public class MaximumOfThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int a,b,c;
		
		Scanner in= new Scanner(System.in);
		
		System.out.println("Enter value of A : ");
		a=in.nextInt();
		System.out.println("Enter value of B : ");
		b=in.nextInt();
		System.out.println("Enter value of C : ");
		c=in.nextInt();
	if(a>b && a>c)
	{
		System.out.println("A is biggest");
	}
	else if(a>b && a>c)
	{
		System.out.println("B is biggest");
	}
	else
	{
		System.out.println("C is biggest");
	}
	
	String str = "";
	while(in.hasNextLine() && !((str = in.nextLine()).equals("exit"))) {
	    //Handle string
	}
	
	}

}
