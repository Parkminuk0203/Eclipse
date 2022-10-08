package Report;
import java.util.*;
public class report_36 {

	public static void main(String[] args) {
//		24. 피보나치 수열 
//		(1) 빈칸을 채우고 컴파일하고 실행하여 보라
		long a = 0, b = 1, c;
		int i;

		 for(i = 2; i <= 10; i++) {
		 c = a + b;// 변수 a와 b를 더하여 변수 c에 대입한다.
		 a = b;// 변수 b의 값을 변수 a로 옮긴다.
		 b = c;// 변수 c의 값을 변수 b로 옮긴다.
		 }
	}
}
