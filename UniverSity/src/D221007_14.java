import java.util.*;
public class D221007_14 {

	public static void main(String[] args) {
//		팩토리얼 계산
		Scanner sc = new Scanner(System.in);
		
		long fact = 1; // 0하면 에러
		int n = 0;
		int i = 0;
		
		System.out.print("정수 입력: ");
		n = sc.nextInt();
		for (i=1;i<=n;i++) { // 0하면 에러
			fact = fact*i;
		}
		System.out.printf("%d!은 %d",n,fact);
		
	} // end of main

} // end of class
