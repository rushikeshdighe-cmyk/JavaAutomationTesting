package MethodOverloadingAssignment2;

public class Printer {

	void datatypes(int num) {
		
		System.out.println(num);
	}
	
	void datatypes(double num) {
		
		System.out.println(num);
	}
	void datatypes(String text) {
		System.out.println(text);
	}
	void datatypes(boolean flag) {
		System.out.println(flag);
	}
}
