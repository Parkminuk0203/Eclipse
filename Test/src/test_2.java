import java.util.*;
 
public class test_2 {
	public static void main(String[] args) {
//		마일과 Km를 변환하는 프로그램을 작성하여라. (1 mile = 1.6 km)
		Scanner sc = new Scanner(System.in);
		double mile,km,tmp = 0;
		int score = 0;
		
		System.out.println("*** 변환할 메뉴 선택 ***");
		System.out.println("- 1.mile -> km");
		System.out.println("- 2.km -> mile");
		System.out.print("메뉴 선택: ");
		score = sc.nextInt();
		
		if (score == 1) {
			System.out.print("변환할 mile: ");
			mile = sc.nextInt();
			tmp = mile*1.6;
			System.out.printf("%.0f mile은 %.1f 입니다.",mile,tmp);
		} else if (score == 2) {
			System.out.print("변환할 km: ");
			km = sc.nextInt();
			tmp = km/1.6;
			System.out.printf("%.0f km은 %.1f 입니다.",km,tmp);
		}
	}
}