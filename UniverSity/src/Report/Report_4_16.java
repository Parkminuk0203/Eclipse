package Report;
import java.util.*;

public class Report_4_16 {

	public static void main(String[] args) {
//		16. 2���� ���� �迭�� �����ϰ� Arrays Ŭ������ equals()�� �̿��Ͽ� 
//		2���� �迭�� �������� �˻��ϴ� ���α׷��� �ۼ��϶�. 
		Random rnd = new Random();
		int[] arr1 = new int[10];
		int[] arr2 = new int[10];
		int i;
		
		for(i=0; i<10; i++) { // ���� ���� 10��
			arr1[i] = rnd.nextInt(10)+1; // 1~10���� ���� ����
			arr2[i] = rnd.nextInt(10)+1; // 1~10���� ���� ����
		}
		System.out.print("arr1 = ");
		for(i=0; i<arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println();
		System.out.print("arr2 = ");
		for(i=0; i<arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
		System.out.println();
		System.out.println(Arrays.equals(arr1, arr2));
	} // end of main
} // end of class