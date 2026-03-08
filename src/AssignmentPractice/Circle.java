package AssignmentPractice;

public class Circle {
	
	double radius;
	
	Circle(){
		radius=5;
		
		double Area=3.14*radius*radius;
		
		System.out.println(Area);
		
	}
	

	public static void main(String[] args) {
		/* Create a Circle Class with Constructor
Write a class called Circle that:
Has a non-static variable radius.
The class should have a constructor that initializes the radius of the circle.
Create a method calculate Area that calculates and returns the area of the circle (π * radius^2)*/

		new Circle();

	}

}
