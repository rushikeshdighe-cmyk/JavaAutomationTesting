package Constructor;

public class Car {
	
	String make;
	String model;
	int year;
	
	Car(String m, String n, int o){
		
		make=m;
		model=n;
		year=o;
		
	}
	void displayCarInfo() {
		
		System.out.println("Car Make: "+ make);
		System.out.println("Car Model: "+ model);
		System.out.println("Year: "+ year);
	}
	public static void main(String[] args) {
		
		Car C1=new Car("Maruti","Baleno",2022);
		C1.displayCarInfo();


	}

}
