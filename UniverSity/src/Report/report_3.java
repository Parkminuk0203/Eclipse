package Report;
import java.util.*;
public class report_3 {

	public static void main(String[] args) {
//		x�� 1���� 20 ���̿� ������ x�� ���� y�� �����Ѵ�.
		Scanner sc = new Scanner(System.in);
		
		int x;
		int y;
		
		System.out.print("x�� �� �Է� : ");
		x = sc.nextInt();
		
		if (x > 1 && x < 20) {
			y = x;
			System.out.printf("y = %d",y);
		}
		
		else {
			System.out.println("1~20 ���̿� ���� �Է��Ͻÿ�.");
		}
		
	} // end of main

} // end of class
