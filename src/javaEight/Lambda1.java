package javaEight;

public class Lambda1  {

	
	public static void main(String[] aa)
	{
		
		
		Webpage w1 = (value) -> {System.out.println("hi  :"  +value);};
		/*
		 //LISP
		Webpage w1 = new Webpage() {
			
			@Override
			public void header(String value) {
				// TODO Auto-generated method stub
				System.out.println(value);
				
			}
		};
		
	*/
		w1.header("Google");
	}

	
}
