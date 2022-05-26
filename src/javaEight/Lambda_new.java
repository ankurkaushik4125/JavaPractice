package javaEight;

import practice.Sysout;

public class Lambda_new {
	
	public static void main(String [] aa)
	
	{
		Webpage_new w1 = n->n*n;
		
	
		/*
		Webpage_new w1 = new Webpage_new() {
			
			@Override
			public void header(String name) {
				// TODO Auto-generated method stub
				
				System.out.println(name);
				
			}
		};
		*/
		System.out.println(w1.square(20));
	}

}
