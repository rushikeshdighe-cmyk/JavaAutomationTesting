package ArrayAssignment2;

public class AsendingArrey {

	public static void main(String[] args) {


		int[]arr= {9,3,8,4,6,7,8};
		boolean sorted=true;
		
		for (int i = 0; i < arr.length; i++) {
			
			if (arr[i]>arr[i+1]) {
				
				sorted =false;
				break;
				
			}
		}
		if (sorted) {
			System.out.println("ascending order");
		}
		else {
			System.out.println("not ascending order");
		}
		
	}

}
