package Report;
import java.util.*;
public class report_26 {

	public static void main(String[] args) {
//		14. Ű���忡�� ������ �ϳ��� �о ������ ������ �����ϴ� ���α׷��� �ۼ��Ͽ� ����. switch ���� ����Ͽ� ���ڸ� �����Ѵ�.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �ϳ��� �Է��ϼ���. : ");
		String str = sc.next();
		
		switch (str) {
		case "A": case "a": 	case "E": case "e":
		case "I": case "i":		case "O": case "o":
		case "U": case "u":
			System.out.println("ù���ڴ� �����Դϴ�.");
			break;
		default :
			System.out.println("ù���ڴ� �����Դϴ�.");
		} // end of switch
		
	} // end of main

} // end of class
