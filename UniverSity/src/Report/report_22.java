package Report;
import java.util.*;
public class report_22 {

	public static void main(String[] args) {
//		10. ����ڰ� �Է��� ���� 1, 2,... , 9�̸� "ONE", "TWO",... , "NINE"�� ���� 
//		����ϴ� ���α׷��� �ۼ��϶�. 1���� 9���̰� �ƴϸ� ��OTHER���� ����Ѵ�.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ���: ");
		int num = sc.nextInt();
		
		switch (num) {
		case 1 :
			System.out.println("ONE");
			break;
		case 2 :
			System.out.println("TWO");
			break;
		case 3 :
			System.out.println("THREE");
			break;
		case 4 :
			System.out.println("FOUR");
			break;
		case 5 :
			System.out.println("FIVE");
			break;
		case 6 :
			System.out.println("SIX");
			break;
		case 7 :
			System.out.println("SEVEN");
			break;
		case 8 :
			System.out.println("EIGHT");
			break;
		case 9 :
			System.out.println("NINE");
			break;
		default :
			System.out.println("OTHER");
		}
	} // end of main

} // end of class
