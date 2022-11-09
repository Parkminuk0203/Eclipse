import java.util.*;
public class CH4_221109_2 {

	public static void main(String[] args) {
		int max = -100, min = 1000;
		int[] arr = new int[20];
		Random rnd = new Random();
		int i;
		

		for(i=0; i<20; i++) { // 난수 생성 20개
				arr[i] = rnd.nextInt(101);
			}	
		// 최대, 최소값 구하기
		for(i=0; i<20; i++) {
			System.out.printf("%5d", arr[i]);
			if(min > arr[i]) {
				min = arr[i];
			}
			if(max < arr[i]) {
				max = arr[i];
			}
			if((i+1)%5==0) {
				System.out.println();
			}
		}
		System.out.println("최소값: "+min+" 최대값: "+max);
	} // end of main

} // end of class
