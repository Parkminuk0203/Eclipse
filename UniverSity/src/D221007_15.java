import java.util.*;
public class D221007_15 {

	public static void main(String[] args) {
//		��� ���ϱ�
		Scanner sc = new Scanner(System.in);
		
		int n = 0;
		int i = 0;
		
		System.out.print("������ �Է��Ͻÿ�: ");
		n = sc.nextInt();
		
		System.out.printf("%d �� ����� ������ �����ϴ�.\n",n);
		for (i=1;i<=n;i++) {
			if (n%i == 0) {
				System.out.print(i+" ");
			}
		}
	} // end of main

} // end of class
