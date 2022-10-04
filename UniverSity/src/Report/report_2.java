package Report;
import java.util.*;
public class report_2 {

	public static void main(String[] args) {
//		x와 y 중에서 큰 값을 max에 저장하고 작은 값을 min에 저장한다.
		Scanner sc = new Scanner(System.in);
		
		int x;
		int y;
		
		System.out.print("정수 입력 : ");
		x = sc.nextInt();
		System.out.print("정수 입력 : ");
		y = sc.nextInt();
		
		if (x>y) {
			int max = x;
			int min = y;
			System.out.printf("최대값 : %d, 최소값 : %d",max,min);
		}
		else {
			int max = y;
			int min = x;
			System.out.printf("최대값 : %d, 최소값 : %d",max,min);
		}
	} // end of main

} // end of class
