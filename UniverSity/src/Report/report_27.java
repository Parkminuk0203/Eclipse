package Report;
import java.util.*;
public class report_27 {

	public static void main(String[] args) {
//		15. ����ڷκ��� Ű�� �Է¹޾Ƽ�  ǥ�� ü���� ����� �Ŀ� ������� ü�߰� ���Ͽ� 
//		��ü������, ǥ������, ��ü�������� �Ǵ��ϴ� ���α׷��� �ۼ��϶�. 
//		ǥ�� ü�� ������ ������ ����϶�. 
//		ǥ�� ü�� = (Ű - 100) * 0.9������
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ű�� �Է��Ͻÿ�: ");
		double h = sc.nextDouble();
		System.out.print("�����Ը� �Է��Ͻÿ�: ");
		double w = sc.nextDouble();

		double avg = (h-100)*0.9;
		System.out.printf("ǥ��ü���� %.1f\n",avg);
		
		if (w > avg) {
			System.out.println("��ü�� �Դϴ�.");
		} 
		else if (w < avg) {
			System.out.println("��ü�� �Դϴ�.");
		}
		else {
			System.out.println("���� �Դϴ�.");
		}
		
		
	} // end of main

} // end of class
