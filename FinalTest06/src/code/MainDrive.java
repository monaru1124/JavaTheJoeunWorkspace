package code;
//	설명
//	- 학생, 강의, 강의에는 누구누구가 수업을 듣는지.
//	
//	이런 상황을 객체 지향적 개념들을 활용해서 최대한 표현.
//	
//	어떤 클래스들을 어떻게 만들지?
//  
//	

import code.datas.Students;

public class MainDrive {

	public static void main(String[] args) {
		
		Students s1 = new Students();
		s1.setName("정대호");
		System.out.println(s1.getName());
		
	}
}
