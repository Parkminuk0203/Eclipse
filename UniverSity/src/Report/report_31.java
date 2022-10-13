package Report;
import java.util.*;
public class report_31 {

	public static void main(String[] args) {
//		19. 다음과 같이 정의되는 함수의 함수값을 계산하여 보자. 
//		사용자로부터 x값을 입력받아서 함수값을 계산하여 화면에 출력한다. x는 실수이다.
		Scanner sc = new Scanner(System.in);
		double fx = 0;
		
		System.out.print("x의 값 입력: ");
		double x = sc.nextDouble();
		
		if (x<=0) {
			fx = x*x*x-9*x+2;
			System.out.println(fx);
		}
		else {
			fx = 7*x+2;
			System.out.println(fx);
		}
		
	} // end of main

} // end of class
