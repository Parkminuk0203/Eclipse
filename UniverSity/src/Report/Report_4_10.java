package Report;

import java.util.*;

public class Report_4_10 {

	public static void main(String[] args) {
//		10. 다음과 같은 코드가 실행되었다고 할 때, null이 아닌 참조는 몇 개가 존재하는가?
		int i; 
		
		String[] employees = new String[10]; // 0~9까지 생성
		String name = "홍길동";
		employees[0] = name; // 인덱스 0에만 참조
		name = null;
		
		for(i=0;i<employees.length;i++) {
			System.out.println(employees[i]);
		}
//		홍길동 1개, null 9개가 출력되는 것을 확인할 수 있다.

	} // end of main
} // end of class