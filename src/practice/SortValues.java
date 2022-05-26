package practice;

public class SortValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] Array_given= {87,78,23,45,89};
		int min,temp=0;
		for(int i=0;i<Array_given.length;i++)
		{
		 min=i;
			for(int j=i+1;j<Array_given.length;j++)
			{
				
				if(Array_given[j] <Array_given[min])
				{
					min=j;
					System.out.println(min);
				}
			}
			
			temp=Array_given[i];
			Array_given[i]=Array_given[min];
			Array_given[min]=temp;
			
			
		}
			
		for(int i=0;i<Array_given.length;i++)
		{
			System.out.println(Array_given[i]);
			
		}

	}

}
