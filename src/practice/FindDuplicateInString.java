package practice;

public class FindDuplicateInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String text="ArjunRampal";
		char[] TextArray=text.toCharArray();
		int counter;
		
		for ( int i=0;i<TextArray.length;i++)
		{
			 counter=1;
			for ( int j=i+1;j<TextArray.length;j++)
			{
				if(TextArray[i] == TextArray[j] && TextArray[i] !=' ' )
				{
				System.out.println(TextArray[i]);
				counter++;
				TextArray[j]=0;
				}
			}
			if (counter>1 && TextArray[i] != '0' )
			{
				System.out.println(TextArray[i]);
			}
		}
		
	
	}

}
