import java.util.*;

public class CH4_221109_1_test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] name = { "ȫ�浿", "�ڹο�", "������", "�̼���", "�����" };
		String serch;
		int i=0;
		// �̸� ���
		for (i = 0; i < name.length; i++) {
			System.out.print(name[i] + " ");
		}
		System.out.print("\nã�� ����� �̸� : ");
		serch = sc.next();

		// ���ڿ� ��
		for (i = 0; i < name.length; i++) {
			if (name[i].equals(serch))	{
				break;
			}
		}
		if (i < name.length) {
			System.out.println(serch + "��" + (i + 1) + "��° ����Դϴ�.");
		} else {
			System.out.println(serch + "�� ã�� �� �����ϴ�.");
		}

	} // end of main

} // end of class
