package Report;
import java.util.*;
public class report_35 {

	public static void main(String[] args) {
//		23. 간단한 계산기 프로그램을 작성하여 보자. 먼저 사용자로부터 하나의 문자를 입력받는다. 이어서 사용자로부터 2개의 숫자를 입력받는다. 
//		사용자로부터 받은 문자가 ‘+'이면 두수의 덧셈을, 문자가 ’-'이면 뺄셈을
//		문자가 ‘*'이면 곱셈을, 문자가 ’/‘이면 나눗셈을 수행하도록 작성하라. 
//		if-else 문을 사용하라. 나눗셈의 경우, 분모가 0이 아닌지를 먼저 검사하여야 한다.
		Scanner input = new Scanner(System.in);
		int a,b;
		String z;
		
		System.out.print("원하는 연산을 입력하시오(+,-,*,/) : ");
		z = input.next();
		System.out.print("연산할 첫번째 수를 입력하시오 : ");
		a = input.nextInt();
		System.out.print("연산할 두번재 수를 입력하시오 : ");
		b = input.nextInt();
		
		if (z.equals("+")) {
			System.out.printf("%d %s %d = %d",a,z,b,a+b); 
		} else if (z.equals("-")) {			
		   System.out.printf("%d %s %d = %d",a,z,b,a-b); 
		} else if (z.equals("*")) {
		   System.out.printf("%d %s %d = %d",a,z,b,a*b); 
		} else if (z.equals("/")) {
			if (b==0) {
				System.out.printf("분모가 0이므로 연산할 수 없습니다."); 
			} else {				
			    System.out.printf("%d %s %d = %d",a,z,b,a/b);
			}
		}
	}
}
