import java.util.*;
public class CH4_221028_6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		String[] toppings = { "Pepperoni", "Mushrooms", "Onions", "Sausage", "Bacon" };
//		toppings[3] = sc.next();
//		toppings[4] = sc.next(); // next�� �����̽��� ���еǾ 3���� �����̽� �Է��ϸ� 4���� �Ѿ��
//		toppings[4] = sc.nextLine(); // ���⵵ ��� ���� ĥ�� ���� �Է� ����
		String[] toppings = new String[5];
		
		for (int i=0; i < toppings.length; i++) {
			System.out.print((i+1) + "�� �޴� : ");
			toppings[i] = sc.nextLine();
		}
		for (int i=0; i < toppings.length; i++) {
			System.out.print(toppings[i]+" ");
		}
	} // end of main

} // end of class
