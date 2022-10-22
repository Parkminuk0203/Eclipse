import java.util.*;
public class D221014_9 {

	public static void main(String[] args) {
		Random rnd = new Random();
		int num = 0;
		for(int i=1;i<=6;i++) {
//			num = rnd.nextInt(101); // 0~100까지 난수 생성, scailing
//			num = rnd.nextInt(50)*2+1; // 홀수 수식(2*n+1) 100까지 홀수
			num = rnd.nextInt(45)+1; // 1~45까지의 난수
			System.out.print(num + " ");
		}
		
		System.out.println(num);
	} // end of main

} // end of class
