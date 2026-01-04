package Conditionalstatement;

public class NestedifCondition3 {

	public static void main(String[] args) {
		// Check if a person can enter a club
		//A person can enter if:
			//Age ≥ 18, and Has a membership card Print "Entry Allowed" or "Entry Denied".

		int age = 17;
		boolean istrue = true;
		
		if (age>=18) {
			
			System.out.println("Allowed entry");
			
			if (istrue==true) {
				
				System.out.println("Has Membership");
				
			} else {
				
				System.out.println("Not have Membership");

			}
			
		} else {
			
			System.out.println("Denied entry");

		}

	}

}
