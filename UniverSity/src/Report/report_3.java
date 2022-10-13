package Report;
import java.util.*;
public class report_3 {

	public static void main(String[] args) {
//		x가 1부터 20 사이에 있으면 x의 값을 y에 대입한다.
		Scanner sc = new Scanner(System.in);
		
		int x;
		int y;
		
		System.out.print("x의 값 입력 : ");
		x = sc.nextInt();
		
		if (x > 1 && x < 20) {
			y = x;
			System.out.printf("y = %d",y);
		}
		
		else {
			System.out.println("1~20 사이에 값을 입력하시오.");
		}
		
	} // end of main

} // end of class
