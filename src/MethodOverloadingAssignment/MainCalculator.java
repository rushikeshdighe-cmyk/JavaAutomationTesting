package MethodOverloadingAssignment;

public class MainCalculator {

	public static void main(String[] args) {

		Calculator C1=new Calculator();
		System.out.println(C1.add(12, 13));
		System.out.println(C1.add(12.4, 13.5));
		System.out.println(C1.add(12, 13, 14));
		System.out.println(C1.add("Aishwarya", "Rushikesh"));
		
	}

}
