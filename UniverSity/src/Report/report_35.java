package Report;
import java.util.*;
public class report_35 {

	public static void main(String[] args) {
//		23. ������ ���� ���α׷��� �ۼ��Ͽ� ����. ���� ����ڷκ��� �ϳ��� ���ڸ� �Է¹޴´�. �̾ ����ڷκ��� 2���� ���ڸ� �Է¹޴´�. 
//		����ڷκ��� ���� ���ڰ� ��+'�̸� �μ��� ������, ���ڰ� ��-'�̸� ������
//		���ڰ� ��*'�̸� ������, ���ڰ� ��/���̸� �������� �����ϵ��� �ۼ��϶�. 
//		if-else ���� ����϶�. �������� ���, �и� 0�� �ƴ����� ���� �˻��Ͽ��� �Ѵ�.
		Scanner input = new Scanner(System.in);
		int a,b;
		String z;
		
		System.out.print("���ϴ� ������ �Է��Ͻÿ�(+,-,*,/) : ");
		z = input.next();
		System.out.print("������ ù��° ���� �Է��Ͻÿ� : ");
		a = input.nextInt();
		System.out.print("������ �ι��� ���� �Է��Ͻÿ� : ");
		b = input.nextInt();
		
		if (z.equals("+")) {
			System.out.printf("%d %s %d = %d",a,z,b,a+b); 
		} else if (z.equals("-")) {			
		   System.out.printf("%d %s %d = %d",a,z,b,a-b); 
		} else if (z.equals("*")) {
		   System.out.printf("%d %s %d = %d",a,z,b,a*b); 
		} else if (z.equals("/")) {
			if (b==0) {
				System.out.printf("�и� 0�̹Ƿ� ������ �� �����ϴ�."); 
			} else {				
			    System.out.printf("%d %s %d = %d",a,z,b,a/b);
			}
		}
	}
}
