package Week4.day1;

import java.util.ArrayList;
import java.util.List;

public class FindInterSection {

	public static void main(String[] args) {
		Integer[] num={3,2,11,4,6,7};	
		Integer[]num2={1,2,8,4,9,7};
		// TODO Auto-generated method stub
		List<Integer> arr= new ArrayList<Integer>();
		List<Integer> arr2= new ArrayList<Integer>();
		
		System.out.println(arr);
		
    for(int i = 0; i<num.length; i++)
    {
    	arr.addAll(arr);
    	
    	
    	for(int j = 0; j<arr2.size(); j++)
    	{
    if( arr.get(i)== arr2.get(j)) {
   
    }
 	System.out.println("The Intersection Number are:"+arr[i]);
    }
	}

}

	private static String arr(int i) {
		// TODO Auto-generated method stub
		return null;
	}


}
