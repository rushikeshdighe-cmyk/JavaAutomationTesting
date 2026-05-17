package EnacapsulationAssigngment;

public class MainStudent {

	public static void main(String[] args) {
		Student S=new Student();
		S.SetName("Mayur");
		System.out.println("Name of student: "+ S.GetName());
		
		S.SetAge(41);
		System.out.println("Age of the Student: "+ S.GetAge());


	}

}
