package Abstraction;

public class VehicleMain {

	public static void main(String[] args) {
		Vehicle V1=new Car();
		V1.startEngine();
		V1.stopengine();
		
		Vehicle V2=new Bike();
		V2.startEngine();
		V1.stopengine();


	}

}
