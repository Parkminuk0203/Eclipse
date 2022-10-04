package Report;
import java.util.*;
public class report_18 {

	public static void main(String[] args) {
//		8. 다음의 코드를 살펴보고 질문에 답하시오.
//		(1) 사용자가 3을 입력하면 무엇이 출력될까?
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int x = sc.nextInt();
		
		if (x >= 0)
			if (x == 0)
				System.out.println("first");
		else System.out.println("second");
		System.out.println("third");

	} // end of main

} // end of class
