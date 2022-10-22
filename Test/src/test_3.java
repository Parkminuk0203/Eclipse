import java.util.*;
 
public class test_3 {
	public static void main(String[] args) {
//		사용자에게 행의 정수를 입력받아 아래의 모양이 되도록 출력하는 프로그램
//		정수 입력 : 5
//		★
//		★★
//		★★★
//		★★★★
//		★★★★★
		Scanner sc = new Scanner(System.in);
		int i,j,n = 0;
		
		System.out.print("행의 정수 입력: ");
		n = sc.nextInt();
		
		for (i=1; i<=n; i++) {
			for (j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}