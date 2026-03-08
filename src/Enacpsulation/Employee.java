package Enacpsulation;

public class Employee {
	
	private String empid;
	private double Salary;
	
	public void setempid(String Id) {
		empid=Id;
	}
	
	public String getempid() {
		
		return empid;
	}

	public void setsalary(double sal) {
		
		Salary=sal;
	}
	
	public double getsalary() {
		
		return Salary;
	}
}
