package IterationStatement;

public class DoLoopSquareofeachNumber1to5 {

	public static void main(String[] args) {


		int i=1;
		int square=0;
		
		do {
			
			square=i*i;
			
			System.out.println(square);
			
			i++;
			
		} while (i<=5);
	}

}
