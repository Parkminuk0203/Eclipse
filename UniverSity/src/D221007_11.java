import java.util.*;
public class D221007_11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = 0;
		int y = 0;
		int r = 0;
		
		System.out.println("�� ���� ������ �Է��Ͻÿ�(ū��, ������): ");
		
		x = sc.nextInt();
		y = sc.nextInt();
		
		while (y != 0) {
			r = x % y;
			x = y;
			y = r;
		}
		System.out.println("�ִ� �����: " + x);
	} // end of main

} // end of class
