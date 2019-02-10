package code;

import java.util.Calendar;
import java.util.Scanner;

public class MainDrive {

	public static void main(String[] args) {
//		카드를 두장. 스페이드 A, 하트 7
		
		Card c1 = new Card("스페이드", 1);
		Card c2 = new Card("하트", 7);
		
//		정수 두개 (i1, i2)를 만들고, 각각 10과 20을 대입.
		int i1 = 10; // 변수를 만들면서 값도 같이 대입 : 초기화
		int i2 = 20;
		
//		사용자에게 키보드 입력을 받는 스캐너 생성.
//		생성자 사용 예시.
		Scanner scan = new Scanner(System.in);
		
//		사용자 한명을 만들자. p1
		Player p1 = new Player();
		p1.setName("조경진");
		p1.setBirthYear(1988);
		
		p1.printPlayerInfo();
		p1.printPlayerInfo(true);
		
//		Calendar 클래스의 오버로딩 예시.
		Calendar today = Calendar.getInstance();
//		날짜 세팅. 2000/01/01
		today.set(2000, 0, 1);
		
		
	}
}

















