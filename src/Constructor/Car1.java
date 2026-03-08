package Constructor;

public class Car1 {
	
	String Make;
	String Model;
	int year;
	
	Car1(String Make,String Model,int year){
		
		this.Make=Make;
		this.Model=Model;
		this.year=year;
		
	}
	public void displayCarInfo() {
		
		System.out.println("Company: "+Make);
		System.out.println("Model: "+Model);
		System.out.println("year: "+year);
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car C1=new Car("Maruti", "Baleno", 2026);
		C1.displayCarInfo();
	}

}
