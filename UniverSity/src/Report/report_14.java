package Report;
import java.util.*;
public class report_14 {

	public static void main(String[] args) {
//		6-3. 다음의 프로그램에서 생성되는 출력 결과는 무엇인가?
		
		int i = 0, sum = 0;
		
		while(i < 10 ) 
		{
		sum += i++;
		if( i % 3 == 0 ) continue; // 3의 배수를 탈출하고 다음 반복문 실행
		System.out.println("i="+i);
		if( sum > 10 ) break;
		}
		
		
	} // end of main

} // end of class
