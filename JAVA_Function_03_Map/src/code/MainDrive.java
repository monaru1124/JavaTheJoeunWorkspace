package code;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MainDrive {

	public static void main(String[] args) {
		
//		제일 단순한 1000칸 배열.
		int[] arr1000 = new int[1000];
		
//		실무에서 많이 쓰는 데이터 나열 구조 : ArrayList
		
		List<String> strList = new ArrayList<String>();
		
//		이 두가지는 데이터의 위치 판단 근거 : index 몇번째에 들어있는지?
		
//		arr1000[5] ?, strList.get(5)?
		
		
//		Map<Key, Value>  key : 메모 - 항목이름, value : 실제 저장할 데이터.
		
		Map<String, String> myInfoMap = new HashMap<String, String>();
		
//		내 정보중, 이름 : 조경진 + 폰번 : 010-5112-3237 + 주소 : 서울시 은평구
		
		myInfoMap.put("주소", "서울시 은평구");
		myInfoMap.put("이름", "조경진");
		myInfoMap.put("폰번", "010-5112-3237");
		
//		myInfoMap에 저장된 사람의 이름을 출력.
		
		System.out.println(myInfoMap.get("이름"));
		
		
//		-------
		
		Set<String> alphabetSet = new HashSet<String>();
		
		boolean firstA = alphabetSet.add("A");
		boolean secondA = alphabetSet.add("A");
		
		alphabetSet.add("B");
		alphabetSet.add("B");
		
		alphabetSet.add("C");
		alphabetSet.add("C");
		alphabetSet.add("C");
		
		
		
		if(firstA) {
			System.out.println("첫번째 A를 넣었습니다.");
			
		}
		else
			System.out.println("첫번째 A를 넣는데 실패했습니다.");
		
		if(secondA) {
			System.out.println("두번째 A를 넣었습니다.");
			
		}
		else
			System.out.println("두번째 A를 넣는데 실패했습니다.");
		
		
		System.out.println(String.format("알파벳은 총 %d개 들어있습니다.", alphabetSet.size()));
		
		
		
	}
	
}
