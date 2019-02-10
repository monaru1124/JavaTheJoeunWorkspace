package code;

public class Dog extends Animal implements HomeKeeper{

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		
		System.out.println("그릇을 바닥에 두고 먹는다.");
				
	}

	@Override
	public void findStranger() {

		System.out.println("수상한 사람을 쫓아낸다!");
				
	}

	
}
