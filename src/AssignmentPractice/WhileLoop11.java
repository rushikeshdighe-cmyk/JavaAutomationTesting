package AssignmentPractice;

public class WhileLoop11 {

	public static void main(String[] args) {
		// Check if a number is prime using a for loop.
		
		int num=23;
		int count=0;
		int i=1;
		
		while (i<=100) {
			
			if (num%2==0) {
				count++;
			}
			if (count==2) {
				System.out.println(num+"Prime Number");
			}
			else {
				System.out.println(num+"Not a Prime Number");
			}
		i++;
		}
		

	}

}
