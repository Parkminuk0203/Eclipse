import java.util.*;
public class D221014_9 {

	public static void main(String[] args) {
		Random rnd = new Random();
		int num = 0;
		for(int i=1;i<=6;i++) {
//			num = rnd.nextInt(101); // 0~100���� ���� ����, scailing
//			num = rnd.nextInt(50)*2+1; // Ȧ�� ����(2*n+1) 100���� Ȧ��
			num = rnd.nextInt(45)+1; // 1~45������ ����
			System.out.print(num + " ");
		}
		
		System.out.println(num);
	} // end of main

} // end of class
