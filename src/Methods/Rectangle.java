package Methods;

public class Rectangle {
	
	public static double calculateArea(double length ,double width) {
		
		double area=length*width;
		
		return area;
	}

	public static void main (String[] args) {
		
		System.out.println("Result "+calculateArea(12, 15));
		
	}
}
