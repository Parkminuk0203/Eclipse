import java.util.*;
 
public class test_3 {
	public static void main(String[] args) {
//		����ڿ��� ���� ������ �Է¹޾� �Ʒ��� ����� �ǵ��� ����ϴ� ���α׷�
//		���� �Է� : 5
//		��
//		�ڡ�
//		�ڡڡ�
//		�ڡڡڡ�
//		�ڡڡڡڡ�
		Scanner sc = new Scanner(System.in);
		int i,j,n = 0;
		
		System.out.print("���� ���� �Է�: ");
		n = sc.nextInt();
		
		for (i=1; i<=n; i++) {
			for (j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}