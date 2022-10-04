package Report;
import java.util.*;
public class report_10 {

	public static void main(String[] args) {
//		5-2. 다음 문장의 오류를 찾아서 수정하라. 
//		오류가 없을 수도 있고 2개 이상의 오류가 있을 수도 있다. 
//		문법적인 오류뿐만 아니라 논리적인 오류도 지적하라.
		
//		if( x = 0 )
//			System.out.println("x는 0이다.");

		int x = 0; // if문을 실행하기 위한 변수 설정
		
		if( x == 0 ) // x는 0이랑 같을 때 조건을 쓰고 싶으면 ==로 표현해야 한다.			
			System.out.println("x는 0이다.");

	} // end of main

} // end of class
