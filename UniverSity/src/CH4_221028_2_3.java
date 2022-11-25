import java.util.*;
public class CH4_221028_2_3 {

	public static void main(String[] args) {
// 사용자로부터 5명의 성적을 입력받아서 평균을 구하는 프로그램을 배열을 이용하여 작성하여 보자.
		Scanner sc = new Scanner(System.in);
		System.out.print("몇 명의 학생 : ");
		int count = sc.nextInt();
		
		final int STU = count;
		int sum = 0;
		
		int[] score = new int[STU];
		
		for (int i=0; i<score.length; i++) {
			System.out.printf("%d번의 성적을 입력하시오:",i+1);
			score[i] = sc.nextInt();
			sum += score[i];
		}
		System.out.printf("평균 성적은 %.2f 입니다.\n",(double)sum/STU);
		
	}

}
