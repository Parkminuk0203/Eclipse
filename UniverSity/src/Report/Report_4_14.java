package Report;
import java.util.*;

public class Report_4_14 {

	public static void main(String[] args) {
//		14. Arrays Ŭ������ sort()�� ����ϸ� �迭 ��ҵ��� ũ�� ������ ������ �� �ִ�. 
//		�� Arrays Ŭ������ binarySearch()�� �̿��ϸ� Ư���� ���� Ž���� �� �ִ�. 
//		{ 9, 8, 7, 6, 5, 4, 3, 2, 1 }�� ���� ������ �迭�� �����ϰ� �迭�� �����ϰ� 
//		3�� Ž���ϴ� �ڵ带 �ۼ��غ���.
		int i;
		
		int[] array = {9,8,7,6,5,4,3,2,1};
		Arrays.sort(array);
		for(i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println();
		System.out.println("3�� ��ġ: " + Arrays.binarySearch(array, 3));
		
	} // end of main
} // end of class