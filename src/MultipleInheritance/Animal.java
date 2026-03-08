package MultipleInheritance;

public class Animal implements Cat, Dog {

	@Override
	public void bark(String name) {
		System.out.println(name+" its eating");
		
	}

	@Override
	public void walk(String name) {
		System.out.println(name+" its Walking");
		
	}

}
