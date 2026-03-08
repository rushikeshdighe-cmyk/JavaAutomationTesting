package AssignmentPractice;

public class MaxNumber {
	
	/*Write a class called MaxNumber that contains a parameterized method called findMax:
The method should take three integer parameters.     
The method should find the largest of the three numbers.*/
	
	public static void findMax(int a,int b,int c) {
		
		if (a>=b && a>=c) {
			System.out.println("Larager Number"+a);
			
		}
		if (b>=c && b>=a) {
			System.out.println("larager Number"+ b);
		} 
		else {
			System.out.println("Larger Number"+c);

		}
	}
	public static void main(String[]args) {
		
		findMax(10,12,14);
	}


}
