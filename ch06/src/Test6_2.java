import java.util.*;
class Student {
	String name; // 학생 이름
	int ban;	 // 반
	int no;		 // 번호
	int kor;	 // 국어점수
	int eng;	 // 영어점수
	int math;	 // 수학점수
	
	Student(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	public String info() {
		return name
				+","+ban
				+","+no
				+","+kor
				+","+eng
				+","+math
				+","+(kor+eng+math)
				+","+((int)((kor+eng+math) / 3f*10+0.5f) / 10f)
				;
	}
} // end of Student class
public class Test6_2 {

	public static void main(String[] args) {
		Student s = new Student("홍길동",1,1,100,60,76);
		
		String str = s.info();
		System.out.println(str);
	} // end of main

} // end of class
