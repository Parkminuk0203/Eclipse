import java.util.*;
public class D221007_8 {

	public static void main(String[] args) {
//		�Է� ���� ������ ���ض�
		Scanner sc = new Scanner(System.in);
		
		int i = 1;
		int sum = 0;
		System.out.print("���� �Է� : ");
		int num = sc.nextInt();
		
		while (i<=num) {
			sum += i;
			i++;
		}
		System.out.println("�հ�  : "+sum);
	} // end of main

} // end of class
