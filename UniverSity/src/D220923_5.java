import java.util.*;
public class D220923_5 {

	public static void main(String[] args) {
//		그날의 환율(1달러당 한화금액)을 입력받고, 한화 금액을 입력하면, 그에 해당하는 달러가 얼마인지를 출력하는 프로그램을 작성하시오.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("달러 환율 입력: ");
		float input1 = sc.nextInt();
		System.out.println("환전할 금액(원): ");
		int input2 = sc.nextInt();
		
		float dollar = input2 / input1;
		
		System.out.printf(input2 + "원은 %.2f달러 입니다.",dollar);
		
		
	} // end of main

} // end of class
