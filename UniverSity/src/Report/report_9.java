package Report;
import java.util.*;
public class report_9 {

	public static void main(String[] args) {
//		5-1. 다음 문장의 오류를 찾아서 수정하라. 
//		오류가 없을 수도 있고 2개 이상의 오류가 있을 수도 있다. 
//		문법적인 오류뿐만 아니라 논리적인 오류도 지적하라. 
		
//		if( 0 < age < 18 ) // age의 자료형 타입과 변수값이 설정되어 있지 않다. 조건식도 올바르지 않다.
//			System.out.println("청소년");
		
		Scanner sc = new Scanner(System.in);
		
		int age = 0; // 변수를 선언과 동시에 초기화를 해준다.
		
		System.out.print("나이를 입력하시오 : ");
		age = sc.nextInt(); 
		
		if( 0 < age && age < 18 ) // if문 안에 여러 조건을 넣을 시에는 and나 or을 써줘야한다.
			System.out.println("청소년"); // 조건 만족시 청소년이라는 문자를 출력한다
		
	} // end of main

} // end of class
