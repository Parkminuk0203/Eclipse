package Report;
import java.util.*;
public class report_33 {

	public static void main(String[] args) {
//		21. ��Ÿ����� ������ ���� �ﰢ������ ������ �� �� ���� ���̸� a,b��� �ϰ�, ������ ���̸� c��� �ϸ�
//		a^2 + b^2 = c^2�� ������ �����Ѵٴ� ���̴�.
//		�� ���� ���̰� 100���� ���� �ﰢ�� �߿��� ��Ÿ����� ������ �����ϴ� ���� �ﰢ���� �� ���� ������?
//		3�� �ݺ����� �̿��Ͽ� ��Ÿ����� ������ �����ϴ� 3���� ������ ã���� �Ѵ�.
		
		int count = 0;
		for (int a=1; a<100; a++) {
			for (int b=1; b<100; b++) {
				for (int c=1; c<100; c++) {
					if(a*a+b*b == c*c) {
						count++;
						System.out.printf("%d, %d, %d\n",a,b,c);
					}
				}
			}
		}
		System.out.printf("��Ÿ��� ���� �����ϴ� �����ﰢ���� %d�� �Դϴ�.\n",count);
	} // end of main
} // end of class
