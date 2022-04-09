import java.util.Arrays; //ctrl+shift+o 자동으로 import문 추가

public class Ex5_1_2 {

	public static void main(String[] args) {
		int[] iArr = {100, 95, 80, 70, 60}; //길이가 5인 int배열
//		System.out.println(iArr); 
		//[I@2a139a55 출력.
		for(int i=0;i<iArr.length;i++) {
			System.out.println(iArr[i]);
//			100
//			95
//			80
//			70
//			60
		} //end of for
		System.out.println(Arrays.toString(iArr));
		// [100, 95, 80, 70, 60] 출력.
	} //end of main
} //end of class
