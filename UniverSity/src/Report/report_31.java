package Report;
import java.util.*;
public class report_31 {

	public static void main(String[] args) {
//		19. ������ ���� ���ǵǴ� �Լ��� �Լ����� ����Ͽ� ����. 
//		����ڷκ��� x���� �Է¹޾Ƽ� �Լ����� ����Ͽ� ȭ�鿡 ����Ѵ�. x�� �Ǽ��̴�.
		Scanner sc = new Scanner(System.in);
		int fx = 0;
		
		System.out.print("x�� �� �Է�: ");
		int x = sc.nextInt();
		
		if (x<=0) {
			fx = x*x*x-9*x+2;
			System.out.println(fx);
		}
		else {
			fx = 7*x+2;
			System.out.println(fx);
		}
		
	} // end of main

} // end of class
