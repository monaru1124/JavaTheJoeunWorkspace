package code;

public class MainDrive {
	public static void main(String[] args) {
		
//		#1. 랜덤 소수 추출
		
		double randomDoubleValue = Math.random();
		
		System.out.println(randomDoubleValue);
		
//		#2. 루트 14? => 계산하기 힘듦. (제곱근)
		
		double root14 = Math.sqrt(14);
		
		System.out.println("루트 14는 "+root14);

//		#3. 3의 7승? => for문으로 직접 짜도 되지만, 기능을 쓰면 더 편리함.
		
		double pow3_7 = Math.pow(3, 7);
		System.out.println("3의 7승은 :"+pow3_7);
		
//		#4. 파이값
		System.out.println("파이값 : "+Math.PI);
		
	}

}
