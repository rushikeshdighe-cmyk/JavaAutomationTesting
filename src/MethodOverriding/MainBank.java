package MethodOverriding;

public class MainBank {

	public static void main(String[] args) {
		Banking b;
		
		b=new SBI();
		
		System.out.println("Rate of Interest of SBI: "+ b.getRateofinterest());
		
		b= new ICICI();
		
		System.out.println("Rate of Interest of ICICI: "+ b.getRateofinterest());
		
		b=new AXIS();
		
		System.out.println("Rate of Interest of ICICI: "+ b.getRateofinterest());

	}

}
