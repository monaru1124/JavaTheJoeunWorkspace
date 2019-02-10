package code;

public class Dog extends Animal {

	
	
	public Dog() {
		super("바둑이", 2019, true);
	}


	public void goWalk() {
		System.out.println("개가 산책을 나갑니다!");
	}
	
	
	@Override // Annotation : 어노테이션.
	void bark() {
//		super.bark(); // 부모가 가진 bark를 실행
		
		
		System.out.println("왈왈!");
		
	}
	
}
