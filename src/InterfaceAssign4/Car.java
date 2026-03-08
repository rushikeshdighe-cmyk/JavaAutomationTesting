package InterfaceAssign4;

public class Car implements Vehicle, Fuel {

	@Override
	public void fuel(int litre) {
		
		System.out.println("Car refueled with "+litre+ " liters");	
	}

	@Override
	public void start() {
		System.out.println("Car is starting with key ignition");	
	}

}
