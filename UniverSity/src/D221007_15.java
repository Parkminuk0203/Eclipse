import java.util.*;
public class D221007_15 {

	public static void main(String[] args) {
//		약수 구하기
		Scanner sc = new Scanner(System.in);
		
		int n = 0;
		int i = 0;
		
		System.out.print("정수를 입력하시오: ");
		n = sc.nextInt();
		
		System.out.printf("%d 의 약수는 다음과 같습니다.\n",n);
		for (i=1;i<=n;i++) {
			if (n%i == 0) {
				System.out.print(i+" ");
			}
		}
	} // end of main

} // end of class
