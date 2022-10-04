package Report;
import java.util.*;
public class report_11 {

	public static void main(String[] args) {
//		5-3. 다음 문장의 오류를 찾아서 수정하라. 
//		오류가 없을 수도 있고 2개 이상의 오류가 있을 수도 있다. 
//		문법적인 오류뿐만 아니라 논리적인 오류도 지적하라.
		
//		float grade = 3.0;
//		switch( grade )
//		{
//		case 4.5:
//		System.out.println("만점");
//		break;
//		case 0.0:
//		System.out.println("영점");
//		break;
//		}

// 		switch문에는 실수 사용 불가
		int grade = 3; // 자료형을 정수로 변경
		
		switch(grade)  
		{
		case 3:        // 임의로 case를 3으로 변경
		System.out.println("만점");
		break;
		case 0:
		System.out.println("영점");
		break;
		}
		
	} // end of main

} // end of class
