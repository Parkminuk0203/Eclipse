package Report;
import java.util.*;
public class report_2 {

	public static void main(String[] args) {
//		x�� y �߿��� ū ���� max�� �����ϰ� ���� ���� min�� �����Ѵ�.
		Scanner sc = new Scanner(System.in);
		
		int x;
		int y;
		
		System.out.print("���� �Է� : ");
		x = sc.nextInt();
		System.out.print("���� �Է� : ");
		y = sc.nextInt();
		
		if (x>y) {
			int max = x;
			int min = y;
			System.out.printf("�ִ밪 : %d, �ּҰ� : %d",max,min);
		}
		else {
			int max = y;
			int min = x;
			System.out.printf("�ִ밪 : %d, �ּҰ� : %d",max,min);
		}
	} // end of main

} // end of class
