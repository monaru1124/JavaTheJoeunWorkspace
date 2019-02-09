package code;

import java.util.Calendar;

public class User {

	private String name;
	private int birthYear;
	private String phoneNum;
	
	
	
//	"현재" 이 사람이 20살 이상인지?
	public boolean isAdult() {
		boolean result = false;
		
//		코드가 실행되는 현재 시간을 today에 저장.
//		today의 날짜 : 2019-02-09
		Calendar today = Calendar.getInstance();
		
//	  	today의 날짜 : 2002-02-09로 세팅됨.
		today.set(Calendar.YEAR, 2002);
		
//		today의 날짜 : 2002-04-09로 세팅됨.
//		※ JAVA에서는 월을 처리할 때 0에서 11월이 있다라고 처리함.
		today.Set(Calendar.MONTH, 3);
		
//		today의 날짜 : 2002-04-25로 세팅딤.
		today.set(Calendar.DAY_OF_MONTH, 25);
		
		
//		today라는 Calendar클래스가 가진 정보들 중에서 
//		YEAR에 해당하는 값을 뽑아다 int todayYear에 저장.
		int todayYear = today.get(Calendar.YEAR);
		
//		나이를 계산
		int userAge = todayYear - this.birthYear + 1;
		
//		나이가 20세 이상이면 성인, 아니면 거짓으로.
		if(userAge >=20) {
			result = true;
		}
		else {
			result = false;
		}
		
		
		
		return result;
	}
	
	
	
	
	
//	getter / setter
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public int getBirthYear() {
		return birthYear;
	}
	public void setBirthYear(int birthYear) {
		
//		재료로 들어오는 birthYear가 현재 년도보다 큰지?
		if(birthYear > 2019) {
//			잘못된 입력
			System.out.println("생년을 잘못 입력했습니다.");
			System.out.println("2019 이하의 숫자를 입력해주세요.");
		}
		else {
			this.birthYear = birthYear;
		}
		
	}
	
	
	public String getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	
}
