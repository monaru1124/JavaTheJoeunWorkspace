package code;

public class MainDrive {
	
	public static void main(String[] args) {
		
		ThrowTest tt1 = new ThrowTest();
		
		try {
			tt1.dangerWork(3);
		} catch (Exception e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println("예외 처리 실행!");
		}
		
		
		
	}

}
