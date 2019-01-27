package code;

public class MainDrive {

	public static void main(String[] args) {
		
		
//		Q1. 사용자 세명의 점수를 저장할 int 변수 3개.
		
		int score1, score2, score3 ;
		
//		Q1.1 - 첫번째 사용자의 점수를 100점으로 기록.
		
		score1 = 100 ;
		
//		Q2. 사용자 천명의 점수를 저장할 int 변수 1000개.
//		0번 ~ 999번 : 1000칸
		
		int[] scoreArray = new int[1000];
		
//		Q2.2 - 첫번째 사용자의 점수를 100점으로 기록. 
		
		scoreArray[0] = 100;
		
		System.out.println(scoreArray[0]);  // 100
		
//		Q3. 두번째 사용자 (index : 1) 의 점수는 몇점?
		
		System.out.println(scoreArray[1]);  // 0
		
//		Q4. 1000명의 점수를 모두 50점으로 입력.
		
		for (int i = 0 ; i < 1000 ; i++) {
			scoreArray[i] = 50 ;
			
			
		}
		
//		Q5. 845번칸에 들어있는 점수?
		System.out.println(scoreArray[845]);
		
		int[] numberArray = {10, 20, 30, 40, 50, 60} ;
		
//		numberArray = {60,50,40,30,20,10};  // 이런 문법은 불가!
//		배열을 생성할 때에만 사용가능.
		
		System.out.println(numberArray.length);  // 6
		
		
		int[][] twoDimenArray = new int[5][10];
		
		int[][] twoDimenArray2 = { {10, 20, 30} , {70, 80, 90} } ;
		
		System.out.println(twoDimenArray2.length);
		
		
		
		
		
	}
}




























