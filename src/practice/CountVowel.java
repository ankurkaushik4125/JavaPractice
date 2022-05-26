package practice;

public class CountVowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String text ="My name is ankur sharma";
		text=text.toLowerCase();
		int counter=0;
		for(int i=0;i<text.length();i++)
		{
			if(text.charAt(i)=='a' || text.charAt(i)=='e' ||text.charAt(i)=='i' || text.charAt(i)=='o' || text.charAt(i)=='u')
			{
				counter++;
			}
			
		}
		System.out.println(+counter);
	}

}
