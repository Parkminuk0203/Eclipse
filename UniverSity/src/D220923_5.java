import java.util.*;
public class D220923_5 {

	public static void main(String[] args) {
//		�׳��� ȯ��(1�޷��� ��ȭ�ݾ�)�� �Է¹ް�, ��ȭ �ݾ��� �Է��ϸ�, �׿� �ش��ϴ� �޷��� �������� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�޷� ȯ�� �Է�: ");
		float input1 = sc.nextInt();
		System.out.println("ȯ���� �ݾ�(��): ");
		int input2 = sc.nextInt();
		
		float dollar = input2 / input1;
		
		System.out.printf(input2 + "���� %.2f�޷� �Դϴ�.",dollar);
		
		
	} // end of main

} // end of class
