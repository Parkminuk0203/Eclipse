import java.util.*;
public class D221007_11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = 0;
		int y = 0;
		int r = 0;
		
		System.out.println("두 개의 정수를 입력하시오(큰수, 작은수): ");
		
		x = sc.nextInt();
		y = sc.nextInt();
		
		while (y != 0) {
			r = x % y;
			x = y;
			y = r;
		}
		System.out.println("최대 공약수: " + x);
	} // end of main

} // end of class
