package code;

import java.util.Scanner;

public class MainDrive {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("첫번째 숫자 입력 : ");
		int userInput1 = scan.nextInt();
		System.out.print("두번째 숫자 입력 : ");
		int userInput2 = scan.nextInt();
		
		System.out.println(String.format("바뀌기 전 값 \na = %d, b = %d", userInput1,userInput2));
		int c = userInput1;
		userInput1 = userInput2;
		userInput2 = c;
		
		System.out.println(String.format("바뀐 값 \na = %d, b = %d", userInput1,userInput2));
	}
	

	
	
}
