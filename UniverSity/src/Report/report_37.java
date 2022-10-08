package Report;
import java.util.*;
public class report_37 {

	public static void main(String[] args) {
//		24. 피보나치 수열 
//		(2) 위의 프로그램에서 피보나치 수열의 각 항을 출력하도록 출력문을 추가하라. 
		long a = 0, b = 1, c = 0;
		int i;

		 for(i = 2; i <= 10; i++){
		 c = a + b;// 변수 a와 b를 더하여 변수 c에 대입한다.
		 a = b;// 변수 b의 값을 변수 a로 옮긴다.
		 b = c;// 변수 c의 값을 변수 b로 옮긴다.
		 System.out.println(i +" 번째 항 : "+c);
		 }
	}
}
