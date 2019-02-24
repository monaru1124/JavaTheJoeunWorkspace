package code;

import java.util.Scanner;

public class MainDrive {

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
		
		int[] a = new int[3];
		
		a[0] = inputNum % 10;
		a[1] = (inputNum / 10) % 10;
		a[2] = inputNum / 100;
		
		int count = 0;
		
		for(int i = 0 ; i < 3 ; i++ ) {
			if(a[i] == 3 || a[i] == 6 || a[i] == 9) {
				count++;
				System.out.print("짝!");
			}
			if(i==2 && count == 0)
				System.out.println(inputNum);
			
		}
		
	}
}
