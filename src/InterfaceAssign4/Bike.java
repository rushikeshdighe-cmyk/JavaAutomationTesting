package InterfaceAssign4;

public class Bike implements Vehicle, Fuel {

	@Override
	public void fuel(int litre) {
		System.out.println("Bike refueled with "+litre+ " liters");	
	}

	@Override
	public void start() {
		System.out.println("Bike is starting with key ignition");		
	}

}
