package MethodOverloading;

public class DifferentSequence {

	void display(int a,String name) {
		System.out.println("First int Value: "+a+" Second String Value: "+name);
	}
	
	void display(String name, int a) {
		
		System.out.println("First Value is String: "+name+" Second value is int: "+ a);
	}
}
