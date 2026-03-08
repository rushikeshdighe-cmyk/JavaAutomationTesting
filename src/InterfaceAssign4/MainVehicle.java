package InterfaceAssign4;

public class MainVehicle {

	public static void main(String[] args) {
		Vehicle V1=new Car();
		V1.start();
		
		Fuel F1=new Car();
		F1.fuel(7638);
		
		Vehicle V2=new Bike();
		V2.start();
		
		Fuel F2=new Bike();
		F2.fuel(8494);


	}

}
