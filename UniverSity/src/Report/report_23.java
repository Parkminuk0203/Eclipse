package Report;
import java.util.*;
public class report_23 {

	public static void main(String[] args) {
//		11. ���� 1+(1+2)+(1+2+3)+...+(1+2+3+...+100)�� ����ϴ� ���α׷��� �ۼ��϶�. 
		int sum = 0;
		int totalsum = 0;
		
		for (int i=1; i<=100; i++) {
			sum = sum + i;
			totalsum = totalsum + sum;
		}
		System.out.printf("����: %d",totalsum);
	} // end of main

} // end of class
