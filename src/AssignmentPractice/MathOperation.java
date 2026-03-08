package AssignmentPractice;

public class MathOperation {
/*Write a class called MathOperations with:
A static method multiplyNumbers that takes two integers as arguments and print the multiplication.
A non-static method addNumbers that adds two integers and prints the sum.*/
	
	static void multiplyNumber(int a,int b) {
		System.out.println(a*b);
	}
	void addNumber(int c,int d) {
		System.out.println(c+d);
	}

	public static void main (String[]args) {
		
		multiplyNumber(10,25);
		MathOperation M1=new MathOperation();
		M1.addNumber(12, 10);
	}
}
