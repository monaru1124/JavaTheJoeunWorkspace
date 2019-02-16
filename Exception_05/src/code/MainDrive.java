package code;

public class MainDrive {

	public static void main(String[] args) {
	
		int[] numbers = new int[3];
		
		try {
			if(numbers.length == 2)
				System.out.println("정상 작동");
			else {
				MyException me = new MyException();
				throw me;
			}
		}
		catch(MyException e) {
			e.printExceptionInfo();
		}
		
		
	}
	
}
