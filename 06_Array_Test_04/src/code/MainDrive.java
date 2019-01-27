package code;

import java.util.Scanner;

public class MainDrive {

	public static void main(String[] args) {
		
//		※ 연습
//		사용자에게 정수 6개를 입력받아서 배열로 저장.
//		배열의 이름 : userLottoNumArray
//
//
//		※ 응용
//		 - 입력값은 1~45만 허용. 만약 다른 숫자가 들어오면 다시 입력하도록.
//		 - 만약 중복된 값이 들어와도 다시 입력하도록.
		
		int[] userLottoNumArray = new int[6];
		
		Scanner scan = new Scanner(System.in);
		
		int test = 0;
		
		
		for (int i = 0 ; i < userLottoNumArray.length ; i++) {
			while (true) {
				
//				몇번쨰 숫자를 입력하고 있는지 안내메세지
				System.out.print(String.format("%d번쨰 로또 번호 입력 : ",i+1));
				
				int userInput = scan.nextInt();
//				userLottoNumArray[i] = scan.nextInt();
				
				
//				받은 숫자가 조건에 맞는가? 맞다면 while문을 탈출하도록.
				
//				1~45사이의 숫자? 1<=변수 && 변수 <=45
				
				boolean numberRangeOk = userInput > 0 && userInput < 46 ;
				
//				중복된 숫자가 없어야 OK!
				boolean isNotDuplicated = true;
				
//				실제로 중복이 되는지 아닌지를 검사하는 logic
//				10, 20 => 20
				
//				입력되어있는 배열을 전부 조회
				
				for(int j=0 ; j < userLottoNumArray.length ; j++) {
//					배열에 적힌 숫자가 입력값과 같은지?
					if(userLottoNumArray[j]==userInput) {
//						같은걸 찾았다면 중복으로 값을 변환하고 break;로 빠져나옴.
						isNotDuplicated = false ;
						break;
					}
				}
				
				
//				두 가지 조건 만족여부에 
				if(numberRangeOk && isNotDuplicated) {
					
					userLottoNumArray[i] = userInput ;  // 조건 맞는 값 입력
					if(i==5) {
						break;
					}
					else {
						System.out.println("다음숫자를 입력합니다.");
						break;
					}
					

														
				}
				else {
					System.out.println("다시입력하세요");
				}
				
			
				
			}
		}
			
		
		
		
//		출력
		for (int i = 0 ; i < userLottoNumArray.length ; i++) {
			System.out.print(userLottoNumArray[i]+" ");						
		}
		
	}
}
