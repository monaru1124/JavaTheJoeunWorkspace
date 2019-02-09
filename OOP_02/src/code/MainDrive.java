package code;

public class MainDrive {

	public static void main(String[] args) {
		
		
//		사용자 3명을 만들자.
		
//		1. 김성일 / 010-7894-5612 / 1985
//		2. 남초이 / 010-2345-6789 / 2005
//		3. 박소정 / 010-9876-5432 / 2000
		
//		책 2권을 만들자.
//		1. 개미 / 대여자 없음
//		2. 나무 / 대여자 없음
		
		
//		사용자
//		생년을 세팅할때는 올해보다 큰 숫자는 들어올 수 없게.
		
		User user1 = new User();
		
		user1.setName("김성일");
		user1.setPhoneNum("010-7894-5612");
		user1.setBirthYear(1985);
				
		User user2 = new User();
		
		user2.setName("남초이");
		user2.setPhoneNum("010-2345-6789");
		user2.setBirthYear(2005);
		
		User user3 = new User();
		

		user3.setName("박소정");
		user3.setPhoneNum("010-9876-5432");
		user3.setBirthYear(2000);
		
		
//		책
		
		Book b1 = new Book();
		
		b1.setTitle("개미");
		b1.returnBookToStore();
		
		
		
		Book b2 = new Book();
		
		b2.setTitle("나무");
		b2.returnBookToStore();
		
		
//		Sc1. 개미 책을 김성일님께 대여 처리.
		b1.setRentUser(user1);
		
//		Sc2. 개미 책에 대한 정보를 출력.  ==> 메쏘드 생성 in Book  => 출력의 경우 리턴 x
//		출력 내용 
//		1. 제목 : 개미
//		2. 대여자 : 김성일
//		2.1. 대여자가 없을 경우에는 "대여 가능합니다."
		
		b1.printBookInfo();
		
		
//		Sc3. 개미 책을 반납처리.
//		=> 빌려간 사람이 없도록
		
		b1.returnBookToStore();
		
		
//		Sc4. 박소정님에게 개미를 대여하고 책에 대한 정보 출력.
		b1.setRentUser(user3);
		
		b1.printBookInfo();
		
//		Sc5. 박소정님이 개미 책을 반납 처리.
//		setRentUser를 사용하니 무슨 기능인지 조금 헷갈린다.
//		  => 대여에 사용. 반납 X/
//		반납용 기능을 따로 추가
		
		b1.returnBookToStore();
		
		b1.printBookInfo();
		
//		Sc6. 남초이님에게 나무 책을 대여.
//		나무는 19금 도서라서 미성년자에게는 대여 불가.
//		책을 빌려줄때 나이를 검사하는 기능 추가.
		
//		0) 책의 속성 : 성인용인지 아닌지. 추가  => Book
		b2.setForAdult(true);
		
		
//		1) 사용자의 나이가 몇살인지? 받아내는 기능 => User에 메쏘드 추가
//		  => 이 사람이 지금 성인인지 아닌지.
		
		
//		2) 책을 빌려줄때 나이를 검사하는 기능 => setter 메쏘드에 추가
//		  => 성인이라면 대여가 가능.

		b2.setRentUser(user2);
		
		
		
	}
}
























