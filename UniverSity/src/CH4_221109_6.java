import java.util.*;
public class CH4_221109_6 {

	public static void main(String[] args) {
		// ���� ���� �ý���
		final int size = 10;
		int[] seat = new int[size];
		int i;
		while (true) {
			System.out.println("----------");
			for(i=0; i<size; i++) {
				System.out.print(i+1 + " ");
			}
			System.out.println("\n----------");
			for(i=0; i<size; i++) {
				System.out.print(seat[i] + " ");
			}
			System.out.println("\n----------");
			System.out.print("���Ͻô� �ڼ� ��ȣ�� �Է��ϼ���(����� -1): ");
			Scanner sc = new Scanner(System.in);
			int s = sc.nextInt();
			if(s == -1) {
				break;
			}
			if(seat[s-1]==0) {
				seat[s-1]=1;
				System.out.println("����Ǿ����ϴ�.");
			}
			else {
				System.out.println("�̹� ����� �ڸ��Դϴ�.");
			}
		}
	} // end of main

} // end of class