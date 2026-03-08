package AssignmentPractice2;

public class IfElseIfCondition {

	public static void main(String[] args) {
		//Take a student's marks as input and print their grade:  
		//`90-100` → `"A+"`   - `80-89` → `"A"`   - `70-79` → `"B"`   - `60-69` → `"C"`   - `< 60` → `"Fail"`

		int marks=80;
		
		if (marks>=90) {
			
			System.out.println("A+ Grade");
			
		}
		else if (marks>=80) {
			System.out.println("A Grade");
			
		}
		else if (marks>=70) {
			System.out.println("B Grade");
		}
		else if (marks>=60) {
			System.out.println("C Grade");
		}
		else {
			System.out.println("Fail");
		}
	}

}
