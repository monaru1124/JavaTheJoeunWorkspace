package code;

import java.util.Scanner;

public class MainDrive {
	
	public static void main(String[] args) {
		
//		사용자에게 String 하나를 입력받자.
//		입력 받은 String을 숫자(int)로 변경
//		변경된 숫자로 10을 나눗셈. 10/숫자
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("문자 하나를 입력해주세요 : ");
		String userInput = scan.nextLine();
		
		
		try {
			int number = Integer.parseInt(userInput);
			
			int result = 10 / number;
			
			System.out.println(result);
		}
		catch(NumberFormatException e) {
			System.out.println("숫자를 입력해야 합니다!");
		}
		catch(ArithmeticException e) {
			System.out.println("0으로 나누면 안됩니다!");
		}
		
		
		
	}

}
