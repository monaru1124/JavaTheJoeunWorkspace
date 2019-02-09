package code;

import java.util.Calendar;

public class MainDrive {

	public static void main(String[] args) {
		
//		폰번은 null(입력 x)
//		오슬기, 윤두현, 윤소윤, 정대호, 허당
//		학생 객체로 만들어주자.
		
		Student s1 = new Student();
		s1.setName("오슬기");
		
		Student s2 = new Student();
		s2.setName("윤두현");
		
		Student s3 = new Student();
		s3.setName("윤소윤");
		
		Student s4 = new Student();
		s4.setName("정대호");
		
		Student s5 = new Student();
		s5.setName("허당");
		
		
//		강의 하나 생성
//		이름 : 자바(JAVA) 프로그래밍-초급
//		강사명 : 조경진
//		개강일 : 2019-01-19
//		종강일 : 2019-02-24		
		
		Lecture l1 = new Lecture();
		l1.setTitle("자바(JAVA) 프로그래밍-초급");		
		l1.setTeacherName("조경진");
		
		Calendar start = Calendar.getInstance();
		start.set(Calendar.YEAR, 2019);
		start.set(Calendar.MONTH, 0);
		start.set(Calendar.DAY_OF_MONTH, 19);
		
		l1.setStartDate(start);
		
		Calendar end = Calendar.getInstance();
		end.set(Calendar.YEAR, 2019);
		end.set(Calendar.MONTH, 1);
		end.set(Calendar.DAY_OF_MONTH, 24);
		
		l1.setEndDate(end);
		
//		자바초급 강의의 수강생 목록으로 5명의 학생 모두를 집어넣자.
//		첫번째 학생을 l1의 수강생 목록에 등록.
		l1.students.add(s5);
		l1.students.add(s1);
		l1.students.add(s4);
		l1.students.add(s3);
		l1.students.add(s2);
		
		
		System.out.println(l1.students.size());
		
//		자바초급 3번째 수강생(index : 2)의 이름?
		System.out.println(l1.students.get(2).getName());
		
//		윤소윤님은 몇번째 수강생? index의 값이 궁금함
		
		System.out.println(l1.students.indexOf(s3));
		
		
//		자바초급 강의의 정보를 출력.
//		"강의 정보를 출력합니다."
//		강의명 : %s
//		강사명 : %s
//		강의 기간 : %s ~ %s
//		수강 인원 : %d
		
		l1.showLectureInfo();
		
		Lecture.showLectureClassInfo();
		
		
		
	}
	
}







































