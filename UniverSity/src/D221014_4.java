import java.util.*;
public class D221014_4 {

	public static void main(String[] args) {
//		사용자에게 행의 정수를 입력받아 아래의 모양이되도록 출력하는 프로그램을 작성하시오
//		★★★★★
//		   ★★★★
//		      ★★★
//		         ★★
//		            ★
		Scanner sc = new Scanner(System.in);
		
		System.out.print("행의 정수 입력 : ");
		int n = sc.nextInt();
		
		int i = 0;
		int j = 0;
		int k = 0;
	
		for (i=1;i<=n;i++) {
			for (k=1;k<=i;k++) { // 0~i까지 공백
				System.out.print(" ");
			}
			for (j=n;j>=i;j--) { // n~i보다 작을때까지
				System.out.print("*");
			}
			System.out.println();
		}
	} // end of main

} // end of class
