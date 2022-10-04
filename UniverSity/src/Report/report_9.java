package Report;
import java.util.*;
public class report_9 {

	public static void main(String[] args) {
//		5-1. 다음 문장의 오류를 찾아서 수정하라. 
//		오류가 없을 수도 있고 2개 이상의 오류가 있을 수도 있다. 
//		문법적인 오류뿐만 아니라 논리적인 오류도 지적하라. 
		
//		if( 0 < age < 18 )
//			System.out.println("청소년");
		
		int age = 16; // if문을 실행하기 위한 변수 설정
		
		if( 0 < age && age < 18 ) // if문 안에 여러 조건을 넣을 시에는 and나 or을 써줘야한다.
			System.out.println("청소년");
		
	} // end of main

} // end of class
