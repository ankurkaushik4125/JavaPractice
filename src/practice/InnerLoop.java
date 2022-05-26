package practice;

public class InnerLoop {
	
	public static void main(String[] args)
	{
int k=1;
		
	for(int i=0;i<4;i++)
		
	{
		//System.out.println("outer loop");
		for(int j=1;j<=4-i;j++)
			
		{
			System.out.print(k);
		System.out.print("\t");
			k++;		
		}
		System.out.println("");
	}
	}
}
/*
 print  a pyramid
4 3 2 1
5 6 7
8 9
10

 */
