package AssignmentPractice2;

public class NestedifCondition {

	public static void main(String[] args) {
		//Check if a number is positive and even  
		
		int a=2;
		
		if (a>0) {
			System.out.println("postive Number");
			if (a%2==0) {
				System.out.println("even Number");
			} 
			else {
				System.out.println("odd Numbers");
			}
		} 
		else {
			System.out.println("Negative Number");

		}
	}

}
