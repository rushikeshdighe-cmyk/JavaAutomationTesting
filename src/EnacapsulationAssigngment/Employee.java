package EnacapsulationAssigngment;

public class Employee {
	private int EmpId;
	private double Salary;
	
	void SetEmpId(int Id)
	{
		EmpId=Id;
	}
	int GetEpmId()
	{
		return EmpId;
	}
	
	void SetSalary(double Sal)
	{
		Salary=Sal;
	}
	double GetSalary()
	{
		return Salary;
	}

}
