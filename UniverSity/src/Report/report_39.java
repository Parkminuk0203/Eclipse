package Report;
import java.util.*;
public class report_39 {
	
	public static void main(String[] args) {
//		25. (1 + 1/2 + 1/3 + ... + 1/n ) �� ���� ��ȭ ������ ���� ����ϴ� ���α׷��� �ۼ��Ͽ� ����. 
//		n�� ���Ѵ밡 �Ǹ� ������ ���� ��� �ɱ�?-> ���Ѵ밡 ��! ��ȭ ������ �� ���� ����
//		�۾����� 0�� �Ѿ��� ����������� �� ������ ���� ���Ѵ밡 �ȴ�. 
		Scanner sc = new Scanner(System.in);
		double i = 0;
		double sum = 0;
		double n = 0;

		System.out.print("n�� �Է��Ͻÿ�: ");
		n = sc.nextDouble();
		
		for (i=1; i<=n; i++) {
			sum += 1/i;
		}
		System.out.println(sum);
	}
	
}