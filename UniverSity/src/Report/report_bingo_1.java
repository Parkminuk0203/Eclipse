package Report;
import java.util.*;

public class report_bingo_1 {

	public static void main(String[] args) {
		Random rnd = new Random();
		int[][] bingo = new int[5][5]; // 5*5크기의 2차원 배열 생성
		int[] freq = new int[26]; // 중복 제거를 위한 1차원 배열
		int i = 0, j = 0, num = 0;

		// 중복된 값 제거
		for (i = 0; i < bingo.length; i++) {
			for (j = 0; j < bingo[i].length; j++) {
				num = rnd.nextInt(25) + 1; // 1~25의 난수 생성
				if (freq[num] == 0) { // 만약 freq[num]이 0가 같으면
					freq[num] = 1; // freq[num] 값을 1로 바꾸고
					bingo[i][j] = num; // num에 나온 난수 값을 2차원 빙고 배열에 대입한다.
				} else { // 아니면
					j--; // j--를 하여 중복을 한번 더 실행
				}
			} // end of for j
		} // end of for k
		
		// 배열 출력
		System.out.println("----------------");
		for (i = 0; i < bingo.length; i++) {
			System.out.print("|");
			for (j = 0; j < bingo[i].length; j++) {
				System.out.printf("%-2d|",bingo[i][j]);
			} // end of for j
			System.out.println();
			System.out.println("----------------");
		} // end of for k

	} // end of main
} // end of class
