import java.util.*;

public class D221014_14 {

	public static void main(String[] args) {
//	5. ����ڿ� ��ǻ�Ͱ� ���������� ������ ������ ���� �����ϵ��� ���α׷��� �Ͻÿ�.
		Random rnd = new Random();
		Scanner sc = new Scanner(System.in);
		int user, computer = 0;
		System.out.println("����� �Է�(1: ����, 2: ����, 3: ��): ");
		user = sc.nextInt();
		computer = rnd.nextInt(3) + 1;

		while (true) {
			if (user == 1 && computer == 1) {
				System.out.println("�����: ����, ��ǻ��: ����, \n�����ϴ�.");
				break;
			} else if (user == 1 && computer == 2) {
				System.out.println("�����: ����, ��ǻ��: ����, \n�����ϴ�.");
				break;
			} else if (user == 1 && computer == 3) {
				System.out.println("�����: ����, ��ǻ��: ��, \n�̰���ϴ�.");
				break;
			}
			if (user == 2 && computer == 2) {
				System.out.println("�����: ����, ��ǻ��: ����, \n�����ϴ�.");
				break;
			} else if (user == 2 && computer == 1) {
				System.out.println("�����: ����, ��ǻ��: ����, \n�̰���ϴ�.");
				break;
			} else if (user == 2 && computer == 3) {
				System.out.println("�����: ����, ��ǻ��: ��, \n�����ϴ�.");
				break;
			}
			if (user == 3 && computer == 3) {
				System.out.println("�����: ��, ��ǻ��: ��, \n�����ϴ�.");
				break;
			} else if (user == 3 && computer == 1) {
				System.out.println("�����: ��, ��ǻ��: ����, \n�����ϴ�.");
				break;
			} else if (user == 3 && computer == 2) {
				System.out.println("�����: ��, ��ǻ��: ����, \n�̰���ϴ�.");
				break;
			}
		}

	} // end of main

} // end of class
