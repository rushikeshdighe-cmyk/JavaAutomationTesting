package MethodOverridingAssignment1;

public class MainVehicle {

	public static void main(String[] args) {


	Vehicle V;
	
	V=new Car();
	
	 V.speed(220);
	
	
	V =new Bike();
	
	V.speed(180);
	
	}

}
