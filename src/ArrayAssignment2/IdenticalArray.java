package ArrayAssignment2;

import java.util.Arrays;

public class IdenticalArray {

	public static void main(String[] args) {

		int[]a= {1,3,5};
		int[]b= {3,4,6};
		
		if (Arrays.equals(a, b)) {
			
			System.out.println("arrays are identical");
		}
		else {
			System.out.println("array are not identical");
		}

	}

}
