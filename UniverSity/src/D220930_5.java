import java.util.*;
public class D220930_5 {

	public static void main(String[] args) {
//		���� �ϼ��� ���
		Scanner sc = new Scanner(System.in);
		
		String month;
		int monthnumber;
		
		System.out.println("���� �̸��� �Է��Ͻÿ�.");
		month = sc.next(); // �Է¹��� ���� ���ڿ��� ����
		
		switch (month) {
		case "january" :
			monthnumber = 1;
			break;
		case "february" :
			monthnumber = 2;
			break;
		case "march" :
			monthnumber = 3;
			break;
		default :
			monthnumber = 0;
		}
		System.out.println(monthnumber);
			
		
	
	} // end of main

} // end of class
