import java.util.*;

public class CH4_221111_4 {

	public static void main(String[] args) {
// 	���� �迭
		System.out.println("���ڵ��� �� : " + sum(new int[] {1,2,3,4}));
	} // end of main
	
	public static int sum(int[] numbers) {
		int total = 0;
		for (int i=0; i<numbers.length; i++) {
			total = total + numbers[i];
		}
		return total;
	}

} // end of class

	
