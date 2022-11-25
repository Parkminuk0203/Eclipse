package Report;
import java.util.*;

public class report_bingo_2 {

	public static void main(String[] args) throws InterruptedException {
		Random rnd = new Random();
		int[][] bingo = new int[5][5]; // 5*5ũ���� 2���� �迭 ����
		int[] freq = new int[26]; // �ߺ� ���Ÿ� ���� 1���� �迭
		int[] select = new int[25]; // ���õ� ���� ������ �迭
		int i = 0, j = 0, num = 0, tmp = 0, count = 0, sum = 0, index = 0, count2 = 0;

		// �ߺ��� �� ����
		for (i = 0; i < bingo.length; i++) {
			for (j = 0; j < bingo[i].length; j++) {
				num = rnd.nextInt(25) + 1; // 1~25�� ���� ����
				if (freq[num] == 0) { // ���� freq[num]�� 0�� ������
					freq[num] = 1; // freq[num] ���� 1�� �ٲٰ�
					bingo[i][j] = num; // num�� ���� ���� ���� 2���� ���� �迭�� �����Ѵ�.
				} else { // �ƴϸ�
					j--; // j--�� �Ͽ� �ߺ��� �ѹ� �� ����
				}
			} // end of for j
		} // end of for i

		// �迭 ���
		System.out.println("--------------------------");
		for (i = 0; i < bingo.length; i++) {
			System.out.print("|");
			for (j = 0; j < bingo[i].length; j++) {
				System.out.printf(" %-2d |", bingo[i][j]);
			} // end of for j
			System.out.println();
			System.out.println("--------------------------");
		} // end of for i

		// �ߺ��� �� ����
		while (count < 3) {
			// ���ڸ� �̱����� �ڵ�, �ߺ�����
			tmp = rnd.nextInt(25) + 1; // 1~25
			if (freq[tmp] == 1) {
				freq[tmp] = 0;
			} else {
				continue;
			}
			count2++; 
			count = 0;
			select[index++] = tmp;
			
			// ���� ���Ͽ� �� ���
			System.out.println("\n--------------------------");
			for (i = 0; i < bingo.length; i++) {
				System.out.print("|");
				for (j = 0; j < bingo[i].length; j++) {
					if (tmp == bingo[i][j]) {
						bingo[i][j] = -1; // bingo[�ε���][�ε���] -> -1
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

			// ����
			for (i = 0; i < bingo.length; i++) {
				for (j = 0; j < bingo[i].length; j++) {
					sum += bingo[i][j];
					if (sum == -5) {
						count++;
					}
				}
				sum = 0;
			}

			// ����
			for (i = 0; i < bingo.length; i++) {
				for (j = 0; j < bingo[i].length; j++) {
					sum += bingo[j][i];
					if (sum == -5) {
						count++;
					}
				}
				sum = 0;
			}

			// �밢��
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

			// ���õ� �� ���
			System.out.printf("���õ� �� : ");
			for (i = 0; i < select.length; i++) {
				if (select[i] == 0) {
					continue;
				} else {
					System.out.print(select[i] + " ");
				}
			}
			Thread.sleep(1000); // 1�ʸ��� ����
		} // end of while
		System.out.printf("%d��° ����!", count2);
	} // end of main

} // end of class
