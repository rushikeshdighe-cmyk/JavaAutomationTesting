package EnacapsulationAssigngment;

public class MainEmployee {

	public static void main(String[] args) {
		
		Employee E=new Employee();
		E.SetEmpId(123);
		System.out.println("Employee ID is: "+ E.GetEpmId());
		
		E.SetSalary(85756.89);
		System.out.println("Salary is: "+ E.GetSalary());


	}

}
