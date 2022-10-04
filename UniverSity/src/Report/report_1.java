package Report;
import java.util.*;

public class report_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int count = 0 ;
		int num = 0;
		
		System.out.print("정수 입력 : ");
		num = sc.nextInt();
		
		if (num >= 20 && num < 60) {
			++count;
		}
		System.out.println(count);
		
	} // end of class
		
} // end of main
