import java.util.*;
public class D221007_14 {

	public static void main(String[] args) {
//		���丮�� ���
		Scanner sc = new Scanner(System.in);
		
		long fact = 1; // 0�ϸ� ����
		int n = 0;
		int i = 0;
		
		System.out.print("���� �Է�: ");
		n = sc.nextInt();
		for (i=1;i<=n;i++) { // 0�ϸ� ����
			fact = fact*i;
		}
		System.out.printf("%d!�� %d",n,fact);
		
	} // end of main

} // end of class
