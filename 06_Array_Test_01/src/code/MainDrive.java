package code;

public class MainDrive {

	public static void main(String[] args) {
		
//		numberArray라는 10칸짜리 정수 배열 생성
		int[] numberArray = new int[10] ;
		
		
//		배열의 칸수만큼 (0번~끝칸까지) for문을 돌도록.
		for(int i = 0 ; i < numberArray.length ; i++) {
			
//			i : 0 => 1
//			i : 1 => 2
//			....
//			i : 9 => 10
			
//			규칙을 찾아서 i번째 칸에 i+1의 값을 대입.
			numberArray[i] = i+1 ;
		}
		
		
//		0번칸 ~ 끝칸까지 출력
		
		for(int i = 0 ; i < numberArray.length ; i++) {
			
			System.out.println(numberArray[i]);
		}
		
		
	}
}
