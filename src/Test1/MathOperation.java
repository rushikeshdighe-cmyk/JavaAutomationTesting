package Test1;

public class MathOperation {

	static void multiplyNumbers(int a,int b) {
		
		int mul=a*b;
		
		System.out.println(mul);
	}
	
	void addNumbers(int c,int d) {
		
		int Add=c+d;
		System.out.println(Add);
		
	}
	
	public static void main (String[]args) {
		multiplyNumbers(12, 14);
		MathOperation M1=new MathOperation();
		
		M1.addNumbers(12, 13);
	}
}
