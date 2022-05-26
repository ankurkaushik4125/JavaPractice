package practice;

import java.awt.List;
import java.util.Arrays;

public class SecondLargest {

	public int get_second_largest(int[] a,int total) {
		Arrays.sort(a);
		return a[total-1];
	}
	
	public static void main(String[] args) {
		
		int first[]= {1,2,5,6,3,2};
		
		SecondLargest s = new SecondLargest();
		
		System.out.println(s.get_second_largest(first, 6));
		
		// TODO Auto-generated method stub

	}

}
