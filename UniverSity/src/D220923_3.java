import java.util.*;
public class D220923_3 {

	public static void main(String[] args) {
//		�Ǽ��� �Է¹޾� �Ҽ� ù°�ڸ� ���ڸ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. 
		Scanner sc = new Scanner(System.in);
		
		double num = 0;
		int sum = 0;
		
		System.out.println("�Ǽ� �Է�: ");
		num = sc.nextFloat();
		
		num = num*10;
		sum = (int)num%10;
		System.out.println("�Ҽ� ù°�ڸ�: "+sum);
		
	} // end of main

} // end of class
