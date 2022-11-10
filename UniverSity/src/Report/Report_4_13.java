package Report;
import java.util.*;

public class Report_4_13 {

	public static void main(String[] args) {
//		13. {1.0, 2.0, 3.0, 4.0} 과 같은 초기값을 가지는 double형의 배열을 생성한다. 
//		for-each 반복 루프를 이용하여 모든 배열 요소를 출력하는 프로그램을 작성하라.
		int i;
		
		double[] array = {1.0, 2.0, 3.0, 4.0};
		for(i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
		
	} // end of main
} // end of class