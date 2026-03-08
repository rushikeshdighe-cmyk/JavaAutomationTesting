package AssignmentPractice;

public class OperatorAssignment2 {

	public static void main(String[] args) {
		// Given a = 8 and b = 3, write a Java expression to evaluate (a * b) + (a / b) - (a % b). What will be the output?
		
		int a=8;
		int b=3;
		
		int sum = (a*b)+(a/b)-(a%b); //8+3 + 8/3 - 8%3 =24 + 2.6 - 2.6
		
		
		System.out.println(sum);
		

	}

}
