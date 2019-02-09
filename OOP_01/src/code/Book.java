package code;

public class Book {

//	책의 고ㅠ 속성
	private boolean isNewBook;
	private String title;
	private String authorName;

	private String ISBN;

	private User rentUser = null;  // 대여가 되었는지? -> 빌린 사람이 누구인지?
//	빌려간 사람이 null : 빌려간 사람이 없다!
	
//	책의 고유 기능.
	
//	빌려간 사람의 정보를 출력
	void printRentUserInfo() {
		
//		1. 빌려간 사람이 있는경우, 2. 빌려간 사람이 없는 경우
		if (rentUser != null) {
//			빌려간 사람이 있다!
			rentUser.pringUserInfo();
			
		}
		else {
//			빌려간 사람이 없는 경우.
			
//			rentUser.pringUserInfo(); //error 발생
			System.out.println("빌려간 사람이 없습니다!");
			
		}
		
		
	}
	
//	빌려간 사용자를 세팅하는 setter
	public void setRentUser(User rentUser) {

//		대여가 가능한 상태에서만 대여를 실행
//		대여가능? 빌려간 사람이 없는 경우.
		if(this.rentUser == null) {
//			빌려간사람이 없는 경우
			
			
//			빌려가려는 사람의 나이가 20세 이상이어야만 세팅.
//			이하일 경우 실패 메세지를 출력
			
//			빌리려는 사람이 20세 이상인 경우
			if(rentUser.calcualteAge(2019) >=20 ) {
//				빌려간 사람을 세팅.
				this.rentUser = rentUser;
				
			}
			else {
//				미성년자인 경우
				System.out.println("대여에 실패했습니다.");
				System.out.println("나이가 너무 어립니다.");
				
			}
		}
		else {
//			이미 누가 빌려가서 대여 불가
			System.out.println("대여에 실패했습니다.");
			System.out.println(String.format("이미 %s 이(가) 빌려갔습니다.", this.rentUser.name) );
			
		}

		

		
	}
	
//	빌려간 사용자 객체를 반환(return)해주는 getter
	
	public User getRentUser() {
		return rentUser;		
	}

	public boolean isNewBook() {
		return isNewBook;
	}

	public void setNewBook(boolean isNewBook) {
		this.isNewBook = isNewBook;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	
	
	
	
	
	
	
	
}










