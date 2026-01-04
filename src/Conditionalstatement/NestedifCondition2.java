package Conditionalstatement;

public class NestedifCondition2 {

	public static void main(String[] args) {
		// Check Admission Eligibility  : A student is eligible for admission if:  - Marks ≥ 80, and   - Math score ≥ 75  If both conditions are met, print `"Eligible"`, otherwise print `"Not Eligible"`.  

		int totalmarks = 80;
		int mathscore =74;
		
		if (totalmarks>=80) {
			
			System.out.println("You are Eligible for Admission "+ totalmarks);
			
			if (mathscore>=75) {
				
				System.out.println("Math Score is eligible "+ mathscore);
				
			} else {
				
				System.out.println("Math Score is not eligible "+ mathscore);

			}
			
		} else {
			
			System.out.println("You are Not eligible for admission " + totalmarks);

		}

	}

}
