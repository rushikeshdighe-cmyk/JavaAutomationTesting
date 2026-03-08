package AssignmentPractice;

public class ElseifStatement3 {

	public static void main(String[] args) {
		/*Find the largest of three numbers  : Take three numbers as input and find the largest number*/
		
		int a=100;
		int b=101;
		int c=200;
		
		if (a>b && a>c) {
			System.out.println("Largest Number "+a);
			
		}
		else if (b>c && b>a) {
			System.out.println("Largest Number"+b);
		}
		else {
			System.out.println("Largest Number"+c);
		}
	
		

	}

}
