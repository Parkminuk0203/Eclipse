import java.util.*;
public class D221007_2 {

	public static void main(String[] args) {
//		100�̻��� ������ ¦���� ����� �Է��� ������ŭ ���
		Scanner sc = new Scanner(System.in);
		
		int c = 0;
		System.out.print("�Է��� ����: ");
		int n = sc.nextInt();
		
		for (int i = 100; c < n; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
				c++;
			}
		}
	} // end of main

} // end of class
