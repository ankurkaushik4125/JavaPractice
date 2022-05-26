package practice;

public class TranposeMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println();
		// create a array to store original array
		
		int original[][]  = {{1,2,3},{4,5,6},{7,8,9}};
		// create an array to store data
		int transpose[][]=new int[3][3];
		

		for (int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				transpose[i][j] =  original[j][i];
		 }
			}
		
		
		for (int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
		System.out.print(original[i][j]);
		 }
			System.out.println();
			}
		

		for (int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
		System.out.print(transpose[i][j]);
		 }
			System.out.println();
			}
	}

}
