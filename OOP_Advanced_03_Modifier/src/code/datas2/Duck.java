package code.datas2;

import code.datas.Animal;

public class Duck extends Animal {
	
	public void pringInfo() {
		
//		this.name  // 불가 = > 상속을 받아도 동일 패키지가 아닌경우 default는 못가져옴
		this.kind = ""; // 집을 나왔어도 물려주겠다! protected 가능
		
		
	}

	
}
