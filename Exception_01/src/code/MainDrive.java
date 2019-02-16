package code;

import java.util.Scanner;

public class MainDrive {

	public static void main(String[] args) {
		
		while(true) {
			
			int num1;
			int num2;
			int result;
			
	//		num1, num2에 숫자를 입력 받자.
	//		result에는 num1 / num2 한 값을 집어 넣자.
	//		result를 화면에 출력.
			
			Scanner scan = new Scanner(System.in);
			System.out.print("첫번째 숫자 입력 : ");
			num1 = scan.nextInt();
			System.out.print("두번째 숫자 입력 : ");
			num2 = scan.nextInt();
			
			try {
				result = num1 / num2;
				System.out.println(result);
			}
			catch (Exception e) {
				System.out.println("나눗셈에 문제가 있습니다!");
			}
			finally {
				System.out.println("어쨌든 나눗셈을 한번 수행했습니다.");
			}

			
			
		}
		
	} // main
	
}
