import java.util.*;
public class D221014_12 {

	public static void main(String[] args) {
//		3.  2번 문제에서 생성된 수의 합과 평균을 구해서 출럭되도록 
//	                 프로그래밍 하세요.
		Random rnd = new Random();
		int num = 0;
		int i,j = 0;
		int sum = 0;
		
		System.out.println("*** 점수 출력 ***");
		for (i=1;i<=5;i++) {
			for (j=1;j<=5;j++) {
				num = rnd.nextInt(41)+60;
				System.out.print(num+" ");
				sum += num; 
			}
			System.out.println();
		}
		double avg = sum/25;
		System.out.printf("합계 : %d 평균 : %.2f ",sum,avg);
	} // end of main

} // end of class
