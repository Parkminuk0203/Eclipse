import java.util.*;

public class Practice_6_3 {
	public static void main(String[] args) {
		Student s = new Student();
		s.name = "박민욱";
		s.ban = 1;
		s.no = 1;
		s.kor = 100;
		s.eng = 60;
		s.math = 76;
		System.out.println("이름:" + s.name);
		System.out.println("총점:" + s.getTotal());
		System.out.println("평균:" + s.getAverage());
		
	} // end of main
} // end of class

class Student {
	String name; // 학생 이름
	int ban; // 반
	int no; // 번호
	int kor; // 국어점수
	int eng; // 영어점수
	int math; // 수학점수

	Student() {} // 기본 생성자

	Student(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	int getTotal() {
		return kor + eng + math;
	}

	float getAverage() {
		return (int) (getTotal() / 3f * 10 + 0.5f) / 10f;
	}

	public String info() {
		return name 
				+ "," + ban 
				+ "," + no 
				+ "," + kor 
				+ "," + eng 
				+ "," + math 
				+ "," + getTotal()
				+ "," + getAverage();
	}
}
