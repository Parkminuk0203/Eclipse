package Report;
import java.util.*;

public class Report_4_12 {

	public static void main(String[] args) {
//		12. {1.0, 2.0, 3.0, 4.0} �� ���� �ʱⰪ�� ������ double���� �迭�� �����Ѵ�. 
//		��� �迭 ��Ҹ� ����� �Ŀ� ��� ��Ҹ� ���Ͽ� ���� ����ϰ� 
//		��� �߿��� ���� ū ���� ã�Ƽ� ����ϴ� ���α׷��� �ۼ��϶�.
		
		double[] array = {1.0,2.0,3.0,4.0};
		double sum = 0, max = 0;
		int i;
		
		for(i=0;i<array.length;i++) {
			System.out.print(array[i] + " ");
			sum += array[i];
			if(max < array[i]) {
				max = array[i];
			}
		}
		System.out.println();
		System.out.println("���� " + sum);
		System.out.println("�ִ밪�� " + max);
	} // end of main
} // end of class