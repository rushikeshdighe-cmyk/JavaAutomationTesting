package AssignmentPractice;

import java.util.Iterator;

public class Forloop8 {

	public static void main(String[] args) {
		// print the sum of odd numbers 1 to 100.

		int sum=0;
		
		for (int i = 1; i <=100; i++) {
			
			if (i%2!=0) {
				sum=sum+i;
				System.out.println(sum);
			}
					
				
			}
		}

	}


