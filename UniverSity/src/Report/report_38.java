package Report;
import java.util.*;
public class report_38 {
	
	public static void main(String[] args) {
//		24. 피보나치 수열 
//		(3) 사용자에게 몇 번째 항까지 출력할 것인지를 물어보고 
//		그 항까지만 출력하도록 위의 프로그램을 변경하라.
		Scanner sc = new Scanner(System.in);
		long a = 0, b = 1, c = 0;
		int i = 0;
		int n = 0;
		
		System.out.print("몇번째 항까지 출력하시겠습니까?: ");
		n = sc.nextInt();
		
		for (i=2; i<=n; i++) {
			c = a+b;
			a = b;
			b = c;
		}
		System.out.println(n+" 번째 항은: "+c);
	}
}