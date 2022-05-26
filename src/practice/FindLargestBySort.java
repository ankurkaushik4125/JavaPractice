package practice;

import java.util.Arrays;

public class FindLargestBySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	int [] intarry	= {5,1,10,15};

     Arrays.sort(intarry);
	
     int length_arr = intarry.length;
     
	System.out.println(intarry[length_arr-1]);
	

	}

}
