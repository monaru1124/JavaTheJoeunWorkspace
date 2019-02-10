package code;

public class MainDrive {

	public static void main(String[] args) {
	
//		Animal a1 = new Animal(); => 추상메쏘드는 바로 객체화 할 수 없다.
		
		Dog dog1 = new Dog();
		Cat cat1 = new Cat();
		
//		개와 고양이가 노는 방법.
		dog1.play();
		cat1.play();
		
		dog1.bark();
		cat1.bark();
		
		
	}
	
}
