package AssignmentPractice;

public class DoWhileLoop10 {

	public static void main(String[] args) {
		// Print Even Numbers Between 1 and 50 in reverse order
		
		int i=50;
		do {
			if (i%2==0) {
				System.out.println(i);
			}
			i--;
		} while (i>=1);

	}

}
