package Conditionalstatement;

public class Switchcase3 {

	public static void main(String[] args) {
		//  Simple Calculator  
		//Take two numbers and an operator (`+, -, *, /`) as input. Use `switch` to perform the corresponding operation.
		 int a=3; 
		 int b=4;

		char operators= '+';
		
		switch (operators) {
		case '+': System.out.println("result "+ (a+b));
		break;
		case '-': System.out.println("Result "+ (a-b));
		break;
		case '*': System.out.println("Result "+ (a*b));
		break;
		case '/': System.out.println("Result "+ (a/b));
		break;
		
		default: System.out.println("Invalid operator");
			
		}

	}

}
