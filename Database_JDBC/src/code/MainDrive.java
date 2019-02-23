package code;

import java.util.Scanner;

public class MainDrive {

	public static void main(String[] args) {
		
		JDBCPractice practice = new JDBCPractice();
		
//		practice.connectPractice();
		
		Scanner scan = new Scanner(System.in);
		System.out.print("ID : ");
		String userId = scan.nextLine();
		
		Scanner scan2 = new Scanner(System.in);
		System.out.print("PW : ");
		String userPw = scan.nextLine();
		
		practice.selectPractive(userId, userPw);
		
		
	} // main()
	
}
