package corejava;

import java.util.Scanner;

public class TwoIntegerConcate {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("First Integer: ");
		int num1 = sc.nextInt();
		
		System.out.println("Second Integer: ");
		int num2 = sc.nextInt();
		
		String result = String.valueOf(num1) + String.valueOf(num2);
		
		System.out.println("Concatenated Result: " + result);
		
		sc.close();
		
		
		

	}

}
