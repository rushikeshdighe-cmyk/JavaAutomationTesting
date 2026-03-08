package AssignmentPractice;

import java.util.Iterator;

public class ForLoop11 {

	public static void main(String[] args) {
		// Check if a number is prime using a for loop.
		
		int num=23;
		int count=0;
		
		for (int i = 0; i <num; i++) {
			
			if (num%i==0) {
				count++;
			}
			}
			if (count==2) {
				System.out.println("Prime Number");
			} else {
				System.out.println("Not Prime Number");

			}
		}

	}


