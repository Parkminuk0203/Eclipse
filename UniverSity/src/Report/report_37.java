package Report;
import java.util.*;
public class report_37 {

	public static void main(String[] args) {
//		24. �Ǻ���ġ ���� 
//		(2) ���� ���α׷����� �Ǻ���ġ ������ �� ���� ����ϵ��� ��¹��� �߰��϶�. 
		long a = 0, b = 1, c = 0;
		int i;

		 for(i = 2; i <= 10; i++){
		 c = a + b;// ���� a�� b�� ���Ͽ� ���� c�� �����Ѵ�.
		 a = b;// ���� b�� ���� ���� a�� �ű��.
		 b = c;// ���� c�� ���� ���� b�� �ű��.
		 System.out.println(i +" ��° �� : "+c);
		 }
	}
}
