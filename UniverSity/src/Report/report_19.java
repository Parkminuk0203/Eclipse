package Report;
import java.util.*;
public class report_19 {

	public static void main(String[] args) {
//		8. ������ �ڵ带 ���캸�� ������ ���Ͻÿ�.
//		(2) ���� �ڵ带 �����ϴ� ��ü ���α׷��� �ۼ��϶�. 
//		���� x�� �����ϰ� �ʱⰪ�� 3�����϶�. ���α׷��� ����� �����ΰ�? ������ �����϶�
		
		int x = 3;
		
		if (x >= 0) 						 // ���� x�� 0���� ũ�ų� ������
			if (x == 0) 					 // �� ������ �����ϰ� ���� x�� 0�̸�
				System.out.println("first"); // first�� ����϶�.
		else System.out.println("second");   // �ƴϸ� second�� ����϶�.
		System.out.println("third");		 // �׳� third�� ����϶�. (���ǹ� ���̶� ������ ���)
		
	} // end of main

} // end of class
