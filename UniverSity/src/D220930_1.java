import java.util.*;
public class D220930_1 {

	public static void main(String[] args) {
//		�������� �ִ� �� ���� ��ǥ(x, y)�� �Է¹޾� ��и��� ����ϴ� ���α׷��� �ۼ��Ͽ���
		Scanner sc = new Scanner(System.in);
		
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		
		System.out.println("*** ���� ��ǥ�� �Է��ϼ��� ***");
		System.out.print("- X ��ǥ : ");
			num1 = sc.nextInt();
		System.out.print("- Y ��ǥ : ");
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
		System.out.printf("��ǥ[%d,%d]�� %d��и��� ���Դϴ�.",num1,num2,num3);
	}

}
