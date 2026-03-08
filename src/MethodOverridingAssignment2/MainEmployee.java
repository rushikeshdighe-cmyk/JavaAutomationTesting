package MethodOverridingAssignment2;

public class MainEmployee {

	public static void main(String[] args) {
		Employee E;
		
		E=new Manager();
		System.out.println("Salary of Manager: "+ E.calculateSalary());

		E=new Developer();
		System.out.println("Salary of Developer: "+ E.calculateSalary());

	}

}
