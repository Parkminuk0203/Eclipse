import java.util.*;
public class D220923_7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x, y, z, max = -9999, min= 9999;

		System.out.println("���� 3�� �Է�: ");
		x = sc.nextInt();
		y = sc.nextInt();
		z = sc.nextInt();
		
		if(max<x) {
			max = x;
		}
		if(max<y) {
			max = y;
		}
		if(max<z) {
			max = z;
		}
		if(min>x) {
			min = x;
		}
		if(min>y) {
			min = y;
		}
		if(min>x) {
			min = z;
		}
		System.out.println("���� ū �� : " + max);
		System.out.println("���� ���� �� : " + min);
	} // end of main

} // end of class
