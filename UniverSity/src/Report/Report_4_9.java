package Report;
import java.util.*;

public class Report_4_9 {

	public static void main(String[] args) {
//		9. ���� �ڵ�� �迭 a�� �迭 b�� �����Ϸ��� �ǵ��� �ۼ��Ǿ���. 
//		���� �迭�� ����Ǵ°�? ���� �ùٸ��� �ʴٸ� �ùٸ��� ����ǵ��� �ڵ带 �����϶�.
		int i;
		int[] a = { 1, 2, 3, 4, 5 };
		int[] b = new int[5];
//		b = a; // b�� ���� ���� a�� �ٲٴ� ������ ������ ���� ����Ǵ� ���� �ƴ�.
		
		for(i=0;i<a.length;i++) {
			b[i] = a[i];
			System.out.println(b[i]);
		}
		
	} // end of main
} // end of class