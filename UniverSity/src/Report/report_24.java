package Report;
import java.util.*;
public class report_24 {

	public static void main(String[] args) {
//		12. 3���� ���ڸ� �޾Ƽ� ũ�� ������ �����ϴ� ���α׷��� �ۼ��Ͽ� ����. if-else�� ����Ѵ�.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է��Ͻÿ�: ");
		int a = sc.nextInt();
		System.out.print("������ �Է��Ͻÿ�: ");
		int b = sc.nextInt();
		System.out.print("������ �Է��Ͻÿ�: ");
		int c = sc.nextInt();
		
		if (a > b) {
			if(a > c) {
				if(b > c) 
					System.out.printf("���ĵ� ���� : %d, %d, %d",a,b,c); 
				else 
					System.out.printf("���ĵ� ���� : %d, %d, %d",a,c,b); 				
			}
			else 
				System.out.printf("���ĵ� ���� : %d, %d, %d",c,a,b); 
		}
		else if (b > c) {
			if ( b > a ) {
				if (a > c) 
					System.out.printf("���ĵ� ���� : %d, %d, %d",b,a,c);					
				
				else
					System.out.printf("���ĵ� ���� : %d, %d, %d",a,b,c); 
			}
		}
		else
			System.out.printf("���ĵ� ���� : %d, %d, %d",c,b,a); 
	} // end of main

} // end of class
