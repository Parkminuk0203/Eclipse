import java.util.*;
public class D221014_4 {

	public static void main(String[] args) {
//		����ڿ��� ���� ������ �Է¹޾� �Ʒ��� ����̵ǵ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�
//		�ڡڡڡڡ�
//		   �ڡڡڡ�
//		      �ڡڡ�
//		         �ڡ�
//		            ��
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� ���� �Է� : ");
		int n = sc.nextInt();
		
		int i = 0;
		int j = 0;
		int k = 0;
	
		for (i=1;i<=n;i++) {
			for (k=1;k<=i;k++) { // 0~i���� ����
				System.out.print(" ");
			}
			for (j=n;j>=i;j--) { // n~i���� ����������
				System.out.print("*");
			}
			System.out.println();
		}
	} // end of main

} // end of class
