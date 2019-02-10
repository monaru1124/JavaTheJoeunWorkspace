package code;

public class MainDrive {

	public static void main(String[] args) {
//		개 한마리를 만들고, 짖도록.
		Dog dog1 = new Dog();

//		Animal이 물려준 속성을 바로 활용
//		dog1.name = "바둑이";
//		Animal이 물려준 기능을 바로 활용
		dog1.bark();
//		개만의 고유 기능으로서 활용 가능.
		dog1.goWalk();
		
		System.out.println("개의 이름 : " + dog1.name);
		
//		고양이 한마리를 만들고 짖도록.
		Cat cat1 = new Cat();
//		Animal이 물려줘서 사용가능.
		cat1.bark();
//		고양이를 산책나가도록.
//		cat1.goWalk(); => 개만의 고유기능으로 작성된 메쏘드 이므로 고양이는 사용불가.
		
		
	}
}
