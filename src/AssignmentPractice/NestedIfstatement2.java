package AssignmentPractice;

public class NestedIfstatement2 {

	public static void main(String[] args) {
		// Check Admission Eligibility  : A student is eligible for admission if:  - Marks ≥ 80, and   - Math score ≥ 75  If both conditions are met, print `"Eligible"`, otherwise print `"Not Eligible"`.  */

		int totalscore=90;
		int mathscore=70;
		
		if (totalscore>=80) {
			System.out.println("A Student is eligible for Admision");
			
			if (mathscore>=75) {
				System.out.println("Math score is eligible");
				
			} 
			else {
				System.out.println("Math score is not Eligible");

			}
		} 
		
		else {
			System.out.println("Not Eligible for Admission");

		}

	}

}
