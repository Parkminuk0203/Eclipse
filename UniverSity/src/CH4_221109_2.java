import java.util.*;
public class CH4_221109_2 {

	public static void main(String[] args) {
		int max = -100, min = 1000;
		int[] arr = new int[20];
		Random rnd = new Random();
		int i;
		

		for(i=0; i<20; i++) { // ���� ���� 20��
				arr[i] = rnd.nextInt(101);
			}	
		// �ִ�, �ּҰ� ���ϱ�
		for(i=0; i<20; i++) {
			System.out.printf("%5d", arr[i]);
			if(min > arr[i]) {
				min = arr[i];
			}
			if(max < arr[i]) {
				max = arr[i];
			}
			if((i+1)%5==0) {
				System.out.println();
			}
		}
		System.out.println("�ּҰ�: "+min+" �ִ밪: "+max);
	} // end of main

} // end of class
