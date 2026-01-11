package IterationStatement;

public class WhileLoopOddNumbers200to300 {

	public static void main(String[] args) {

		//Print odd numbers from 200 to 300


		int i=200;
		
		while(i<=300) {
			
			if (i%2!=0) {
				
				System.out.println(i);
				
			}
			i++;
		}
	}

}
