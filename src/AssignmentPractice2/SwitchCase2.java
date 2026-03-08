package AssignmentPractice2;

public class SwitchCase2 {

	public static void main(String[] args) {
		//Simple Calculator  
		//Take two numbers and an operator (`+, -, *, /`) as input. Use `switch` to perform the corresponding operation.

		int a=12;
		int b=13;
		
		char operator='*';
		
		switch (operator) {
		case '+': System.out.println(a+b);
		break;
		case '-': System.out.println(a-b);
		break;
		case '*': System.out.println(a*b);
		break;
		case '/': System.out.println(a/b);
		break;
		case '%': System.out.println(a%b);
		break;
		

		default:System.out.println("invalid");
			break;
		}
	}

}
