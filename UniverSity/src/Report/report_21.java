package Report;
import java.util.*;
public class report_21 {

	public static void main(String[] args) {
//		9. 1부터 100사이의 정수 중에서 3 또는 4의 배수가 아닌 수들의 합을 계산하는 프로그램을 작성하라.
	
		int sum = 0;
		
		for (int i=1; i<=100; i++) {
			if (i % 3 == 0 || i % 4 == 0) continue;  
				sum = sum + i; 
			}
				
		System.out.printf("합은 %d",sum);
	
		
	} // end of main

} // end of class
