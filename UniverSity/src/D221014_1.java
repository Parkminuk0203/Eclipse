import java.util.*;
public class D221014_1 {

	public static void main(String[] args) {
		// ����ڿ��� ���� ������ �Է¹޾� �Ʒ��� ����� �ǵ��� ����ϴ� ���α׷� �ۼ�
//		���� ���� �Է� : 5
//		*
//		**
//		***
//		****
//		*****
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� ���� �Է� : ");
		int n = sc.nextInt();
		
		int i = 0;
		int j = 0;
		
		for(i=1;i<=n;i++) {
			for(j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	} // end of main

} // end of class
