package code;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Lecture {
	private String title;
	private String teacherName;
	
//	자바에서 제공하는 Calendar 클래스도 속성으로 활용 가능.
	private Calendar startDate;
	private Calendar endDate;
	
//	수강생 목록을 담는 학생 배열.
//	public Student[] students = new Student[100];
	
//	수강생 목록을 담는 ArrayList.
//	Ctrl + Shift + O : import 자동 설정
	
	List<Student> students = new ArrayList<Student>();
		
//	public List<Student> students = new ArrayList<Student>();
	
	public static void showLectureClassInfo() {
		System.out.println("강의 정보를 담아주는데 사용하는 클래스입니다.");
		
		
	}
	
//	강의정보출력
	public void showLectureInfo() {
		
		System.out.println("강의 정보를 출력합니다.");
		System.out.println(String.format("강의명 : %s", this.title));
		System.out.println(String.format("강사명 : %s", this.teacherName));

//		강의기간 : 2019/02/09 ~ 2019/03/05
//		날짜 양식을 지정함
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/DD");
		
//		시작일을 양식에 맞춰서 String으로 저장
		String startDateStr = sdf.format(startDate.getTime());
		
//		종료일을 양식에 맞춰서 String으로 저장
		String endDateStr = sdf.format(endDate.getTime());
		
//		화면에 강의 기간 출력
		System.out.println(String.format("강의 기간 : %s ~ %s", startDateStr,endDateStr));
					

		System.out.println(String.format("수강인원 : %d명", this.students.size()));
		
		
	}
	
	
	
	
	
	
//	getter / setter
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getTeacherName() {
		return teacherName;
	}
	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}
	public Calendar getStartDate() {
		return startDate;
	}
	public void setStartDate(Calendar startDate) {
		this.startDate = startDate;
	}
	public Calendar getEndDate() {
		return endDate;
	}
	public void setEndDate(Calendar endDate) {
		this.endDate = endDate;
	}
	
	
	
	
}
