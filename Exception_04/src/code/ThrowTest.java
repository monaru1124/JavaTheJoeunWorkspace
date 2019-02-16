package code;

public class ThrowTest {
	
//	내가 만들고 있는 클래스의 메쏘드가 위험소지 (예외 상황이 발생할 수) 있다!
	public void dangerWork(int number) throws Exception {
		
//		들어오는 숫자가 3의 배수라면 아주 심각하다!
		if (number % 3 == 0)
//			더 심각한 문제가 생기기 전에 강제로 예외를 실행
//			그 예외의 종류가 NullPointer
			throw new Exception();
		else
			System.out.println("정상 작동 합니다.");
		

		
	}

}
