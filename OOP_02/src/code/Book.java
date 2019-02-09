package code;

public class Book {

	private String title;
	private User rentUser;
	private boolean isForAdult; // 성인용 도서 여부.
	
	public void printBookInfo() {
//		출력 내용 
//		1. 제목 : 개미
//		2. 대여자 : 김성일
//		2.1. 대여자가 없을 경우에는 "대여 가능합니다."
		
		System.out.println(String.format("제목 : %s", this.title));
		if (this.rentUser == null) {
			System.out.println("대여 가능합니다.");
		}
		else {
			System.out.println(String.format("대여자 : %s", this.rentUser.getName()));
		}
		
	}
	
//	책 반납 메쏘드
	public void returnBookToStore() {
		
		this.rentUser = null;
		
		System.out.println(String.format("%s 책의 반납이 완료되었습니다.", this.title));
		
	}
	

	
	
	
	
	
	
	
//	getter / setter
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	
	public User getRentUser() {
		return rentUser;
	}
	public void setRentUser(User rentUser) {
		
//		빌리려는 사람이 성인일때만 대여처리,
//		아니라면 대여실패 메세지.
		if(rentUser.isAdult()) {
			this.rentUser = rentUser;
			System.out.println("대여 처리 되었습니다.");
		}
		else {
//			미성년자인 경우. 대여를 해주면 안됌!
			System.out.println("미성년자여서 대여가 불가합니다.");
			
		}
	}

	public boolean isForAdult() {
		return isForAdult;
	}

	public void setForAdult(boolean isForAdult) {
		this.isForAdult = isForAdult;
	}

	
	
}
