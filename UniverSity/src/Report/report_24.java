package Report;
import java.util.*;
public class report_24 {

	public static void main(String[] args) {
//		12. 3개의 숫자를 받아서 크기 순으로 정렬하는 프로그램을 작성하여 보자. if-else를 사용한다.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하시오: ");
		int a = sc.nextInt();
		System.out.print("정수를 입력하시오: ");
		int b = sc.nextInt();
		System.out.print("정수를 입력하시오: ");
		int c = sc.nextInt();
		
		if (a > b) {
			if(a > c) {
				if(b > c) 
					System.out.printf("정렬된 숫자 : %d, %d, %d",a,b,c); 
				else 
					System.out.printf("정렬된 숫자 : %d, %d, %d",a,c,b); 				
			}
			else 
				System.out.printf("정렬된 숫자 : %d, %d, %d",c,a,b); 
		}
		else if (b > c) {
			if ( b > a ) {
				if (a > c) 
					System.out.printf("정렬된 숫자 : %d, %d, %d",b,a,c);					
				
				else
					System.out.printf("정렬된 숫자 : %d, %d, %d",a,b,c); 
			}
		}
		else
			System.out.printf("정렬된 숫자 : %d, %d, %d",c,b,a); 
	} // end of main

} // end of class
