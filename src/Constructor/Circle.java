package Constructor;

import java.security.PublicKey;

public class Circle {
	double radius;
	
	Circle(){
		
		radius=5;
	}
		void calculateArea() {
			
			double area= 3.14*radius*radius;
			
		System.out.println(area);	
			
		}
		

	public static void main(String[] args) {

		Circle c1=new Circle();
		
		c1.calculateArea();
	}

}
