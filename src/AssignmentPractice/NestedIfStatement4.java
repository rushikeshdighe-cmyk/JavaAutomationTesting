package AssignmentPractice;

public class NestedIfStatement4 {

	public static void main(String[] args) {
		/*Check if a person can enter a club
A person can enter if:
Age ≥ 18, and Has a membership card Print "Entry Allowed" or "Entry Denied".*/
		int age=18;
		boolean istrue=true;
		
		if (age>=18) {
			System.out.println("Entry Allowed");
			if (istrue==true) {
				System.out.println("Has Membership");
			} else {
				System.out.println("Don't have Membership");

			}
		} 
		else {
			System.out.println("Entry Denied");

		}


	}

}
