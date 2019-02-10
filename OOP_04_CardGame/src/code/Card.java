package code;

public class Card {

//	카드 한장한장이 갖는 고유 객체의 속성
	private String kind; // 카드 각 한장의 무늬
	private int number; // 카드 각 한장의 숫자

//	카드라는 개념 자체의 속성
	static int width = 7; // 카드의 물리적 가로 크기
	static int height = 12; // 카드의 물리적 세로 크기

	
	public Card(String inputKind, int inputNumber) {
		this.kind = inputKind;
		this.number = inputNumber;
	}
	
	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public static int getWidth() {
		return width;
	}

	public static void setWidth(int width) {
		Card.width = width;
	}

	public static int getHeight() {
		return height;
	}

	public static void setHeight(int height) {
		Card.height = height;
	}

	// 1) 카드 한장의 고유 정보를 출력.
	public void printCardInfo() {

//		kind : 스페이드 / number : 1 => 스페이드 A

		String printNumber;
		if (number == 1) {
			printNumber = "A";
		} else if (number == 11) {
			printNumber = "J";
		} else if (number == 12) {
			printNumber = "Q";
		} else if (number == 13) {
			printNumber = "K";
		} else {
//			2~10 인경우. 숫자값 (int)을 그대로 String으로 변환.
			printNumber = String.valueOf(number);
		}

		System.out.println(String.format("%s %s", kind, printNumber));
	}

//	2) 카드 자체에 대한 정보를 출력

	public static void printCardClassInfo() {
//		카드는 총 52장이고, 가로크기는 width, 세로크기는 height입니다.

		System.out.println(String.format("카드는 총 52장이고, 가로 크기는 %d, 세로크기는 %d 입니다.", width, height));

//		뽑힌 카드의 정보도 출력? 무늬, 숫자 => 일반변수.
//		=> static 카드의 하단 유의사항 참조.

	}

}
