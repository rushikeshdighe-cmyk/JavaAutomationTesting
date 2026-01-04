package Conditionalstatement;

public class NestedIfCondition {

	public static void main(String[] args) {
		// Check if a number is positive and even  
		
		int a = -35;
		
		if (a>0) {
			
			System.out.println("postive Number");
			if (a%2==0) {
				
				System.err.println("Even Number");
				
			}
			else {
				System.out.println("Number is ODD");
			}
		}
		else {
			System.out.println("Negative Number");
		}


	}

}
