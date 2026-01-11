package IterationStatement;

public class WhileLoop3 {

	public static void main(String[] args) {
		
		//Print the square of each number from 1 to 5

		int i=1;
		
		while(i<=5) {
			int square=i*i;
			
			System.out.println("square of "+ i+ "="+square);
			i++;
		}
	}

}
