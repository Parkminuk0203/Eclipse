import java.util.*;
public class D221007_13 {

	public static void main(String[] args) {
//		1~100까지 짝수 출력 및 합
		int i = 0;
		int sum = 0;
		
		for (i=1;i<=100;i++) {
			if (i % 2 == 0) {
				System.out.println(i);			
				sum += i;
			}
		}
		System.out.println("합:"+sum);
	} // end of main

} // end of class
