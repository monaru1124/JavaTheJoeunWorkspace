package code;

public class MainDrive {
	public static void main(String[] args) {
//		구구단을 2~9단까지 출력.
//
//		※ 가능한한 보기 좋게 출력 도전. (도전문제)
		
		for(int i = 2 ; i < 10 ; i++) {
			System.out.println(i + "단");
			for (int j = 1 ; j < 10; j++) {
				
				System.out.println(String.format("%d  *  %d  =  %d", i,j,i*j));
				
			}
			System.out.println();
		}
		
	}

}
