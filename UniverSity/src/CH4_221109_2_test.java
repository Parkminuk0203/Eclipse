import java.util.*;
public class CH4_221109_2_test {

	public static void main(String[] args) {
//	난수 20개를 만들고 최소값, 최대값 구하기
	int max = -999999, min = 999999, i=0;
	int[] random = new int[20];
	Random rnd = new Random();
	
	// 난수 생성
	for(i=0;i<random.length;i++) {
		random[i] = rnd.nextInt(100)+1; // 1~100
	}
	
	// 5*5 크기의 난수 출력
	for(i=0;i<random.length;i++) {
		System.out.printf("%5d",random[i]);
		if((i+1) % 5 == 0) {
			System.out.println();
		}
	}
	
	//최소값과 최대값 구하기
	for(i=0;i<random.length;i++) {
		if(max < random[i]) {
			max = random[i];
		}
		if(min > random[i]) {
			min = random[i];
		}
	}
	
	System.out.print("최소값:"+min+" 최대값:"+max);
	} // end of main

} // end of class
