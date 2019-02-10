package code;

public class Dog extends Pet {

	@Override
	public boolean equals(Object obj) {
		
		Dog compareDog = (Dog) obj;
		
		boolean result = false;
		
		if (this.name.equals(compareDog.name)) {
			result = true;
		}
		
		
		return result;
	}
}
