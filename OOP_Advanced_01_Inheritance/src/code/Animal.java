package code;

public class Animal {

	String name;
	int birthYear;
	boolean gender;
	
	
	

	public Animal() {
		super();
	}


	public Animal(String name, int birthYear, boolean gender) {
		super();
		this.name = name;
		this.birthYear = birthYear;
		this.gender = gender;
	}




	void bark() {
		System.out.println("운다!");
	}
	
}
