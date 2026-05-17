package ArrayAssignment2;

public class OddEvenArray {

	public static void main(String[] args) {

		int[]arr= {2,4,7,5,9,8,30};
		
		
		System.out.println("even Numbers");
		for (int i : arr) {
			if (i%2==0) {
				System.out.println(i);
			}
		}
		System.out.println("odd Numbers");
		for (int i : arr) {
			if (i%2!=0) {
				
				System.out.println(i);
				
			}
		}

	}

}
