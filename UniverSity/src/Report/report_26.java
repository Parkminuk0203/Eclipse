package Report;
import java.util.*;
public class report_26 {

	public static void main(String[] args) {
//		14. 키보드에서 영문자 하나를 읽어서 모음과 자음을 구분하는 프로그램을 작성하여 보자. switch 문을 사용하여 문자를 구분한다.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("영문자 하나를 입력하세요. : ");
		String str = sc.next();
		
		switch (str) {
		case "A": case "a": 	case "E": case "e":
		case "I": case "i":		case "O": case "o":
		case "U": case "u":
			System.out.println("첫문자는 자음입니다.");
			break;
		default :
			System.out.println("첫문자는 모음입니다.");
		} // end of switch
		
	} // end of main

} // end of class
