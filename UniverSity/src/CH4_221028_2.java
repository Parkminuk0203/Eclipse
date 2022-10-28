import java.util.*;
public class CH4_221028_2 {

	public static void main(String[] args) {
// 사용자로부터 5명의 성적을 입력받아서 평균을 구하는 프로그램을 배열을 이용하여 작성하여 보자.
		Scanner sc = new Scanner(System.in);

		final int STU = 5;
		int sum = 0;
		
		int[] score = new int[STU];
		
		for (int i=0; i<score.length; i++) {
			System.out.print("성적을 입력하시오:");
			score[i] = sc.nextInt();
			sum += score[i];
		}
		System.out.println("평균 성적은 " + sum/STU + "입니다.");
		
	}

}
