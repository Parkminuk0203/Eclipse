package Report;
import java.util.*;

public class Report_4_9 {

	public static void main(String[] args) {
//		9. 다음 코드는 배열 a를 배열 b로 복사하려는 의도로 작성되었다. 
//		실제 배열이 복사되는가? 만약 올바르지 않다면 올바르게 복사되도록 코드를 수정하라.
		int i;
		int[] a = { 1, 2, 3, 4, 5 };
		int[] b = new int[5];
//		b = a; // b의 참조 값을 a로 바꾸는 것으로 실제로 값이 복사되는 것이 아님.
		
		for(i=0;i<a.length;i++) {
			b[i] = a[i];
			System.out.println(b[i]);
		}
		
	} // end of main
} // end of class