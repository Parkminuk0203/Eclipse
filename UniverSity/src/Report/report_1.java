package Report;
import java.util.*;

public class report_1 {

	public static void main(String[] args) {
//		1. ������ �۾��� �����ϴ� ������ �ۼ��϶�. 
//	   (1) 20 �̻��̰� 60 �̸��̸� count�� �����Ѵ�.
		Scanner sc = new Scanner(System.in);
		
		int count = 0 ;
		int num = 0;
		
		System.out.print("���� �Է� : ");
		num = sc.nextInt();
		
		if (num >= 20 && num < 60) {
			count++;
		}
		System.out.println("count : "+count);
		
	} // end of class
		
} // end of main
