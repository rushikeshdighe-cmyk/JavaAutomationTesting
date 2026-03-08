package AssignmentPractice;

public class Car {
	
	String car;
	String model;
	int year;
	
	Car(String C,String M,int Y){
		
		car=C;
		model=M;
		year=Y;	
	}
	void displayCarInfo() {
		
		System.out.println("Car Mode: "+car);
		System.out.println("model: "+model);
		System.out.println("Year: "+year);
	}

	public static void main(String[] args) {
		/*Create a Car Class with Parameterized Constructor
Write a class called Car that:
Has three instance variables: make, model, and year.
The class should have a parameterized constructor that initializes all three variables.
Create a method displayCarInfo that prints the car's details.*/
		Car C1=new Car("Maruti","Baleno", 2022);
		C1.displayCarInfo();

	}

}
