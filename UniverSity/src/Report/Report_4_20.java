package Report;
import java.util.*;

public class Report_4_20 {

	public static void main(String[] args) {
//		20. ������ ���� �л����� ������ �޾Ƽ� ����� ���ϴ� ���α׷��� �ۼ��϶�.
		Scanner sc = new Scanner(System.in);
		System.out.print("�л��� ���� �Է��Ͻÿ�:");
		final int stu = sc.nextInt();
		int[] arr = new int[stu];
		int i;
		double sum = 0;
		
		for (i=0; i<stu; i++) {
			System.out.printf("�л� %d�� ������ �Է��Ͻÿ�:", i+1);
			int score = sc.nextInt();
			while (0 < score && score > 100) {
				System.out.println("�߸��� �����Դϴ�. �ٽ��Է��Ͻÿ�.");
				System.out.printf("�л� %d�� ������ �Է��Ͻÿ�:", i+1);
				score = sc.nextInt();
			}
			arr[i] = score;
		}
		for (int val : arr) { // arr���� ���ʴ�� ��ü�� ������ val�� ����, arr���� ���� ��ü�� ���� ������ �ݺ�
			sum += val;
		}
		System.out.printf("���� ����� %.1f�Դϴ�.", sum / stu);

	} // end of main
} // end of class