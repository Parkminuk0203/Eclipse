import java.util.*;
public class D220923_3 {

	public static void main(String[] args) {
//		실수를 입력받아 소수 첫째자리 숫자만 출력하는 프로그램을 작성하시오. 
		Scanner sc = new Scanner(System.in);
		
		double num = 0;
		int sum = 0;
		
		System.out.println("실수 입력: ");
		num = sc.nextFloat();
		
		num = num*10;
		sum = (int)num%10;
		System.out.println("소수 첫째자리: "+sum);
		
	} // end of main

} // end of class
