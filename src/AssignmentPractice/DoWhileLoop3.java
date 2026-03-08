package AssignmentPractice;

public class DoWhileLoop3 {

	public static void main(String[] args) {
		// Print the square of each number from 1 to 5:
		
		int i=1;
		int square=0;
		
		do {
			square=i*i;
			System.out.println(square);
			i++;
			
		} while (i<=5);

	}

}
