import java.util.*;

public class CH4_221111_7 {

	public static void main(String[] args) {
//		배열의 복사
//		잘못된 예 
//		배열의 값은 시작 주소이다. 그러므로 배열 자체가 복사 되는 것이 아닌 주소값이 복사된 것!!
		int[] list = { 10, 20, 30, 40, 50 };
		int[] numbers = list;

		// 올바른 예
		int[] list_copy = Arrays.copyOf(list, list.length);
	} // end of main

} // end of class