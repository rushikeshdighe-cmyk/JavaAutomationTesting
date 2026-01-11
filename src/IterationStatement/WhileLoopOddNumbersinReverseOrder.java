package IterationStatement;

public class WhileLoopOddNumbersinReverseOrder {

	public static void main(String[] args) {
		
		//Print Even Numbers Between 1 and 50 in reverse order

		int i=50;
		
		while(i>=0) {
			
			if (i%2!=0) {
				
				System.out.println(i);
				
			}
			i--;
		}
	}

}
