import java.util.*;
public class CH4_221028_2_3 {

	public static void main(String[] args) {
// ����ڷκ��� 5���� ������ �Է¹޾Ƽ� ����� ���ϴ� ���α׷��� �迭�� �̿��Ͽ� �ۼ��Ͽ� ����.
		Scanner sc = new Scanner(System.in);
		System.out.print("�� ���� �л� : ");
		int count = sc.nextInt();
		
		final int STU = count;
		int sum = 0;
		
		int[] score = new int[STU];
		
		for (int i=0; i<score.length; i++) {
			System.out.printf("%d���� ������ �Է��Ͻÿ�:",i+1);
			score[i] = sc.nextInt();
			sum += score[i];
		}
		System.out.printf("��� ������ %.2f �Դϴ�.\n",(double)sum/STU);
		
	}

}
