import java.util.*;
public class CH4_221109_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i;
		String[] name = {"ȫ�浿","������","�̽¿�","������","�̽¸�"};
		String serch;
		
		for(i=0; i<5; i++) {
			System.out.print(name[i]+"  ");
		}
		System.out.print("\nã�� ����� �̸� : ");
		serch = sc.next();
		
		for(i=0; i<5; i++) {
			if(name[i].equals(serch)) {
				break;
			}
		}
		if(i<5) {
			System.out.println(serch + "�� " + (i+1) + "��° ����Դϴ�.");
		}
		else {
			System.out.println(serch + "�� ã�� �� �����ϴ�.");
		}
	} // end of main

} // end of class
