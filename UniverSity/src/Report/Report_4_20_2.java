package Report;

import java.util.*;

public class Report_4_20_2 {

	public static void main(String[] args) {
//		20. ������ ���� �л����� ������ �޾Ƽ� ����� ���ϴ� ���α׷��� �ۼ��϶�.
		Scanner sc = new Scanner(System.in);
		int count, i;
		double avg;
		System.out.print("�л��� ���� �Է��Ͻÿ� : ");
		count = sc.nextInt();
		
		int[] score = new int[count];
		for(i=0; i<score.length; i++) {
			System.out.print("�л� "+(i+1)+"�� ���� �Է� : ");
			score[i] = sc.nextInt();
			if(score[i] < 0 || score[i] > 100 ) {
				System.out.println("�߸��� �����Դϴ�. �ٽ� �Է��Ͻÿ�.");
				i--;
			}
		}
		int sum = 0;
		for(i=0;i<score.length;i++) {
			sum += score[i];
		}
		avg = (double) sum / score.length;
		System.out.println("����� " + avg);
	} // end of main

} // end of class