package Report;
import java.util.*;

public class Report_4_16 {

	public static void main(String[] args) {
//		16. 2개의 정수 배열을 생성하고 Arrays 클래스의 equals()을 이용하여 
//		2개의 배열이 같은지를 검사하는 프로그램을 작성하라. 
		Random rnd = new Random();
		int[] arr1 = new int[10];
		int[] arr2 = new int[10];
		int i;
		
		for(i=0; i<10; i++) { // 난수 생성 10개
			arr1[i] = rnd.nextInt(10)+1; // 1~10까지 난수 생성
			arr2[i] = rnd.nextInt(10)+1; // 1~10까지 난수 생성
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