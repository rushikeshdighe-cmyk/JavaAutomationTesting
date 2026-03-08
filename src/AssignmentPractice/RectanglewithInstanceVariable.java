package AssignmentPractice;

public class RectanglewithInstanceVariable {
	
	//Write a Java program to calculate the area of a rectangle using instance variables for length and width
	
	 double length=15;
     double width=10;
	
	void calculateRectangle() {
		
		double area= length*width;	
		
		System.out.println(area);
		
	}

	public static void main(String[] args) {
		

		RectanglewithInstanceVariable c1 = new RectanglewithInstanceVariable();
		c1.calculateRectangle();
	}

}
