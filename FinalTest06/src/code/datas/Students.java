package code.datas;

import java.util.Calendar;

public class Students {
	
	private String name;
	private String loginId;
	private Calendar birthday;
	private boolean gender;
	
	
	
	
	public Students(String name2) {
		// TODO Auto-generated constructor stub
	}
	
	
	public Students() {
		// TODO Auto-generated constructor stub
	}


	public String getLoginId() {
		return loginId;
	}
	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}
	public Calendar getBirthday() {
		return birthday;
	}
	public void setBirthday(Calendar birthday) {
		this.birthday = birthday;
	}
	public boolean isGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	

}
