package code;

public class MainDrive {

	public static void main(String[] args) {
		
		
//		Q1. 사용자 세명의 점수를 저장할 int 변수 3개.
		
		int score1, score2, score3 ;
		
//		Q1.1 - 첫번째 사용자의 점수를 100점으로 기록.
		
		score1 = 100 ;
		
//		Q2. 사용자 천명의 점수를 저장할 int 변수 1000개.
		
		int[] scoreArray = new int[1000];
		
//		Q2.2 - 첫번째 사용자의 점수를 100점으로 기록. 
		
		scoreArray[0] = 100;
		
		System.out.println(scoreArray[0]);
		
//		Q3. 두번째 사용자 (index : 1) 의 점수는 몇점?
		
		System.out.println(scoreArray[1]);
		
	}
}
