import java.util.*;
public class CH4_221028_2 {

	public static void main(String[] args) {
// ����ڷκ��� 5���� ������ �Է¹޾Ƽ� ����� ���ϴ� ���α׷��� �迭�� �̿��Ͽ� �ۼ��Ͽ� ����.
		Scanner sc = new Scanner(System.in);

		final int STU = 5;
		int sum = 0;
		
		int[] score = new int[STU];
		
		for (int i=0; i<score.length; i++) {
			System.out.print("������ �Է��Ͻÿ�:");
			score[i] = sc.nextInt();
			sum += score[i];
		}
		System.out.println("��� ������ " + sum/STU + "�Դϴ�.");
		
	}

}
