package Report;
import java.util.*;
public class report_19 {

	public static void main(String[] args) {
//		8. 다음의 코드를 살펴보고 질문에 답하시오.
//		(2) 위의 코드를 포함하는 전체 프로그램을 작성하라. 
//		변수 x를 선언하고 초기값을 3으로하라. 프로그램의 출력은 무엇인가? 이유를 설명하라
		
		int x = 3;
		
		if (x >= 0) 						 // 만약 x가 0보다 크거나 같은데
			if (x == 0) 					 // 위 조건을 만족하고 만약 x가 0이면
				System.out.println("first"); // first를 출력하라.
		else System.out.println("second");   // 아니면 second를 출력하라.
		System.out.println("third");		 // 그냥 third를 출력하라. (조건문 밖이라서 무조건 출력)
		
	} // end of main

} // end of class
