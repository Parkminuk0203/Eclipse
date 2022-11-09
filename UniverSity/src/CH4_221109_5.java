import java.util.*;
public class CH4_221109_5 {

	public static void main(String[] args) {
//	주사위를 100번 던져서 나오는 수를 20개씩 출력하여라
		Random rnd = new Random();
		int[] arr = new int[100];
		int[] freq = new int[7];
		int i;
		
		for(i=0; i<100; i++) { // 난수 생성 100개
			arr[i] = rnd.nextInt(6)+1;
		}
		System.out.println("#### 주사위 100번 던진 결과 ####");
		for(i=0; i<7; i++)
			freq[i] = 0;
		for(i=0; i<100; i++)
			freq[arr[i]]++;
		for(i=1; i<7; i++) {
			System.out.print(i+" : " + freq[i] + "개 : ");
			for(int s=0; s<freq[i]; s++) {
				System.out.print("*");				
			}
			System.out.println();
		}
	} // end of main

} // end of class