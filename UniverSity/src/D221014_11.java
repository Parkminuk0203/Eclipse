import java.util.*;
public class D221014_11 {

	public static void main(String[] args) {
//		2. ���� ����(60~100)�� ������ �����Ͽ� 25�� ����ϵ�, 
//		       ���ٿ� 5���� ��µǵ��� ���α׷��� �ϼ���. (���� ����)
		Random rnd = new Random();
		int num = 0;
		int i,j = 0;
		
		System.out.println("*** ���� ��� ***");
		for (i=1;i<=5;i++) {
			for (j=1;j<=5;j++) {
				num = rnd.nextInt(41)+60;
				System.out.printf("%d ",num);				
			}
			System.out.println();
		}
		
	} // end of main

} // end of class
