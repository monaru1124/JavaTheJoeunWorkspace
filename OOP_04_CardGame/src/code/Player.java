package code;

public class Player {
	
	private String userId;
	private String nickname;
	private String name;
	private int birthYear;
	private boolean gender;
	
	
	public void printPlayerInfo() {
		System.out.println(String.format("제 이름은 %s 입니다.", this.name));
	}
	
	public void printPlayerInfo(boolean needAge) {
		
		System.out.println(String.format("제 이름은 %s 입니다.", this.name));
		
		if (needAge) {
			System.out.println(String.format("저는 %d년 생입니다.", this.birthYear));
		}
	}
	
	
	public Player() {
		super();
	}
	
	public Player(String userId, String nickname, String name, int birthYear, boolean gender) {
		super();
		this.userId = userId;
		this.nickname = nickname;
		this.name = name;
		this.birthYear = birthYear;
		this.gender = gender;
	}
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBirthYear() {
		return birthYear;
	}
	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
	public boolean isGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	
	

}
