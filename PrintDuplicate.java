package Week4.day1;

public class PrintDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5,1};
		int i = 0, j, count =0;
		for(i=0; i<arr.length-1; i++) {
			count = 0;
			for(j=i; j<arr.length+1; j++) {
				if(arr[i]==arr[j]);
				{
					count++;
				}
				System.out.println(arr[i]);
			}
			
			
		}
	}

}
