package Report;
import java.util.*;
public class report_38 {
	
	public static void main(String[] args) {
//		24. �Ǻ���ġ ���� 
//		(3) ����ڿ��� �� ��° �ױ��� ����� �������� ����� 
//		�� �ױ����� ����ϵ��� ���� ���α׷��� �����϶�.
		Scanner sc = new Scanner(System.in);
		long a = 0, b = 1, c = 0;
		int i = 0;
		int n = 0;
		
		System.out.print("���° �ױ��� ����Ͻðڽ��ϱ�?: ");
		n = sc.nextInt();
		
		for (i=2; i<=n; i++) {
			c = a+b;
			a = b;
			b = c;
		}
		System.out.println(n+" ��° ����: "+c);
	}
}