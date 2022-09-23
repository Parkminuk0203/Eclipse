import java.util.*;
public class D220923_7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x, y, z, max = -9999, min= 9999;

		System.out.println("정수 3개 입력: ");
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
		System.out.println("가장 큰 수 : " + max);
		System.out.println("가장 작은 수 : " + min);
	} // end of main

} // end of class
