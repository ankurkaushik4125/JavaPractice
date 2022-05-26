package practice;

public class Swapofnum {
	
	
	    public static void main(String[] args) {

	        float first = 12.0f, second = 24.5f;

	        System.out.println("--Before swap--");
	        System.out.println("First number = " + first);
	        System.out.println("Second number = " + second);

first=first- second;
second=second+first;
first=second-first;
	        System.out.println("--After swap--");
	        System.out.println("First number = " + first);
	        System.out.println("Second number = " + second);
	    }
	}


