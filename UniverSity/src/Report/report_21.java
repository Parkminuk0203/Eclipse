package Report;
import java.util.*;
public class report_21 {

	public static void main(String[] args) {
//		9. 1���� 100������ ���� �߿��� 3 �Ǵ� 4�� ����� �ƴ� ������ ���� ����ϴ� ���α׷��� �ۼ��϶�.
	
		int sum = 0;
		
		for (int i=1; i<=100; i++) {
			if (i % 3 == 0 || i % 4 == 0) continue;  
				sum = sum + i; 
			}
				
		System.out.printf("���� %d",sum);
	
		
	} // end of main

} // end of class
