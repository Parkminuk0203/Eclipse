package Report;

import java.util.*;

public class report2_1 {

	public static void main(String[] args) {
//���������� ������ �����Ͽ� ����� ī��Ʈ�ϴ� ���α׷��� �ۼ�
		Random rnd = new Random();
		Scanner sc = new Scanner(System.in);
		int usr = 0, com = 0, com_count = 0, usr_count = 0;

		do {
			com = rnd.nextInt(3) + 1;
			System.out.print("����� ����(1:����, 2:����, 3:��) : ");
			usr = sc.nextInt();
			System.out.println("��ǻ�� : " + com + " ����� : " + usr);

			if (com % 3 == (usr + 1) % 3) {
				System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
				com_count++;
			} else if (com == usr) {
				System.out.println("�����ϴ�.");
			} else {
				System.out.println("����ڰ� �̰���ϴ�.");
				usr_count++;
			}
			System.out.println("���ھ� : (��)" + com_count + " : " + usr_count + "(�����)");
		} while (com_count < 3 && usr_count < 3);
		if (com_count == 3) {
			System.out.println("***** ��ǻ�� �¸� *****");
		} else {
			System.out.println("***** ����� �¸� *****");
		}

	} // end of main

} // end of class
