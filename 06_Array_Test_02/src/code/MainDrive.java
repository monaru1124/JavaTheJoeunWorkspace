package code;

public class MainDrive {

	public static void main(String[] args) {
		
		
//		배열은 double형 배열, 
//		이름은 numberArray
//		칸수는 20칸
//
//		2,4,6,8,...,40 데이터를 numberArray에 집어넣고, 출력.


		double[] numberArray =new double[20];

//		데이터 입력
		for (int i = 0 ; i < numberArray.length ; i++) {
			
			numberArray[i] = (i+1) *2 ;
			
		}
		
//		출력
		for (int i = 0 ; i < numberArray.length ; i++) {
			
			System.out.println((int)(numberArray[i]));
		}
			
		
			
		
	}
}
