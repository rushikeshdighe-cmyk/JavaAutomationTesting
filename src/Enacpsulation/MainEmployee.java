package Enacpsulation;

public class MainEmployee {

	
	public static void main(String[] args) {
		
		Employee E1=new Employee();
		E1.setempid("ABC234");
		E1.setsalary(78393.33);
		System.out.println( E1.getempid());
		System.out.println(E1.getsalary());
	}

	
}
