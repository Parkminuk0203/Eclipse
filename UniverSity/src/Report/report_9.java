package Report;
import java.util.*;
public class report_9 {

	public static void main(String[] args) {
//		5-1. ���� ������ ������ ã�Ƽ� �����϶�. 
//		������ ���� ���� �ְ� 2�� �̻��� ������ ���� ���� �ִ�. 
//		�������� �����Ӹ� �ƴ϶� ������ ������ �����϶�. 
		
//		if( 0 < age < 18 ) // age�� �ڷ��� Ÿ�԰� �������� �����Ǿ� ���� �ʴ�. ���ǽĵ� �ùٸ��� �ʴ�.
//			System.out.println("û�ҳ�");
		
		Scanner sc = new Scanner(System.in);
		
		int age = 0; // ������ ����� ���ÿ� �ʱ�ȭ�� ���ش�.
		
		System.out.print("���̸� �Է��Ͻÿ� : ");
		age = sc.nextInt(); 
		
		if( 0 < age && age < 18 ) // if�� �ȿ� ���� ������ ���� �ÿ��� and�� or�� ������Ѵ�.
			System.out.println("û�ҳ�"); // ���� ������ û�ҳ��̶�� ���ڸ� ����Ѵ�
		
	} // end of main

} // end of class
