import java.util.*;
public class CH4_221109_2_test {

	public static void main(String[] args) {
//	���� 20���� ����� �ּҰ�, �ִ밪 ���ϱ�
	int max = -999999, min = 999999, i=0;
	int[] random = new int[20];
	Random rnd = new Random();
	
	// ���� ����
	for(i=0;i<random.length;i++) {
		random[i] = rnd.nextInt(100)+1; // 1~100
	}
	
	// 5*5 ũ���� ���� ���
	for(i=0;i<random.length;i++) {
		System.out.printf("%5d",random[i]);
		if((i+1) % 5 == 0) {
			System.out.println();
		}
	}
	
	//�ּҰ��� �ִ밪 ���ϱ�
	for(i=0;i<random.length;i++) {
		if(max < random[i]) {
			max = random[i];
		}
		if(min > random[i]) {
			min = random[i];
		}
	}
	
	System.out.print("�ּҰ�:"+min+" �ִ밪:"+max);
	} // end of main

} // end of class
