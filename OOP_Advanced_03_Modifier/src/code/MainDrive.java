package code;

import java.util.Scanner;

import code.bank_datas.User;
import code.datas.Cat;
import code.datas.Dog;

public class MainDrive {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
//		개 한마리를 생성, 이름을 아롱이
		Dog dog1 = new Dog();
		dog1.setDogName("아롱이"); // 가능. setDogName 메쏘드에 접근을 허가해줘서. public
//		dog1.name = "아롱이"; // 불가능. 접근제어자가 name변수에 접근을 허가하지 않아서
		
		dog1.nickName = "임시";
		
		
//		고양이 한마리 생성
		Cat cat1 = new Cat();
		
		
//		사용자 2명. 조경진, 최수호
		User user1 = new User();
		
		
		User user2 = new User();
		
//		최수호라는 사람이 로그인. => 조경진의 계좌에 접근 가능 => 잔고를 -50억
		
		
	}
}
















