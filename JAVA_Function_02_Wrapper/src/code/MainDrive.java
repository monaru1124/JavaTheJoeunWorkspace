package code;

public class MainDrive {

	public static void main(String[] args) {
		
		int i1 = 10;
		
		Integer iw1 = new Integer(20);
		
		System.out.println(iw1.doubleValue());
		
		
		String num1 = "123";
//		num1 => int로 변환
		
		int i = Integer.parseInt(num1);
		
		String num2 = "321.23";
		double d = Double.parseDouble(num2);
		
		System.out.println(i);
		System.out.println(d);
		
		float f = Float.parseFloat(num2);
		System.out.println(f);
				
	
	}
	
}
