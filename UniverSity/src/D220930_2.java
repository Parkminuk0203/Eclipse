import java.util.*;
public class D220930_2 {

	public static void main(String[] args) {
//		���ϰ� Km�� ��ȯ�ϴ� ���α׷��� �ۼ��Ͽ���. (1 mile = 1.6 km)
		Scanner sc = new Scanner(System.in);
		
		double mile = 0;
		double km = 0;
		int score = 0;
		double d = 0;
		
		System.out.println("*** ��ȯ�� �޴� ���� ***");
		System.out.println("- 1. mile -> km");
		System.out.println("- 2. km -> mile");
		System.out.print("- �޴� ���� : ");
			score = sc.nextInt();
		if (score == 1) {
			System.out.print("- ��ȯ�� mile : ");
			mile = sc.nextDouble();
			d = mile * 1.6;
			System.out.printf("%.0f mile�� %.1f km �Դϴ�.",mile,d);
		}
		
		if (score == 2) {
			System.out.print("��ȯ�� km : ");
			km = sc.nextDouble();
			d = km / 1.6;
			System.out.printf("%.0f km�� %.1f mile �Դϴ�.",km,d);
		}
	
	}

}
