package AssignmentPractice;

public class DowhileLoop11 {

	public static void main(String[] args) {
		// Check if a number is prime using a for loop.
		int num=2;
		int count=0;
		int i=1;
		
		do {
			if (num%2==0) {
				count++;
			}
			if (count==2) {
				System.out.println("Prime Number");
			} else {
				System.out.println("Not Prime Number");

			}
			i++;
			
		} while (i<=100);

	}

}
