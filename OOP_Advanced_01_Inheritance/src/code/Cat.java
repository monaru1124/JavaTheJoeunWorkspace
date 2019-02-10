package code;

public class Cat extends Animal {

//	고양이의 bark는 야옹! 으로 기능 수정.
	
	@Override
	void bark() {

		super.bark();
		
		System.out.println("야옹!");
	}
	
}
