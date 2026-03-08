package AssignmentPractice;

public class UnaryOperator2 {

	public static void main(String[] args) {
		// Use both Increment (++) and Decrement (--) operators together in an expression. ++a - --b + a-- - b++;

		int a=5;
		int b=7;
		
		int sum = ++a - --b+a-- - b++; // 6 - 6+6 - 6=0

		System.out.println(sum);
	}

}
