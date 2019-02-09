package code;

public class User {

//	사용자의 고유 속성들을 변수로
	String name;
	int birthYear;
	String phoneNum;
	boolean gender;
	
//	사용자의 고유 기능들을 메쏘드로.
	
	
//	사용자 정보를 출력 => 결과를 반환하지 않는다.
//	따로 재료를 입력받지 않을 것임.
	void pringUserInfo() {
				
		System.out.println(String.format("제 이름은 %s입니다.", name));
		System.out.println(String.format("연락처는 %s입니다.", phoneNum));
		
		
	}
	
//	나이를 계산해서 결과로 돌려주기.
//	기준이 되는 년도를 재료로 준다. Ex. 2017년에 몇살이었나?
	int calcualteAge(int year) {
		int result=0;
		
//		나이를 계산하는 코드를 작성.
		
//		1988년생 -> 2017년에 30살.
//		2017-1988+1 = 30
		
		result = year - birthYear + 1;
		
		
		
		return result;
	}
}
