import java.util.*;
public class D221014_12 {

	public static void main(String[] args) {
//		3.  2�� �������� ������ ���� �հ� ����� ���ؼ� �ⷰ�ǵ��� 
//	                 ���α׷��� �ϼ���.
		Random rnd = new Random();
		int num = 0;
		int i,j = 0;
		int sum = 0;
		
		System.out.println("*** ���� ��� ***");
		for (i=1;i<=5;i++) {
			for (j=1;j<=5;j++) {
				num = rnd.nextInt(41)+60;
				System.out.print(num+" ");
				sum += num; 
			}
			System.out.println();
		}
		double avg = sum/25;
		System.out.printf("�հ� : %d ��� : %.2f ",sum,avg);
	} // end of main

} // end of class
