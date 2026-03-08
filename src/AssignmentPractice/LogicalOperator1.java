package AssignmentPractice;

public class LogicalOperator1 {

	public static void main(String[] args) {
		/* Check if a number is either negative or greater than 100 using the OR. Input: num = -3
        Condition: num < 0 || num > 100 Example Output: true */

		int num=-3;
		
		if (num<0||num>100) {
			
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}

	}

}
