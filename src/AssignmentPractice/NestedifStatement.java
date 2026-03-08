package AssignmentPractice;

public class NestedifStatement {

	public static void main(String[] args) {
		/*Check if a number is positive and even*/
		
		int a=123;
		
		if (a>0) {
			System.out.println("Postive Number");
			if (a%2==0) {
				System.out.println("Even Number");
			}
			else {
				System.out.println("odd Number");
			}
		} 
		else {
			System.out.println("Negative Number");

		}

	}

}
