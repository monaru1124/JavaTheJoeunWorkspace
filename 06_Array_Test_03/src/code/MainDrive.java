package code;

import java.util.Scanner;

public class MainDrive {

	public static void main(String[] args) {
		
//		숫자 6개를 저장할 공간
		int[] userInputNumArray = new int[6];
		
//		숫자 입력받을 스캐너 선언
		Scanner scan = new Scanner(System.in);
		
//		
		for (int i = 0 ; i < userInputNumArray.length ; i++) {
			
			
//			숫자 입력 안내 메세지 띄우기
			System.out.print(String.format("%d번째 숫자 입력 : ", i+1));
			userInputNumArray[i] = scan.nextInt();
			
			
			
		}
		
		for (int i = 0 ; i < userInputNumArray.length ; i++) {
				
			System.out.println(userInputNumArray[i]);
		}
			
			
		
		
	}
}
