import java.util.*;
public class CH4_221109_3_test {

	public static void main(String[] args) {
//	주사위를 100번 던져서 나오는 수를 20개씩 출력하여라
	Random rnd = new Random();
	int i=0;
	int[] dice = new int[100]; // 100개의 난수 저장공간
	int[] freq = new int[7];   // 빈도배열
	
	System.out.println("#### 주사위 100번 던진 결과 ####");

	// 난수 생성
	for(i=0;i<100;i++) {
		dice[i] = rnd.nextInt(6)+1; // 1~6번
	}
	for(i=0;i<dice.length;i++) { 
		freq[dice[i]]++;   // <--- 이해가 잘 안됨
	}
	for(i=1;i<7;i++) {
		System.out.println(i+" : " + freq[i] + "개");
	}
	
	
	} // end of main

} // end of class
