import java.util.*;
public class CH4_221109_3_test {

	public static void main(String[] args) {
//	�ֻ����� 100�� ������ ������ ���� 20���� ����Ͽ���
	Random rnd = new Random();
	int i=0;
	int[] dice = new int[100]; // 100���� ���� �������
	int[] freq = new int[7];   // �󵵹迭
	
	System.out.println("#### �ֻ��� 100�� ���� ��� ####");

	// ���� ����
	for(i=0;i<100;i++) {
		dice[i] = rnd.nextInt(6)+1; // 1~6��
	}
	for(i=0;i<dice.length;i++) { 
		freq[dice[i]]++;   // <--- ���ذ� �� �ȵ�
	}
	for(i=1;i<7;i++) {
		System.out.println(i+" : " + freq[i] + "��");
	}
	
	
	} // end of main

} // end of class
