package code.datas;

import java.util.ArrayList;
import java.util.List;

public class Lectures {
	private String title;
	private Teacher teacher;
	public List<Students> students = new ArrayList<Students>();
	
	public void registerStudent(Students u) {
		students.add(u);
	}
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Teacher getTeacher() {
		return teacher;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	public List<Students> getStudents() {
		return students;
	}
	public void setStudents(List<Students> students) {
		this.students = students;
	}
	
	
	

}
