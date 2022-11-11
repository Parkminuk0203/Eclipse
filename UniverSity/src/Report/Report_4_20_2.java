package Report;

import java.util.*;

public class Report_4_20_2 {

	public static void main(String[] args) {
//		20. 다음과 같이 학생들의 성적을 받아서 평균을 구하는 프로그램을 작성하라.
		Scanner sc = new Scanner(System.in);
		int count, i;
		double avg;
		System.out.print("학생의 수를 입력하시오 : ");
		count = sc.nextInt();
		
		int[] score = new int[count];
		for(i=0; i<score.length; i++) {
			System.out.print("학생 "+(i+1)+"의 성적 입력 : ");
			score[i] = sc.nextInt();
			if(score[i] < 0 || score[i] > 100 ) {
				System.out.println("잘못된 성적입니다. 다시 입력하시오.");
				i--;
			}
		}
		int sum = 0;
		for(i=0;i<score.length;i++) {
			sum += score[i];
		}
		avg = (double) sum / score.length;
		System.out.println("평균은 " + avg);
	} // end of main

} // end of class