import java.util.*;

public class test_5 {
	public static void main(String[] args) {
//		사용자에게 행의 정수를 입력받아 아래의 모양이 되도록 출력하는 프로그램
//		정수 입력 : 5
//	          ★★★★★
//		  ★★★★
//		        ★★
//			★
//		     ★★★

		Scanner sc = new Scanner(System.in);

		System.out.print("정수입력:");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) { // 줄
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("");
			}
			System.out.println();
		}

	}
}