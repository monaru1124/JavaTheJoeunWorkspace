package code;

import java.util.Scanner;

public class MainDrive {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("윤년 판단 년도 : ");
		int inputYear = scan.nextInt();
		
		if(inputYear % 4 == 0) {
		
			if(inputYear % 100 == 0) {
				
				if(inputYear % 400 == 0 ) {
					System.out.println(inputYear + "년은 100으로 나누어지지만 400으로 나누어 떨어져 윤년입니다.");
				}
				
				else {
					System.out.println(inputYear + "년은 100으로 나누어 떨어져 윤년이 아닙니다.");
				}				
				
			}
			
			else {
				System.out.println(inputYear + "년은 4로 나누어 떨어지는 윤년입니다.");
			}			
		}		
		else {
			System.out.println(inputYear + "년은 4로 나누어 떨어지지 않아 윤년이 아닙니다.");
		}
		
	}
}
