package Week4.day1;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class MissinfElementsInArray {

	public static void main(String[] args) {
		
		List<Integer> arr= new ArrayList<Integer>();
		arr.add(1);
		arr.add(2);
		arr.add(4);
		arr.add(5);
		arr.add(6);
		arr.add(7);
		
		
		
		Collections.sort(arr);
		for(int i=0; i<=arr.size()-1; i++){
			if(arr.get(i)!=i+1) {
				System.out.println("Missing number is"+(i+1));
				break;
			}
         
        
        		 }
         
         

	}

}
