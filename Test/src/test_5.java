import java.util.*;

public class test_5 {
	public static void main(String[] args) {
//		����ڿ��� ���� ������ �Է¹޾� �Ʒ��� ����� �ǵ��� ����ϴ� ���α׷�
//		���� �Է� : 5
//	          �ڡڡڡڡ�
//		  �ڡڡڡ�
//		        �ڡ�
//			��
//		     �ڡڡ�

		Scanner sc = new Scanner(System.in);

		System.out.print("�����Է�:");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) { // ��
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("");
			}
			System.out.println();
		}

	}
}