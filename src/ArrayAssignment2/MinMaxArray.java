package ArrayAssignment2;

public class MinMaxArray {

	public static void main(String[] args) {


		int[]arr= {12,28,36,93,73};
		int min=arr[0];
		int max=arr[0];
		
		for (int i = 0; i < arr.length; i++) {
			
			if (arr[i]<min) {
				
				min=arr[i];	
			}
			if (arr[i]>max) {
				max=arr[i];
			}
			
		}

		System.out.println(min);
		System.out.println(max);
	}

}
