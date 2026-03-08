package Array;

public class AscendingArray {

	public static void main(String[] args) {
		int[]arr= {1,3,5,7,8,9};
		boolean Sorted=true;
		
		for (int i = 0; i < arr.length-1; i++) {
			if (arr[i]>arr[i+1]) {
				Sorted=false;
				break;
				
			}
			
		}
		if (Sorted) {
			System.out.println("Array is Ascending Order");
		}
		else {
			System.out.println("Array is not Ascending Order");
		}
	}

}
