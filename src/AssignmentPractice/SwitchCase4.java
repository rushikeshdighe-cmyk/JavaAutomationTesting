package AssignmentPractice;

public class SwitchCase4 {

	public static void main(String[] args) {
		/*Simple Calculator  
Take two numbers and an operator (`+, -, *, /`) as input. Use `switch` to perform the corresponding operation*/
		int a=3;
		int b=7;
		
		char operator='*';
		
		switch (operator) {
		case '+':System.out.println("Operator:"+ (a+b));
		break;
		case '-':System.out.println("Operator:"+ (a-b));
		break;
		case '*':System.out.println("Operator:"+ (a*b));
		break;
		case '/':System.out.println("Operator:"+ (a/b));
		break;




		default:System.out.println("Invalid Inputs");
			break;
		}

	}

}
