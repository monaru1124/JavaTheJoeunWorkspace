package code;

import java.util.Scanner;

public class MainDrive2 {

	public static void main(String[] args) {
//		설명
//		 - 키보드로 숫자 하나를 입력받자.
//		 - 해당 숫자에 3이나 6이나 9가 들어간다면 그 갯수만큼 짝! 으로 출력
//		 - 안들어간다면 그냥 원본 숫자를 출력
//
//		 Ex. 169 => 짝!짝!
//		 Ex. 127 => 127
		
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int inputNum = scan.nextInt();
		int count = 0;
		int numberBackUp = inputNum;
		
		while(true) {
			int findNumber = inputNum % 10 ;
			if(findNumber == 3 || findNumber == 6 || findNumber == 9) {
				count ++;
			}
			inputNum /= 10;
			
			if(inputNum == 0) break;
				

		}
		if(count == 0)
			System.out.println(numberBackUp);
		else {
			for(int i = 0 ; i < count ; i++)
				System.out.print("짝!");
		}
		
		
	}
}
