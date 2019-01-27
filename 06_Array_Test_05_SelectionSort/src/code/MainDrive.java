package code;

public class MainDrive {

	public static void main(String[] args) {
		int[] numbers = {12, 58, 76, 40, 30, 5, 15};
		
		int[] sortedNumbers = new int[7];
		
		
//		반복 요소
//		 1) 제일 작은 값이 무엇인지 기억하고 갱신하는 과정. => numbers 내용 조회 => 더 바쁨 : j
//		 2) sortedNumbers에 값을 기록하는 반복. => 덜 바쁨. => 바깥에 작성. : i
		for (int i=0 ; i < sortedNumbers.length ; i++) {

//			제일 작은 값을 기록할 변수
			int minimumNum = 99999999; // 일단 큰 값을 저장

//			제일 작은 값이 몇번 칸이었는지?
			int minimumNumIndex = 0 ;
			
			for(int j=0 ; j< numbers.length ; j++) {
				
				if(minimumNum > numbers[j]) {
//					새로 발견한 최저값을 기록
					minimumNum = numbers[j];
					
//					그 값이 몇번째 위치인지도 기록.
					minimumNumIndex = j ;
				}
			}
			
//			찾아낸 최소값을 정렬된 배열에 기록
			sortedNumbers[i] = minimumNum ;
			
//			찾아낸 최소값은 더이상 볼 필요가 없음. 매우 큰 값으로 변경.
			numbers[minimumNumIndex] = 99999999;
			
			
			
		}
		
//		정렬된 배열을 순서대로 출력.
		for(int i = 0 ; i < sortedNumbers.length ; i++) {
			System.out.println(sortedNumbers[i]);
		}
		
	}
}
