package AssignmentPractice;

public class DoWhileLoop8 {

	public static void main(String[] args) {
		// print the sum of odd numbers 1 to 100
		
		int i=1;
		int sum=0;
		
		do {
			if (i%2!=0) {
				sum=sum+i;
				System.out.println(sum);
			}
			i++;
		} while (i<=100);

	}

}
