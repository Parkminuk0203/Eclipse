import java.util.*;
 
public class test_4 {
	public static void main(String[] args) {
//		����ڿ��� ���� ������ �Է¹޾� �Ʒ��� ����̵ǵ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
//		���� �Է� : 5
//		�ڡڡڡڡ�
//		�ڡڡڡ�
//		�ڡڡ�
//		�ڡ�
//		��
		Scanner sc = new Scanner(System.in);
		int i,j,n = 0;
		
		System.out.print("���� ���� �Է�: ");
		n = sc.nextInt();
		
		for (i=1;i<=n;i++) {
			for (j=n;j>=i;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}
}