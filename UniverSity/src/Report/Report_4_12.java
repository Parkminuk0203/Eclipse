package Report;
import java.util.*;

public class Report_4_12 {

	public static void main(String[] args) {
//		12. {1.0, 2.0, 3.0, 4.0} 과 같은 초기값을 가지는 double형의 배열을 생성한다. 
//		모든 배열 요소를 출력한 후에 모든 요소를 더하여 합을 출력하고 
//		요소 중에서 가장 큰 값을 찾아서 출력하는 프로그램을 작성하라.
		
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
		System.out.println("합은 " + sum);
		System.out.println("최대값은 " + max);
	} // end of main
} // end of class