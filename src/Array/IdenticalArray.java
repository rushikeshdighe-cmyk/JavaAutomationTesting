package Array;

import java.util.Arrays;

public class IdenticalArray {

	public static void main(String[] args) {

		int[] a= {1,2,3};
		int[]b= {1,2,3};
		
		if (Arrays.equals(a, b)) {
			System.out.println("Arrays are identical");
			
		}
		else {
			System.out.println("Arrays are non Identical");
		}
	}

}
