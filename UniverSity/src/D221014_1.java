import java.util.*;
public class D221014_1 {

	public static void main(String[] args) {
		// 사용자에게 행의 정수를 입력받아 아래의 모양이 되도록 출력하는 프로그램 작성
//		행의 정수 입력 : 5
//		*
//		**
//		***
//		****
//		*****
		Scanner sc = new Scanner(System.in);
		
		System.out.print("행의 정수 입력 : ");
		int n = sc.nextInt();
		
		int i = 0;
		int j = 0;
		
		for(i=1;i<=n;i++) {
			for(j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	} // end of main

} // end of class
