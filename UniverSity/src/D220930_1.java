import java.util.*;
public class D220930_1 {

	public static void main(String[] args) {
//		수직선에 있는 한 점의 좌표(x, y)를 입력받아 사분면을 출력하는 프로그램을 작성하여라
		Scanner sc = new Scanner(System.in);
		
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		
		System.out.println("*** 점의 좌표를 입력하세요 ***");
		System.out.print("- X 좌표 : ");
			num1 = sc.nextInt();
		System.out.print("- Y 좌표 : ");
			num2 = sc.nextInt();
		
		if (num1 > 0 && num2 > 0) {
			num3 = 1;
		}
		if (num1 < 0 && num2 > 0) {
			num3 = 2;
		}
		if (num1 < 0 && num2 < 0) {
			num3 = 3;
		}
		if (num1 > 0 && num2 < 0) {
			num3 = 4;
		}
		System.out.printf("좌표[%d,%d]은 %d사분면의 점입니다.",num1,num2,num3);
	}

}
