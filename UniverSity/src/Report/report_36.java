package Report;
import java.util.*;
public class report_36 {

	public static void main(String[] args) {
//		24. �Ǻ���ġ ���� 
//		(1) ��ĭ�� ä��� �������ϰ� �����Ͽ� ����
		long a = 0, b = 1, c;
		int i;

		 for(i = 2; i <= 10; i++) {
		 c = a + b;// ���� a�� b�� ���Ͽ� ���� c�� �����Ѵ�.
		 a = b;// ���� b�� ���� ���� a�� �ű��.
		 b = c;// ���� c�� ���� ���� b�� �ű��.
		 }
	}
}
