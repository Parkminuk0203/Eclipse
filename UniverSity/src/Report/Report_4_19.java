package Report;
import java.util.*;

public class Report_4_19 {

	public static void main(String[] args) {
//		19. �Է°����� ������ �ð������� �� �� �ִ� ������׷��� ����� ���α׷��� �ۼ��Ͻÿ�. 
//		�� ���α׷��� 1�� 100������ ���� 10���� �о�� �ϰ� 1-10, 
//		11-20 ���� ������ ��� ������ Ƚ���� �Ʒ� �׸��� ���� ����Ͽ��� �Ѵ�.
		Scanner sc = new Scanner(System.in);
		
		String[] arr = new String[10];
		int[] num = new int[10];
		int i,j;
		
		for (i = 0; i < 10; i++) {
			System.out.println((i + 1) + "��° ��: ");
			num[i] = sc.nextInt();
		} // �迭 num�� 1-100�� ���� 10���� �Է¹޴´�.
		for (i = 0; i < 10; i++) {
			arr[i] = ((i * 10) + 1) + "-" + ((i + 1) * 10) + ":";
		}
		// arr�� 0��° �ε����� ���� ������ ǥ���ϴ� String�� �ִ´�.
		for (i = 0; i < 10; i++)
			for (j = 0; j < 10; j++)
				if ((i * 10) + 1 <= num[j] && num[j] <= (i + 1) * 10)
					arr[i] += "*";
		// �迭 num�� �ε����� ���� ���� �迭arr�� ��*���� �ִ´�.
		for (i = 0; i < 10; i++) {
			System.out.println(arr[i]);
		} // �迭 arr�� ����Ѵ�.

	} // end of main
} // end of class