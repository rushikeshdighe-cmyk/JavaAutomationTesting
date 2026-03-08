package AssignmentPractice;

public class WhileLoop9 {

	public static void main(String[] args) {
		// print the sum of even numbers 1 to 100
		int i=1;
		int sum=0;
		
		while (i<=100) {
			if (i%2==0) {
				sum=sum+i;
				System.out.println(sum);
			}
			i++;
		}

	}

}
