import java.util.*;
 
public class test_2 {
	public static void main(String[] args) {
//		���ϰ� Km�� ��ȯ�ϴ� ���α׷��� �ۼ��Ͽ���. (1 mile = 1.6 km)
		Scanner sc = new Scanner(System.in);
		double mile,km,tmp = 0;
		int score = 0;
		
		System.out.println("*** ��ȯ�� �޴� ���� ***");
		System.out.println("- 1.mile -> km");
		System.out.println("- 2.km -> mile");
		System.out.print("�޴� ����: ");
		score = sc.nextInt();
		
		if (score == 1) {
			System.out.print("��ȯ�� mile: ");
			mile = sc.nextInt();
			tmp = mile*1.6;
			System.out.printf("%.0f mile�� %.1f �Դϴ�.",mile,tmp);
		} else if (score == 2) {
			System.out.print("��ȯ�� km: ");
			km = sc.nextInt();
			tmp = km/1.6;
			System.out.printf("%.0f km�� %.1f �Դϴ�.",km,tmp);
		}
	}
}