package AssignmentPractice;

public class Rectangle {
	
	/*Create a class called Rectangle that contains a parameterized method called calculateArea:
The static method should take two parameters: the length and width of the rectangle.
The static method should return the area of the rectangle (length * width).*/
	
	public static double calculateArea(double lenght,double Width) {
		
		double area=lenght*Width;
		System.out.println(area);
		
		return area;
		
	}
	public static void main (String[]args) {
		
		calculateArea(26.2,74.9);
	}
}
