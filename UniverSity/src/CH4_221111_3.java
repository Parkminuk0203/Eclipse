import java.util.*;

public class CH4_221111_3 {

	public static void main(String[] args) {
//	�̸��� ��ȭ��ȣ�� ���, �˻�, ����ϴ� ���α׷� �ۼ�
		Scanner sc = new Scanner(System.in);
		String[] name = new String[10];
		String[] ph = new String[10];
		String search;
		int menu = 0, count = 0, i = 0;
		while (true) {

			do {
				System.out.println("===== ���� �ּҷ� �޴� =====");
				System.out.println("1. ���");
				System.out.println("2. �˻�");
				System.out.println("3. ���");
				System.out.println("4. ����");
				System.out.println("======================");
				System.out.print("- �޴� ���� : ");
				menu = sc.nextInt();
			} while (menu < 1 || menu > 4);
			switch (menu) {
			case 1:
				System.out.println("=== �ּҷ� ��� ===");
				System.out.print("- ����� �̸� : ");
				name[count] = sc.next();
				System.out.print("- ����� ��ȭ��ȣ : ");
				ph[count] = sc.next();
				count++;
				break;
			case 2:
				System.out.print("- �˻��� �̸�  : ");
				search = sc.next();
				for (i = 0; i < count; i++) {
					if (search.equals(name[i])) {
						System.out.println("- " + search + " ��ȭ��ȣ : " + ph[i]);
					} else {
						System.out.println(search + "�̸��� ã�� �� �����ϴ�.");
					}
				}
				break;
			case 3:
				System.out.println("===== �ּҷ� ��� =====");
				for (i = 0; i < count; i++) {
					System.out.println(name[i] + " " + ph[i]);
				}
				System.out.print("\n\n\n\n");
				break;
			case 4:
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}
			if(menu == 4) {
				break;
			}
		}
	} // end of main

} // end of class