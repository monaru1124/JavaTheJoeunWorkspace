package code;

import java.util.Calendar;

public class Attendance {

//	우리가 직접 만든 클래스들도 속성으로 활용 가능.
	private Student student;
	private Lecture lecture;
	private Calendar attendanceDate;
	
	
	
	
	
	
//	getter / setter
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public Lecture getLecture() {
		return lecture;
	}
	public void setLecture(Lecture lecture) {
		this.lecture = lecture;
	}
	public Calendar getAttendanceDate() {
		return attendanceDate;
	}
	public void setAttendanceDate(Calendar attendanceDate) {
		this.attendanceDate = attendanceDate;
	}
	
	

}
