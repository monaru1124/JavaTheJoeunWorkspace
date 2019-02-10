package code;

public class MainDrive {

	public static void main(String[] args) {
		
//		개 한마리, 소 한마리를 만들자.
		
		Dog dog1 = new Dog();
		dog1.name = "바둑이";
		Cow cow1 = new Cow();
		
//		1. 개도 울도록, 소도 울도록.
		
		dog1.bark();
		cow1.bark();
		
//		작성이 잘 되고, 실행 도 잘 됨! => 개 -> 애완동물 -> 동물 : 동물이 물려준 기능도 갖고있다!
		
//		2. 개도 놀도록, 소도 놀도록.
		dog1.play(); // 잘 됨. : 개->애완동물 이 상속해준 메쏘드.
//		cow1.play(); // 불가능. : 소->가축->동물
		
		
//		3. 개도 일하고, 소도 일하도록.
//		dog1.work(); // 불가능. : 개 -> 애완동물 -> 동물. 족보에서 work를 물려주는 클래스가 없다.
		cow1.work(); // 가능. : 소 -> 가축. 가축이 work를 물려주므로 사용 가능.
		
		
//		임시로 만든 Temp 클래스를 객체화.
		Temp temp1 = new Temp();
		
		System.out.println(temp1);
		
		
//		두번째 개를 생성 : 바둑이
		Dog dog2 = new Dog();
		dog2.name = "바둑이";
		
		System.out.println(dog1.equals(dog2));
		
		
	}
	
}









