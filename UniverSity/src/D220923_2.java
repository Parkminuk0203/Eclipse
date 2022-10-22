import java.util.*;
public class D220923_2 {

	public static void main(String[] args) {
//		정수를 입력받아 1의 자리 숫자만 출력하는 프로그램을 작성하시오.
		Scanner sc = new Scanner(System.in);
		int n = 0;
		int x = 0;
		
		System.out.print("정수를 입력하시오: ");
		n = sc.nextInt();
		
		x = n%10;
		
		System.out.println("1의 자리 숫자는:"+x);
		
		
	} // end of main

} // end of class
