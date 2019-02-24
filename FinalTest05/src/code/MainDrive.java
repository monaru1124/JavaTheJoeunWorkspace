package code;

import java.util.Random;
import java.util.Scanner;

public class MainDrive {

	public static void main(String[] args) {
		
//		설명
//
//		사용자에게 6개의 숫자를 입력 받자. (1~45의 숫자, 중복 허용 안함)
//
//		랜덤으로 6개의 당첨 숫자 생성 (1~45의 숫자, 중복 허용 안함)
//
//		두 개의 숫자 배열을 가지고 비교해서 등수 출력
//		6개 다 맞추면 1등, 5개 3등, 4개 4등, 3개 5등, 그 이하는 꽝!
//
//		※ 숫자를 정렬하는 기능 => 풀떄는 제외, 도전문제로.
		Scanner scan = new Scanner(System.in);
		int[] inputNum = new int[6];
				
		for(int i = 0 ; i < 6 ; i++) {
			
			while(true) {
				System.out.print(String.format("%d번째 숫자 입력 : ", i+1));
				
				int tempInput = scan.nextInt();
				
				boolean isRangeOk = ( 1 <= tempInput) && (tempInput <=45);
				
				if(!isRangeOk) {
					System.out.println("잘못된 범위의 숫자입니다.");
					System.out.println("다시 입력해주세요.");
					continue;					
				}
				
				boolean isDuplicate = false; //중복 되었는지?
				
				for(int j = 0; j < inputNum.length ; j++) {
					if(tempInput == inputNum[j]) {
						isDuplicate = true;
						break;
					}
						
				}
				if(isDuplicate) {
					System.out.println("중복된 숫자를 발견했습니다.");
					System.out.println("다시 입력해주세요.");
					continue;
				}
				
				if(isRangeOk && !isDuplicate) {
					inputNum[i] = tempInput;
					break;
				}
				
				
			}

			
			
			
		}
		
	

		
		int[] abc = new int[6];
		
		for(int i = 0 ; i < 6 ; i++ ) {

			
			
			while(true) {
//				Random 숫자를 만드는 두가지 방법.
//				1) Math.random()
//				2) Random.nextInt => static이 아니라서, 랜덤 변수를 하나 생성
				Random r = new Random();
				int randomNum = r.nextInt(45) +1;
				
				boolean isDuplicate = false;
				
				for(int j = 0 ; j < 6; j++) {
					if(abc[j] == randomNum)	{
						isDuplicate = true;
						break;
					}
				}	
				
				if(!isDuplicate) {
					abc[i] = randomNum;
					break;
				}			
			}
			System.out.println(String.format("%d번째 당첨 숫자 : %d",i+1,abc[i]));	
		}
		
		
		int count = 0 ;
		
		for(int i = 0 ; i < inputNum.length ; i++) {
			
			for(int j = 0 ; j < abc.length ; j++) {
				
				if(inputNum[i] == abc[j]) {
					System.out.print(abc[j]+ " ");
					count++;
				}
				
			}			
		}

		if(count == 6) {
			System.out.println("1등");
			
		}
		else if(count == 5) {
			System.out.println("3등");
		}
		
		else if(count ==4) {
			System.out.println("4등");
		}
		
		else if(count ==3) {
			System.out.println("3등");
		}
		
		else {
			System.out.println("당첨 x");
		}	
		
	}
}
