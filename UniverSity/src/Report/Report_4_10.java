package Report;

import java.util.*;

public class Report_4_10 {

	public static void main(String[] args) {
//		10. ������ ���� �ڵ尡 ����Ǿ��ٰ� �� ��, null�� �ƴ� ������ �� ���� �����ϴ°�?
		int i; 
		
		String[] employees = new String[10]; // 0~9���� ����
		String name = "ȫ�浿";
		employees[0] = name; // �ε��� 0���� ����
		name = null;
		
		for(i=0;i<employees.length;i++) {
			System.out.println(employees[i]);
		}
//		ȫ�浿 1��, null 9���� ��µǴ� ���� Ȯ���� �� �ִ�.

	} // end of main
} // end of class