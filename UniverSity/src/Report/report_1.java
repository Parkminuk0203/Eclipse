package Report;
import java.util.*;

public class report_1 {

	public static void main(String[] args) {
//		1. 다음의 작업을 수행하는 문장을 작성하라. 
//	   (1) 20 이상이고 60 미만이면 count를 증가한다.
		Scanner sc = new Scanner(System.in);
		
		int count = 0 ;
		int num = 0;
		
		System.out.print("정수 입력 : ");
		num = sc.nextInt();
		
		if (num >= 20 && num < 60) {
			count++;
		}
		System.out.println("count : "+count);
		
	} // end of class
		
} // end of main
