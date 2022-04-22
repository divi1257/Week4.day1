package Week4.day1;

import java.util.Arrays;

public class SecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			int[] arr = new int[] {3,2,11,4,6,7};
			System.out.println("Elements are sorted in ascending order:");
		
			Arrays.sort(arr);
			for(int i=0; i <arr.length; i++) {
				System.out.println(arr[i]);
				
	}
			int arr2 = arr[arr.length - 2];
			System.out.println("Second Largest Number is:"+arr2);
	}
}
