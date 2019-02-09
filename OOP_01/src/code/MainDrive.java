package code;

public class MainDrive {

	public static void main(String[] args) {
		
//		만들어둔 사용자를 무대 위로 올리자.
		
		User user1 = new User();
		User user2 = new User();
		
//		첫번째 사용자의 속성들을 정의.
		user1.name = "강지은";
		user1.phoneNum = "010-1234-5678";
		
//		두번째 사용자의 이름 : 김미송, 폰번 : 010-9876-5432		
		user2.name = "김미송";
		user2.phoneNum = "010-9876-5432";
		
//		첫번째 사용자의 정보를 출력
		user1.pringUserInfo();
		
//		두번째 사용자의 정보를 출력
		user2.pringUserInfo();
		
		
//		세번째 사용자 : 조경진 / 010-5112-3237 / 1988
		
		User user3 = new User();
		
		user3.name = "조경진";
		user3.phoneNum = "010-5112-3237";
		user3.birthYear = 1988;
		
//		2019년 3번 사용자의 나이를 계산해서 화면에 출력
		int user3Age = user3.calcualteAge(2019);
		
		System.out.println(user3Age);
		
		
//		책 한권을 무대로 올리자.
		Book book1 = new Book();
		book1.setTitle("드래곤볼");
		
		book1.printRentUserInfo();
		
		book1.setRentUser(user3);
		// 3번 사용자가 1번 책을 빌려감!
		
		book1.printRentUserInfo();
		
		
//		2번 사용자의 생년 : 2010년생.
		user2.birthYear = 2010;
				
		Book book2 = new Book();
		book2.setTitle("19금도서");
		
		book2.setRentUser(user2);
		
		book2.printRentUserInfo();
		
		book2.setRentUser(user3);
		
		book2.printRentUserInfo();
		
//		1번 사용자의 나이를 성인으로 세팅.
		user1.birthYear = 1993;
		
//		user3이 책을 반납하기 전에는 책방에 책이 없으니 대여에 실패해야함!
		
		book2.setRentUser(user1);
		
		book2.printRentUserInfo();
		
		
		
		
	}
}




















