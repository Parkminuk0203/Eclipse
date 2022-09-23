import java.util.*;
public class D220923_6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 입력하시오: ");
		int input1 = sc.nextInt();
		
		if (input1 % 2 == 0) {
			System.out.println("입력된 정수는 짝수입니다.");
		}
		
		else {
			System.out.println("입력된 정수는 홀수입니다.");
		}
		
		System.out.println("프로그램 종료");
		
	} // end of main

} // end of class
