package AssignmentPractice;

public class Person {
	
	String name;
	int age;
	
	Person(){
		
		name="rushikesh";
		age=30;
	}
	
	void greet() {
		
		System.out.println("Your Name is: "+name);
		System.out.println("Your Age is: "+age);
	}

	public static void main(String[] args) {
		/* Create a Person Class with Constructor
		Write a class called Person that:
			Has two instance variables: name and age.
			The class should have a constructor that initializes both name and age.
			Create a method greet that prints a greeting message using the person's name and age.*/

		Person P1 =new Person();
		P1.greet();

	}

}
