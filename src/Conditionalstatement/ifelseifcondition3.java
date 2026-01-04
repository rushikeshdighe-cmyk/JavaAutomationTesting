package Conditionalstatement;

public class ifelseifcondition3 {

	public static void main(String[] args) {
		// Find the largest of three numbers  : Take three numbers as input and find the largest number.

		int a=23;
		int b=83;
		int c=53;
		
		if (a>=b && a>=c) {
			
			System.out.println("largest number " + a);
			
		}
		else if (b>=a && b>=c) {
			
			System.out.println("Largest Number " + b);
			
		}
		else {
			System.out.println("Largest Number " + c);
		}

	}

}
