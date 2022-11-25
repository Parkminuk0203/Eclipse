package Report;
import java.util.*;

public class report_bingo_2 {

	public static void main(String[] args) throws InterruptedException {
		Random rnd = new Random();
		int[][] bingo = new int[5][5]; // 5*5크기의 2차원 배열 생성
		int[] freq = new int[26]; // 중복 제거를 위한 1차원 배열
		int[] select = new int[25]; // 선택된 수를 저장할 배열
		int i = 0, j = 0, num = 0, tmp = 0, count = 0, sum = 0, index = 0, count2 = 0;

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
		} // end of for i

		// 배열 출력
		System.out.println("--------------------------");
		for (i = 0; i < bingo.length; i++) {
			System.out.print("|");
			for (j = 0; j < bingo[i].length; j++) {
				System.out.printf(" %-2d |", bingo[i][j]);
			} // end of for j
			System.out.println();
			System.out.println("--------------------------");
		} // end of for i

		// 중복된 값 제거
		while (count < 3) {
			// 숫자를 뽑기위한 코드, 중복제거
			tmp = rnd.nextInt(25) + 1; // 1~25
			if (freq[tmp] == 1) {
				freq[tmp] = 0;
			} else {
				continue;
			}
			count2++; 
			count = 0;
			select[index++] = tmp;
			
			// 값을 비교하여 별 찍기
			System.out.println("\n--------------------------");
			for (i = 0; i < bingo.length; i++) {
				System.out.print("|");
				for (j = 0; j < bingo[i].length; j++) {
					if (tmp == bingo[i][j]) {
						bingo[i][j] = -1; // bingo[인덱스][인덱스] -> -1
					}
					if (bingo[i][j] == -1) {
						System.out.printf(" %-2s |", "*");
					} else {
						System.out.printf(" %-2d |", bingo[i][j]);
					}
				} // end of for j
				System.out.println();
				System.out.println("--------------------------");
			} // end of for i

			// 가로
			for (i = 0; i < bingo.length; i++) {
				for (j = 0; j < bingo[i].length; j++) {
					sum += bingo[i][j];
					if (sum == -5) {
						count++;
					}
				}
				sum = 0;
			}

			// 세로
			for (i = 0; i < bingo.length; i++) {
				for (j = 0; j < bingo[i].length; j++) {
					sum += bingo[j][i];
					if (sum == -5) {
						count++;
					}
				}
				sum = 0;
			}

			// 대각선
			for (i = 0; i < bingo.length; i++) {
				sum += bingo[i][i];
			}
			if (sum == -5) {
				count++;
			}
			sum = 0;

			for (i = 0; i < bingo.length; i++) {
				sum += bingo[i][4 - i];
			}
			if (sum == -5) {
				count++;
			}
			sum = 0;

			// 선택된 수 출력
			System.out.printf("선택된 수 : ");
			for (i = 0; i < select.length; i++) {
				if (select[i] == 0) {
					continue;
				} else {
					System.out.print(select[i] + " ");
				}
			}
			Thread.sleep(1000); // 1초마다 실행
		} // end of while
		System.out.printf("%d번째 빙고!", count2);
	} // end of main

} // end of class
