import java.util.*;
public class D220923_4 {

	public static void main(String[] args) {
//		����, ����, ������ ������ �Է¹޾� ������ ����� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� : ");
		int input1 = sc.nextInt();
		System.out.println("���� : ");
		int input2 = sc.nextInt();
		System.out.println("���� : ");
		int input3 = sc.nextInt();
		
		float avg = (input1 + input2 + input3) / 3;
		System.out.println("-------------");
		System.out.printf("3������ ���:%.2f��",avg);
		
	} // end of main

} // end of class
