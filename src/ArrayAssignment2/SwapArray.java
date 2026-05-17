package ArrayAssignment2;

public class SwapArray {

	public static void main(String[] args) {
		int[]arr= {1,2,3,4,5,6};
		
		int temp=arr[0];
		arr[0]=arr[arr.length-1];
		arr[arr.length-1]=temp;
		
		System.out.println("After swaping array");
		for (int i : arr) {
			
			System.out.println(i);
			
		}


		
	}

}
