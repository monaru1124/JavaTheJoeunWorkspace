package code;

public class MainDrive {
	
	public static void main(String[] args) {
		
//		클래스 2가지. TV는 RemoteTv의 부모.
		
		TV tv1 = new RemoteTv();		
//		오른쪽은 왼쪽(의 한 종류)이다. 읽어봤을때 말이 되는가?
//		Ex. 리모콘 TV는 TV의 한 종류이다. (O)
		
//		RemoteTv tv2 = new TV();
//		Ex. TV는 리모콘 TV의 한 종류이다 (X)
		
		
//		tv1.turn => 리모콘티비를 만들었지만, TV의 형태로 담겨있기 때문에 리모콘을 사용할 수 없는 상태.
		
//		int => double, double => int 형변환, Casting   (int) (계산결과)
		
		((RemoteTv) tv1).turnOnByRemoteController();
		
		
		
		
	}

}















